package ty.pas.analy;


import com.sagittarius3.bean.result.*;
import com.sagittarius3.util.TimeUtil;
import tsinghua.thss.sdk3.core.KMXClient;
import tykj.userfn.UserFunctionMultipleSql2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EventCompare extends UserFunctionMultipleSql2 {
    @Override
    public void runOne(List<String> list, Map<String, Map<String, List<Map<String, String>>>> map, Map<String, Map<String, List<FloatPoint>>> map1, Map<String, Map<String, List<DoublePoint>>> map2, Map<String, Map<String, List<StringPoint>>> map3, Map<String, Map<String, List<IntPoint>>> map4, Map<String, Map<String, List<LongPoint>>> map5, Map<String, Map<String, List<BooleanPoint>>> map6, Map<String, Map<String, List<GeoPoint>>> map7, long l, long l1) {
        String device = list.get(0);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        List<Map<String, String>> sqlData = map.get("V_Msg_Event").get(device);
        if (sqlData.size()==0) {
            return;
        }
        //取出对应关系，sql字段-事件id-kmx工况,kmxid作为主键
        Map<String, List<Map<String, String>>> Link_T = map.get("EventKmxSql");
        List<HashMap<String, Object>> listout = new ArrayList<>();
        //用来将kmx的数据按照时间对齐
        List<AbstractPoint> alldata = new ArrayList<AbstractPoint>();

        // //存储存在值的kmx工况
        List<String> ValueKmxlist = new ArrayList<>();

        //region Description
        for (String KmxID : Link_T.keySet()) {
            String KmxType = Link_T.get(KmxID).get(0).get("KmxType");
            if (KmxType.equals("int")) {
                List<IntPoint> intPoints = map4.get(device).get(KmxID);
                if (intPoints != null && intPoints.size() > 0) {
                    alldata.addAll(intPoints);
                    ValueKmxlist.add(KmxID);
                }

            } else if (KmxType.equals("double")) {
                List<DoublePoint> floatPoints = map2.get(device).get(KmxID);
                if (floatPoints != null && floatPoints.size() > 0) {
                    alldata.addAll(floatPoints);
                    ValueKmxlist.add(KmxID);
                }
            } else if (KmxType.equals("long")) {
                List<LongPoint> longPoints = map5.get(device).get(KmxID);
                if (longPoints != null && longPoints.size() > 0) {
                    alldata.addAll(longPoints);
                    ValueKmxlist.add(KmxID);
                }
            }
        }
        //endregion
        //按照时间对齐
        Map<Long, List<AbstractPoint>> resultMap = alldata.stream().collect(
                Collectors.groupingBy(AbstractPoint::getPrimaryTime));
        //开始对比


        if (resultMap == null || ValueKmxlist == null || ValueKmxlist.size() == 0) {
            HashMap<String, Object> result = new HashMap<>();
            result.put("InfoType", "事件报告");
            result.put("Vcl_ID", device);
            result.put("kmx_value", "kmx无该设备数据");
            listout.add(result);
            outputSql.put("EventCompare", listout);
            return;
        }
        //region Description
        if (sqlData != null && sqlData.size() > 0) {
            //region Description
            for (Map<String, String> smap : sqlData) {
                int n=0;
                HashMap<String, Object> result = new HashMap<>();
                CompareData compareData = new CompareData();
                //获取信息生成时间
                String MsgERC_ID = smap.get("MsgERC_ID");
                String MsgERC_MsgTime = smap.get("MsgERC_MsgTime");
                String MsgERC_EventID = smap.get("MsgERC_SysE_ID");
                long time = 0L;
                try {
                    time = TimeUtil.string2Date(MsgERC_MsgTime);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                List<AbstractPoint> KmxData = new ArrayList<>();
                if (resultMap != null)
                    KmxData = resultMap.get(time);
                if (KmxData == null || KmxData.size() == 0) {
                    result.put("InfoType", "事件报告");
                    result.put("Vcl_ID", device);
                    result.put("MsgTime", MsgERC_MsgTime);
                    result.put("sql_id", "MsgERC_ID");
                    result.put("sql_value", MsgERC_ID);
                    result.put("kmx_value", "KMX无数据");
                    listout.add(result);
                    result = new HashMap<>();
                } else {
                    //取出kmx工况
                    for (String KmxID : Link_T.keySet()) {
                        //获取sql对应字段
                        String Sqlcolname;
                        Sqlcolname = Link_T.get(KmxID).get(0).get("SqlID");
                        //获取事件ID
                        String EventID = Link_T.get(KmxID).get(0).get("EventID");

                        //获取sql对应的值
                        String sql_value = smap.get(Sqlcolname);
                        String KmxType = Link_T.get(KmxID).get(0).get("KmxType");

                        //region Description
                        for (AbstractPoint kmxpoint : KmxData) {
                            //获取kmx值
                            if (kmxpoint.getMetric().equals(KmxID) && MsgERC_EventID.equals(EventID)) {
                                //判断类型
                                if (KmxType.equals("int")) {
                                    IntPoint itp = (IntPoint) kmxpoint;
                                    String value = String.valueOf(itp.getValue());
                                    if (sql_value == null && value != null) {
                                        result.put("InfoType", "事件报告");
                                        result.put("Vcl_ID", device);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", Sqlcolname);
                                        result.put("kmx_id", KmxID);
                                        result.put("sql_value", null);
                                        result.put("kmx_value", value);
                                        listout.add(result);
                                        result = new HashMap<>();
                                    } else if (sql_value != null && value == null) {
                                        result.put("InfoType", "事件报告");
                                        result.put("Vcl_ID", device);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", Sqlcolname);
                                        result.put("kmx_id", KmxID);
                                        result.put("sql_value", sql_value);
                                        result.put("kmx_value", null);
                                        listout.add(result);
                                        result = new HashMap<>();
                                    } else {
                                        if (!compareData.CompareInt(sql_value, value)) {
                                            n++;
                                            result.put("InfoType", "事件报告");
                                            result.put("Vcl_ID", device);
                                            result.put("MsgTime", MsgERC_MsgTime);
                                            result.put("sql_id", Sqlcolname);
                                            result.put("kmx_id", KmxID);
                                            result.put("sql_value", sql_value);
                                            result.put("kmx_value", value);
                                            listout.add(result);
                                            result = new HashMap<>();
                                        }
                                    }
                                } else if (KmxType.equals("float")) {
                                    FloatPoint itp = (FloatPoint) kmxpoint;
                                    String value = String.valueOf(itp.getValue());
                                    if (sql_value == null && value != null) {
                                        result.put("InfoType", "事件报告");
                                        result.put("Vcl_ID", device);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", Sqlcolname);
                                        result.put("kmx_id", KmxID);
                                        result.put("sql_value", null);
                                        result.put("kmx_value", value);
                                        listout.add(result);
                                        result = new HashMap<>();
                                    } else if (sql_value != null && value == null) {
                                        result.put("InfoType", "事件报告");
                                        result.put("Vcl_ID", device);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", Sqlcolname);
                                        result.put("kmx_id", KmxID);
                                        result.put("sql_value", sql_value);
                                        result.put("kmx_value", null);
                                        listout.add(result);
                                        result = new HashMap<>();
                                    } else {
                                        if (!compareData.Comparefloat(sql_value, value)) {
                                            n++;
                                            result.put("InfoType", "事件报告");
                                            result.put("Vcl_ID", device);
                                            result.put("MsgTime", MsgERC_MsgTime);
                                            result.put("sql_id", Sqlcolname);
                                            result.put("kmx_id", KmxID);
                                            result.put("sql_value", sql_value);
                                            result.put("kmx_value", value);
                                            listout.add(result);
                                            result = new HashMap<>();
                                        }
                                    }
                                } else if (KmxType.equals("long")) {
                                    LongPoint itp = (LongPoint) kmxpoint;
                                    String value = String.valueOf(itp.getValue());
                                    if (sql_value == null && value != null) {
                                        result.put("InfoType", "事件报告");
                                        result.put("Vcl_ID", device);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", Sqlcolname);
                                        result.put("kmx_id", KmxID);
                                        result.put("sql_value", null);
                                        result.put("kmx_value", value);
                                        listout.add(result);
                                        result = new HashMap<>();
                                    } else if (sql_value != null && value == null) {
                                        result.put("InfoType", "事件报告");
                                        result.put("Vcl_ID", device);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", Sqlcolname);
                                        result.put("kmx_id", KmxID);
                                        result.put("sql_value", sql_value);
                                        result.put("kmx_value", null);
                                        listout.add(result);
                                        result = new HashMap<>();
                                    } else {
                                        if (!compareData.Comparelong(sql_value, value)) {
                                            n++;
                                            result.put("InfoType", "事件报告");
                                            result.put("Vcl_ID", device);
                                            result.put("MsgTime", MsgERC_MsgTime);
                                            result.put("sql_id", Sqlcolname);
                                            result.put("kmx_id", KmxID);
                                            result.put("sql_value", sql_value);
                                            result.put("kmx_value", value);
                                            listout.add(result);
                                            result = new HashMap<>();
                                        }
                                    }
                                }
                            }
                        }
                        //endregion
                    }

                }
            }
            outputSql.put("EventCompare", listout);

            //endregion
        }
        //endregion
    }
}
