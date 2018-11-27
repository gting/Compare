package ty.pas.analy;


import java.util.function.*;
import java.util.stream.*;


import java.text.*;
import java.util.*;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.sagittarius3.bean.result.*;
import com.sagittarius3.util.TimeUtil;
import tykj.userfn.UserFunctionMultipleSql2;

public class DriverBehavior2 extends UserFunctionMultipleSql2 {
    public void runOne(List<String> deviceList, Map<String, Map<String, List<Map<String, String>>>> sqlData, Map<String, Map<String, List<FloatPoint>>> floatInput, Map<String, Map<String, List<DoublePoint>>> doubleInput, Map<String, Map<String, List<StringPoint>>> stringInput, Map<String, Map<String, List<IntPoint>>> intInput, Map<String, Map<String, List<LongPoint>>> longInput, Map<String, Map<String, List<BooleanPoint>>> booleanInput, Map<String, Map<String, List<GeoPoint>>> geoInput, long startTime, long endTime) {
        String deviceID = deviceList.get(0);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Map<String, String>> sqllist = sqlData.get("V_Msg_DriverBehavior2").get(deviceID);
        List<LongPoint> distList = longInput.get(deviceID).get("TY_0002_00_732");
        List<LongPoint> distList2 = longInput.get(deviceID).get("TY_0002_00_735");
        List<IntPoint> distList3 = intInput.get(deviceID).get("TY_0002_00_622");
        Map<String, List<IntPoint>> kmap = new HashMap<>();
        List<HashMap<String, Object>> listout = new ArrayList<>();
        for (int i = 1; i <= 238; ++i) {
            int m = 173 + i;
            String s = "TY_0002_00_" + m;
            kmap.put(s, intInput.get(deviceID).get(s));
        }
        List<AbstractPoint> alldata = new ArrayList<>();
        List<String> list = new ArrayList<>();
        for (String mkey : kmap.keySet()) {
            if (kmap.get(mkey) != null) {
                alldata.addAll(kmap.get(mkey));
                list.add(mkey);
            }
        }
        if (distList != null) {
            alldata.addAll(distList);
            list.add("TY_0002_00_732");
        }
        if (distList2 != null) {
            alldata.addAll(distList2);
            list.add("TY_0002_00_735");
        }
        if (distList3 != null) {
            alldata.addAll(distList3);
            list.add("TY_0002_00_622");
        }
        Map<Long, List<AbstractPoint>> resultMap = alldata.stream().collect(
                Collectors.groupingBy(AbstractPoint::getPrimaryTime));


        if (sqllist == null || sqllist.size() == 0) {
            return;
        }
        if (list == null || resultMap == null || resultMap.keySet().size() == 0) {
            HashMap<String, Object> result = new HashMap<>();
            result.put("InfoType", "DriverBehavior");
            result.put("Vcl_ID", deviceID);
            result.put("kmx_value", "kmx无该设备数据");
            listout.add(result);
            outputSql.put("EventCompare", listout);
            return;
        }


        long sTime = 0L;
        long MsgDB2_MsgDate1 = 0L;
        int MsgDB2C_SysGSR_ID;
        String MsgDB2C_SysGSR_ID2;
        for (Map<String, String> smap : sqllist) {
            HashMap<String, Object> result = new HashMap<>();
            String MsgDB2_ID = smap.get("MsgDB2_ID");
            String MsgDB2_Vcl_ID = smap.get("MsgDB2_Vcl_ID");
            String MsgDB2_MsgTime = smap.get("MsgDB2_MsgTime");
            String MsgDB2_MsgDate2 = smap.get("MsgDB2_MsgDate");
            int MsgDB2_MsgType = Integer.parseInt(smap.get("MsgDB2_MsgType"));
            String MsgDB2_SlidingTime = smap.get("MsgDB2_SlidingTime");
            String MsgDB2_JsonContent = smap.get("MsgDB2_JsonContent");
            try {
                sTime = TimeUtil.string2Date(MsgDB2_MsgTime);
                MsgDB2_MsgDate1 = TimeUtil.string2Date(MsgDB2_MsgDate2);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            List<AbstractPoint> listpoint1 = resultMap.get(sTime);
            String Json = "[" + MsgDB2_JsonContent + "]";
            JSONArray arrFC = JSON.parseArray(Json);

            //region Description
            for (int j = 0; j < arrFC.size(); ++j) {
                Map<String, Object> mapTypes = arrFC.getJSONObject(j);
                for (String key : mapTypes.keySet()) {
                    String[] tmp = key.split("_");
                    String MsgDB2C_SysG_ID = tmp[0];
                    String MsgDB2C_SysSR_ID = tmp[1];
                    MsgDB2C_SysGSR_ID = (Integer.parseInt(MsgDB2C_SysSR_ID) - 1) * 14 + Integer.parseInt(MsgDB2C_SysG_ID) + 1 + 173;
                    MsgDB2C_SysGSR_ID2 = "TY_0002_00_" + MsgDB2C_SysGSR_ID;
                    if (MsgDB2_MsgType == 2 && listpoint1 != null) {
                        for (AbstractPoint ap : listpoint1) {
                            if (ap.getMetric().equals(MsgDB2C_SysGSR_ID2)) {
                                IntPoint ap2 = (IntPoint) ap;
                                if (mapTypes.get(key).toString() == null) {
                                    result.put("InfoType", "DriverBehavior");
                                    result.put("Vcl_ID", MsgDB2_Vcl_ID);
                                    result.put("MsgTime", MsgDB2_MsgTime);
                                    result.put("sql_id", "MsgDB2C_SysGSR_ID");
                                    result.put("kmx_id", MsgDB2C_SysGSR_ID2);
                                    result.put("sql_value", null);
                                    result.put("kmx_value", String.valueOf(ap2.getValue()));
                                    listout.add(result);
                                    result = new HashMap<>();
                                } else {
                                    if (ap2.getValue() == Integer.parseInt(mapTypes.get(key).toString())) {
                                        continue;
                                    }
                                    result.put("InfoType", "DriverBehavior");
                                    result.put("Vcl_ID", MsgDB2_Vcl_ID);
                                    result.put("MsgTime", MsgDB2_MsgTime);
                                    result.put("sql_id", "MsgDB2C_SysGSR_ID");
                                    result.put("kmx_id", MsgDB2C_SysGSR_ID2);
                                    result.put("sql_value", mapTypes.get(key).toString());
                                    result.put("kmx_value", String.valueOf(ap2.getValue()));
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                            }
                        }
                        if (!list.contains(MsgDB2C_SysGSR_ID2) && mapTypes.get(key).toString() != null) {
                            result.put("InfoType", "DriverBehavior");
                            result.put("Vcl_ID", MsgDB2_Vcl_ID);
                            result.put("MsgTime", MsgDB2_MsgTime);
                            result.put("sql_id", "MsgDB2C_SysGSR_ID");
                            result.put("kmx_id", MsgDB2C_SysGSR_ID2);
                            result.put("sql_value", mapTypes.get(key).toString());
                            result.put("kmx_value", "kmx缺少数据");
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if ((MsgDB2_MsgType == 1 || MsgDB2_MsgType == 3) && listpoint1 != null) {
                        for (AbstractPoint ap : listpoint1) {
                            if (ap.getMetric().equals(MsgDB2C_SysGSR_ID2)) {
                                IntPoint ap2 = (IntPoint) ap;
                                if (mapTypes.get(key).toString() == null) {
                                    result.put("InfoType", "精准档位车速");
                                    result.put("Vcl_ID", MsgDB2_Vcl_ID);
                                    result.put("MsgTime", MsgDB2_MsgTime);
                                    result.put("sql_id", "MsgDB2C_SysGSR_ID");
                                    result.put("kmx_id", MsgDB2C_SysGSR_ID2);
                                    result.put("sql_value", null);
                                    result.put("kmx_value", String.valueOf(ap2.getValue()));
                                    listout.add(result);
                                    result = new HashMap<>();
                                } else {
                                    if (ap2.getValue() == Integer.parseInt(mapTypes.get(key).toString())) {
                                        continue;
                                    }
                                    result.put("InfoType", "DriverBehavior");
                                    result.put("Vcl_ID", MsgDB2_Vcl_ID);
                                    result.put("MsgTime", MsgDB2_MsgTime);
                                    result.put("sql_id", "MsgDB2C_SysGSR_ID");
                                    result.put("kmx_id", MsgDB2C_SysGSR_ID2);
                                    result.put("sql_value", mapTypes.get(key).toString());
                                    result.put("kmx_value", String.valueOf(ap2.getValue()));
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                            }
                        }
                        if (list.contains(MsgDB2C_SysGSR_ID2) || mapTypes.get(key).toString() == null) {
                            continue;
                        }
                        result.put("InfoType", "精准档位车速");
                        result.put("Vcl_ID", MsgDB2_Vcl_ID);
                        result.put("MsgTime", MsgDB2_MsgTime);
                        result.put("sql_id", "MsgDB2C_SysGSR_ID");
                        result.put("kmx_id", MsgDB2C_SysGSR_ID2);
                        result.put("sql_value", mapTypes.get(key).toString());
                        result.put("kmx_value", "kmx缺少数据");
                        listout.add(result);
                        result = new HashMap<>();
                    }
                }
            }
            //endregion


            //region Description
            if (MsgDB2_MsgType == 1 || MsgDB2_MsgType == 3) {
                if (listpoint1 != null) {
                    for (AbstractPoint ap3 : listpoint1) {
                        if (ap3.getMetric().equals("TY_0002_00_735")) {
                            LongPoint ap4 = (LongPoint) ap3;
                            if (MsgDB2_MsgDate2 == null) {
                                result.put("InfoType", "精准档位车速");
                                result.put("Vcl_ID", MsgDB2_Vcl_ID);
                                result.put("MsgTime", MsgDB2_MsgTime);
                                result.put("sql_id", "MsgDB2_MsgDate");
                                result.put("kmx_id", "TY_0002_00_735");
                                result.put("sql_value", null);
                                result.put("kmx_value", String.valueOf(ap4.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                                continue;
                            } else {
                                if (String.valueOf(ap4.getValue()).equals(String.valueOf(MsgDB2_MsgDate1))) {
                                    continue;
                                }
                                result.put("InfoType", "精准档位车速");
                                result.put("Vcl_ID", MsgDB2_Vcl_ID);
                                result.put("MsgTime", MsgDB2_MsgTime);
                                result.put("sql_id", "MsgDB2_MsgDate");
                                result.put("kmx_id", "TY_0002_00_735");
                                result.put("sql_value", MsgDB2_MsgDate2);
                                result.put("kmx_value", String.valueOf(ap4.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap3.getMetric().equals("TY_0002_00_622")) {
                            IntPoint ap5 = (IntPoint) ap3;
                            if (MsgDB2_SlidingTime == null) {
                                result.put("InfoType", "精准档位车速");
                                result.put("Vcl_ID", MsgDB2_Vcl_ID);
                                result.put("MsgTime", MsgDB2_MsgTime);
                                result.put("sql_id", "MsgDB2_SlidingTime");
                                result.put("kmx_id", "TY_0002_00_622");
                                result.put("sql_value", null);
                                result.put("kmx_value", String.valueOf(ap5.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                                continue;
                            } else {
                                if (String.valueOf(ap5.getValue()).equals(String.valueOf(MsgDB2_SlidingTime))) {
                                    continue;
                                }
                                result.put("InfoType", "精准档位车速");
                                result.put("Vcl_ID", MsgDB2_Vcl_ID);
                                result.put("MsgTime", MsgDB2_MsgTime);
                                result.put("sql_id", "MsgDB2_MsgDate");
                                result.put("kmx_id", "TY_0002_00_622");
                                result.put("sql_value", MsgDB2_SlidingTime);
                                result.put("kmx_value", String.valueOf(ap5.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                    }
                    if (!list.contains("TY_0002_00_622") && MsgDB2_SlidingTime != null) {
                        result.put("InfoType", "精准档位车速");
                        result.put("Vcl_ID", MsgDB2_Vcl_ID);
                        result.put("MsgTime", MsgDB2_MsgTime);
                        result.put("sql_id", "MsgDB2C_SysGSR_ID");
                        result.put("kmx_id", "TY_0002_00_622");
                        result.put("sql_value", MsgDB2_SlidingTime);
                        result.put("kmx_value", "kmx缺少数据");
                        listout.add(result);
                        result = new HashMap<>();
                    }
                    if (!list.contains("TY_0002_00_735") && MsgDB2_MsgDate2 != null) {
                        result.put("InfoType", "精准档位车速");
                        result.put("Vcl_ID", MsgDB2_Vcl_ID);
                        result.put("MsgTime", MsgDB2_MsgTime);
                        result.put("sql_id", "MsgDB2C_SysGSR_ID");
                        result.put("kmx_id", "TY_0002_00_735");
                        result.put("sql_value", MsgDB2_MsgDate2);
                        result.put("kmx_value", "kmx缺少数据");
                        listout.add(result);
                        result = new HashMap<>();
                    }
                }
                if (listpoint1 != null) {
                    continue;
                }
                result.put("InfoType", "精准档位车速");
                result.put("Vcl_ID", MsgDB2_Vcl_ID);
                result.put("MsgTime", MsgDB2_MsgTime);
                result.put("sql_id", "MsgDB2_ID");
                result.put("sql_value", MsgDB2_ID);
                result.put("kmx_value", "kmx无数据");
                for (LongPoint longPoint:distList2)
                {
                    System.out.println(longPoint.getValue()+"\t"+longPoint.getPrimaryTime());
                }
                listout.add(result);

            } else {
                if (MsgDB2_MsgType != 2) {
                    continue;
                }
                if (listpoint1 != null) {
                    for (AbstractPoint ap3 : listpoint1) {
                        if (ap3.getMetric().equals("TY_0002_00_732")) {
                            LongPoint ap4 = (LongPoint) ap3;
                            if (MsgDB2_MsgDate2 == null) {
                                result.put("InfoType", "DriverBehavior");
                                result.put("Vcl_ID", MsgDB2_Vcl_ID);
                                result.put("MsgTime", MsgDB2_MsgTime);
                                result.put("sql_id", "MsgDB2_MsgDate");
                                result.put("kmx_id", "TY_0002_00_732");
                                result.put("sql_value", null);
                                result.put("kmx_value", String.valueOf(ap4.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            } else {
                                if (String.valueOf(ap4.getValue()).equals(String.valueOf(MsgDB2_MsgDate1))) {
                                    continue;
                                }
                                result.put("InfoType", "DriverBehavior");
                                result.put("Vcl_ID", MsgDB2_Vcl_ID);
                                result.put("MsgTime", MsgDB2_MsgTime);
                                result.put("sql_id", "MsgDB2_MsgDate");
                                result.put("kmx_id", "TY_0002_00_732");
                                result.put("sql_value", MsgDB2_MsgDate2);
                                result.put("kmx_value", String.valueOf(ap4.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                    }
                    if (!list.contains("TY_0002_00_732") && MsgDB2_MsgDate2 != null) {
                        result.put("InfoType", "DriverBehavior");
                        result.put("Vcl_ID", MsgDB2_Vcl_ID);
                        result.put("MsgTime", MsgDB2_MsgTime);
                        result.put("sql_id", "MsgDB2C_SysGSR_ID");
                        result.put("kmx_id", "TY_0002_00_732");
                        result.put("sql_value", MsgDB2_MsgDate2);
                        result.put("kmx_value", "kmx缺少数据");
                        listout.add(result);
                        result = new HashMap<>();
                    }
                }
                if (listpoint1 != null) {
                    continue;
                }
                result.put("InfoType", "DriverBehavior");
                result.put("Vcl_ID", MsgDB2_Vcl_ID);
                result.put("MsgTime", MsgDB2_MsgTime);
                result.put("sql_id", "MsgDB2_ID");
                result.put("sql_value", MsgDB2_ID);
                result.put("kmx_value", "kmx无数据");
                listout.add(result);

            }
            //endregion
        }
        outputSql.put("EventCompare", listout);
    }
}
