package ty.pas.analy;



import java.util.stream.*;



import java.text.*;
import java.math.*;
import java.util.*;

import com.alibaba.fastjson.*;

import com.sagittarius3.bean.result.*;

import com.sagittarius3.util.TimeUtil;
import tykj.userfn.UserFunctionMultipleSql2;

public class Alarm extends UserFunctionMultipleSql2 {
    public void runOne(List<String> deviceList, Map<String, Map<String, List<Map<String, String>>>> sqlData, Map<String, Map<String, List<FloatPoint>>> floatInput, Map<String, Map<String, List<DoublePoint>>> doubleInput, Map<String, Map<String, List<StringPoint>>> stringInput, Map<String, Map<String, List<IntPoint>>> intInput, Map<String, Map<String, List<LongPoint>>> longInput, Map<String, Map<String, List<BooleanPoint>>> booleanInput, Map<String, Map<String, List<GeoPoint>>> geoInput, long startTime, long endTime) {
        String deviceID = deviceList.get(0);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<StringPoint> distList = stringInput.get(deviceID).get("TY_0002_00_5");
        List<IntPoint> distList2 = intInput.get(deviceID).get("TY_0002_00_52");
        List<IntPoint> distList3 = intInput.get(deviceID).get("TY_0002_00_53");
        List<IntPoint> distList4 = intInput.get(deviceID).get("TY_0002_00_54");
        List<IntPoint> distList5 = intInput.get(deviceID).get("TY_0002_00_55");
        List<IntPoint> distList6 = intInput.get(deviceID).get("TY_0002_00_56");
        List<IntPoint> distList7 = intInput.get(deviceID).get("TY_0002_00_57");
        List<IntPoint> distList8 = intInput.get(deviceID).get("TY_0002_00_58");
        List<IntPoint> distList9 = intInput.get(deviceID).get("TY_0002_00_59");
        List<IntPoint> distList10 = intInput.get(deviceID).get("TY_0002_00_60");
        List<IntPoint> distList11 = intInput.get(deviceID).get("TY_0002_00_61");
        List<IntPoint> distList12 = intInput.get(deviceID).get("TY_0002_00_62");
        List<IntPoint> distList13 = intInput.get(deviceID).get("TY_0002_00_63");
        List<IntPoint> distList14 = intInput.get(deviceID).get("TY_0002_00_64");
        List<IntPoint> distList15 = intInput.get(deviceID).get("TY_0002_00_65");
        List<IntPoint> distList16 = intInput.get(deviceID).get("TY_0002_00_66");
        List<IntPoint> distList17 = intInput.get(deviceID).get("TY_0002_00_67");
        List<IntPoint> distList18 = intInput.get(deviceID).get("TY_0002_00_68");
        List<IntPoint> distList19 = intInput.get(deviceID).get("TY_0002_00_69");
        List<IntPoint> distList20 = intInput.get(deviceID).get("TY_0002_00_1009");
        List<IntPoint> distList21 = intInput.get(deviceID).get("TY_0002_00_1008");
        List<AbstractPoint> alldata = new ArrayList<>();
        List<HashMap<String, Object>> listout = new ArrayList<>();
        List<String> list = new ArrayList<>();
        if (distList != null) {
            alldata.addAll(distList);
            list.add("TY_0002_00_5");
        }
        if (distList2 != null) {
            alldata.addAll(distList2);
            list.add("TY_0002_00_52");
        }
        if (distList3 != null) {
            alldata.addAll(distList3);
            list.add("TY_0002_00_53");
        }
        if (distList4 != null) {
            alldata.addAll(distList4);
            list.add("TY_0002_00_54");
        }
        if (distList5 != null) {
            alldata.addAll(distList5);
            list.add("TY_0002_00_55");
        }
        if (distList6 != null) {
            alldata.addAll(distList6);
            list.add("TY_0002_00_56");
        }
        if (distList7 != null) {
            alldata.addAll(distList7);
            list.add("TY_0002_00_57");
        }
        if (distList8 != null) {
            alldata.addAll(distList8);
            list.add("TY_0002_00_58");
        }
        if (distList9 != null) {
            alldata.addAll(distList9);
            list.add("TY_0002_00_59");
        }
        if (distList10 != null) {
            alldata.addAll(distList10);
            list.add("TY_0002_00_60");
        }
        if (distList11 != null) {
            alldata.addAll(distList11);
            list.add("TY_0002_00_61");
        }
        if (distList12 != null) {
            alldata.addAll(distList12);
            list.add("TY_0002_00_62");
        }
        if (distList13 != null) {
            alldata.addAll(distList13);
            list.add("TY_0002_00_63");
        }
        if (distList14 != null) {
            alldata.addAll(distList14);
            list.add("TY_0002_00_64");
        }
        if (distList15 != null) {
            alldata.addAll(distList15);
            list.add("TY_0002_00_65");
        }
        if (distList16 != null) {
            alldata.addAll(distList16);
            list.add("TY_0002_00_66");
        }
        if (distList17 != null) {
            alldata.addAll(distList17);
            list.add("TY_0002_00_67");
        }
        if (distList18 != null) {
            alldata.addAll(distList18);
            list.add("TY_0002_00_68");
        }
        if (distList19 != null) {
            alldata.addAll(distList19);
            list.add("TY_0002_00_69");
        }
        if (distList20 != null) {
            alldata.addAll(distList20);
            list.add("TY_0002_00_1009");
        }
        if (distList21 != null) {
            alldata.addAll(distList21);
            list.add("TY_0002_00_1008");
        }
        Map<Long, List<AbstractPoint>> resultMap = alldata.stream().collect(
                Collectors.groupingBy(AbstractPoint::getPrimaryTime));

        List<Map<String, String>> sqllist = sqlData.get("V_Msg_Alarm").get(deviceID);
        if (sqllist == null || sqllist.size() == 0) {
            return;
        }

        HashMap<String, Object> result = new HashMap<>();
        if (list == null || resultMap == null || resultMap.size() == 0) {
            result.put("InfoType", "报警0x10");
            result.put("Vcl_ID", deviceID);
            result.put("kmx_value", "kmx无该设备数据");
            listout.add(result);
            outputSql.put("EventCompare",listout);
            return;
        }
        for (Map<String, String> smap : sqllist) {
            HashMap<String, Object> result2 = new HashMap<>();
            String MsgAlm_Vcl_ID = smap.get("MsgAlmC_Vcl_ID");
            String MsgAlm_MsgTime = smap.get("MsgAlmC_MsgTime");
            String La = smap.get("MsgAlmC_La");
            String Lo = smap.get("MsgAlmC_Lo");
            String Satellite = smap.get("MsgAlmC_Satellite");
            String Speed = smap.get("MsgAlmC_Speed");
            String Direction = smap.get("MsgAlmC_Direction");
            String GSMSignal = smap.get("MsgAlmC_GSMSignal");
            String MsgAlmC_SysA_ID = smap.get("MsgAlmC_SysA_ID");
            String MsgAlmC_IsAlarm = smap.get("MsgAlmC_IsAlarm");
            String MsgAlmC_Happen = smap.get("MsgAlmC_Happen");
            String MsgAlmC_Release = smap.get("MsgAlmC_Release");
            long time = 0L;
            long time2 = 0L;
            long time3 = 0L;
            try {
                time = TimeUtil.string2Date(MsgAlm_MsgTime);
                time2 = TimeUtil.string2Date(MsgAlmC_Happen);

                if (MsgAlmC_Release != null) {
                    time3 = TimeUtil.string2Date(MsgAlmC_Release);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
            //按照信息生成时间抽取
            List<AbstractPoint> listpoint = resultMap.get(time);
            //按照报警发生时间抽取
            List<AbstractPoint> listpoint2 = resultMap.get(time2);
            //按照报警解除时间抽取
            List<AbstractPoint> listpoint3 = resultMap.get(time3);
            //有报警发生

            //region Description
            if (!String.valueOf(time2).equals("0")) {
                if (listpoint2 != null) {
                    //region Description
                    for (AbstractPoint ap : listpoint2) {
                        if (ap.getMetric().equals("TY_0002_00_52") && MsgAlmC_SysA_ID.equals("1")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_52");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_53") && MsgAlmC_SysA_ID.equals("2")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_53");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }

                        }
                        if (ap.getMetric().equals("TY_0002_00_54") && MsgAlmC_SysA_ID.equals("3")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_54");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_55") && MsgAlmC_SysA_ID.equals("5")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_55");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_56") && MsgAlmC_SysA_ID.equals("6")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_56");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_57") && MsgAlmC_SysA_ID.equals("7")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_57");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_58") && MsgAlmC_SysA_ID.equals("8")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_58");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_59") && MsgAlmC_SysA_ID.equals("9")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_59");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_60") && MsgAlmC_SysA_ID.equals("10")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_60");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_61") && MsgAlmC_SysA_ID.equals("11")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_61");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_62") && MsgAlmC_SysA_ID.equals("12")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_62");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_63") && MsgAlmC_SysA_ID.equals("19")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_63");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_64") && MsgAlmC_SysA_ID.equals("16")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_64");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_65") && MsgAlmC_SysA_ID.equals("17")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_65");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_66") && MsgAlmC_SysA_ID.equals("18")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_66");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_67") && MsgAlmC_SysA_ID.equals("15")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_67");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_68") && MsgAlmC_SysA_ID.equals("20")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_68");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_69") && MsgAlmC_SysA_ID.equals("21")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_69");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_1009") && MsgAlmC_SysA_ID.equals("22")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_1009");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_1008") && MsgAlmC_SysA_ID.equals("23")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("1")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_1008");
                                result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }

                    }
                    //endregion

                } else {
                    result.put("InfoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间:" + MsgAlmC_Happen);
                    result.put("kmx_value", "KMX无数据");
                    listout.add(result);
                    System.out.println("报警发生时间:"+MsgAlmC_Happen);
                    result = new HashMap<>();

                }
                if (!list.contains("TY_0002_00_52") && MsgAlmC_SysA_ID.equals("1")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_53") && MsgAlmC_SysA_ID.equals("2")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_54") && MsgAlmC_SysA_ID.equals("3")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_55") && MsgAlmC_SysA_ID.equals("5")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_56") && MsgAlmC_SysA_ID.equals("6")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_57") && MsgAlmC_SysA_ID.equals("7")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_58") && MsgAlmC_SysA_ID.equals("8")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_59") && MsgAlmC_SysA_ID.equals("9")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_60") && MsgAlmC_SysA_ID.equals("10")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_61") && MsgAlmC_SysA_ID.equals("11")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_62") && MsgAlmC_SysA_ID.equals("12")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_63") && MsgAlmC_SysA_ID.equals("19")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_64") && MsgAlmC_SysA_ID.equals("16")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_65") && MsgAlmC_SysA_ID.equals("17")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_66") && MsgAlmC_SysA_ID.equals("18")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_67") && MsgAlmC_SysA_ID.equals("15")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_68") && MsgAlmC_SysA_ID.equals("20")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_69") && MsgAlmC_SysA_ID.equals("21")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);

                    result = new HashMap<>();
                }
//                if (!list.contains("TY_0002_00_1009") && MsgAlmC_SysA_ID.equals("22")) {
//                    result.put("IntoType", "报警0x10");
//                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                    result.put("MsgTime", MsgAlm_MsgTime);
//                    result.put("sql_id", MsgAlmC_SysA_ID);
//                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
//                    result.put("kmx_value", "kmx缺少数据");
//                    listout.add(result);
//
//                    result = new HashMap<>();
//                }
//                if (!list.contains("TY_0002_00_1008") && MsgAlmC_SysA_ID.equals("23")) {
//                    result.put("IntoType", "报警0x10");
//                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                    result.put("MsgTime", MsgAlm_MsgTime);
//                    result.put("sql_id", MsgAlmC_SysA_ID);
//                    result.put("sql_value", "报警发生时间" + MsgAlmC_Happen);
//                    result.put("kmx_value", "kmx缺少数据");
//                    listout.add(result);
//
//                    result = new HashMap<>();
//                }

            }
            //endregion
            //根据报警解除时间对比
            if (!String.valueOf(time3).equals("0")) {

                //region Description
                if (listpoint3 != null) {
                    for (AbstractPoint ap : listpoint3) {
                        if (ap.getMetric().equals("TY_0002_00_52") && MsgAlmC_SysA_ID.equals("1")) {
                            IntPoint ap2 = (IntPoint) ap;

                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_52");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }

                        }
                        if (ap.getMetric().equals("TY_0002_00_53") && MsgAlmC_SysA_ID.equals("2")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_53");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_54") && MsgAlmC_SysA_ID.equals("3")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_54");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_55") && MsgAlmC_SysA_ID.equals("5")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_55");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_56") && MsgAlmC_SysA_ID.equals("6")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_56");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_57") && MsgAlmC_SysA_ID.equals("7")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_57");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_58") && MsgAlmC_SysA_ID.equals("8")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_58");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_59") && MsgAlmC_SysA_ID.equals("9")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_59");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_60") && MsgAlmC_SysA_ID.equals("10")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_60");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_61") && MsgAlmC_SysA_ID.equals("11")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_61");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_62") && MsgAlmC_SysA_ID.equals("12")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_62");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_63") && MsgAlmC_SysA_ID.equals("19")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_63");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_64") && MsgAlmC_SysA_ID.equals("16")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_64");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_65") && MsgAlmC_SysA_ID.equals("17")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_65");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_66") && MsgAlmC_SysA_ID.equals("18")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_66");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_67") && MsgAlmC_SysA_ID.equals("15")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_67");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_68") && MsgAlmC_SysA_ID.equals("20")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_68");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_69") && MsgAlmC_SysA_ID.equals("21")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_69");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_1009") && MsgAlmC_SysA_ID.equals("22")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_1009");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }
                        if (ap.getMetric().equals("TY_0002_00_1008") && MsgAlmC_SysA_ID.equals("23")) {
                            IntPoint ap2 = (IntPoint) ap;
                            if (!String.valueOf(ap2.getValue()).equals("0")) {
                                result.put("InfoType", "报警0x10");
                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
                                result.put("MsgTime", MsgAlm_MsgTime);
                                result.put("sql_id", MsgAlmC_SysA_ID);
                                result.put("kmx_id", "TY_0002_00_1008");
                                result.put("sql_value", "报警解除时间" + MsgAlmC_Release);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);

                                result = new HashMap<>();
                            }
                        }

                    }
                } else {
                    result.put("InfoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", "报警解除时间:" + MsgAlmC_Release);
                    result.put("kmx_value", "KMX无数据");
                    listout.add(result);
                    System.out.println("报警解除时间"+MsgAlmC_Release);
                    result = new HashMap<>();
                }
                //endregion
                if (!list.contains("TY_0002_00_52") && MsgAlmC_SysA_ID.equals("1")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_53") && MsgAlmC_SysA_ID.equals("2")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_54") && MsgAlmC_SysA_ID.equals("3")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_55") && MsgAlmC_SysA_ID.equals("5")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_56") && MsgAlmC_SysA_ID.equals("6")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_57") && MsgAlmC_SysA_ID.equals("7")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_58") && MsgAlmC_SysA_ID.equals("8")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_59") && MsgAlmC_SysA_ID.equals("9")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_60") && MsgAlmC_SysA_ID.equals("10")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_61") && MsgAlmC_SysA_ID.equals("11")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_62") && MsgAlmC_SysA_ID.equals("12")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_63") && MsgAlmC_SysA_ID.equals("19")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_64") && MsgAlmC_SysA_ID.equals("16")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_65") && MsgAlmC_SysA_ID.equals("17")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_66") && MsgAlmC_SysA_ID.equals("18")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_67") && MsgAlmC_SysA_ID.equals("15")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_68") && MsgAlmC_SysA_ID.equals("20")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_69") && MsgAlmC_SysA_ID.equals("21")) {
                    result.put("IntoType", "报警0x10");
                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
                    result.put("MsgTime", MsgAlm_MsgTime);
                    result.put("sql_id", MsgAlmC_SysA_ID);
                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
//                if (!list.contains("TY_0002_00_1009") && MsgAlmC_SysA_ID.equals("22")) {
//                    result.put("IntoType", "报警0x10");
//                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                    result.put("MsgTime", MsgAlm_MsgTime);
//                    result.put("sql_id", MsgAlmC_SysA_ID);
//                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
//                    result.put("kmx_value", "kmx缺少数据");
//                    listout.add(result);
//                    result = new HashMap<>();
//                }
//                if (!list.contains("TY_0002_00_1009") && MsgAlmC_SysA_ID.equals("23")) {
//                    result.put("IntoType", "报警0x10");
//                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                    result.put("MsgTime", MsgAlm_MsgTime);
//                    result.put("sql_id", MsgAlmC_SysA_ID);
//                    result.put("sql_value", String.valueOf(MsgAlmC_Happen) + "&&" + MsgAlmC_Release);
//                    result.put("kmx_value", "kmx缺少数据");
//                    listout.add(result);
//                    result = new HashMap<>();
//                }

            }
            //对比gps
//            if (listpoint != null) {
//                for (AbstractPoint ap : listpoint) {
//                    if (ap.getMetric().equals("TY_0002_00_5")) {
//                        StringPoint ap3 = (StringPoint) ap;
//                        String jsongps = "[" + ap3.getValue() + "]";
//                        JSONArray arrFC = JSON.parseArray(jsongps);
//                        for (int i = 0; i < arrFC.size(); ++i) {
//                            Map<String, Object> mapTypes = arrFC.getJSONObject(i);
//                            for (String key : mapTypes.keySet()) {
//                                result2.put(key, mapTypes.get(key).toString());
//                            }
//                        }
//                        for (String key2 : result2.keySet()) {
//                            if (key2.equals("Speed")) {
//                                if (Speed == null && result2.get(key2) != null) {
//                                    result.put("InfoType", "报警0x10");
//                                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                    result.put("MsgTime", MsgAlm_MsgTime);
//                                    result.put("sql_id", "Speed");
//                                    result.put("kmx_id", key2);
//                                    result.put("sql_value", null);
//                                    result.put("kmx_value", result2.get(key2));
//                                    listout.add(result);
//
//                                    result = new HashMap<>();
//                                    continue;
//                                }
//                                if (Speed != null && result2.get(key2) == null) {
//                                    result.put("InfoType", "报警0x10");
//                                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                    result.put("MsgTime", MsgAlm_MsgTime);
//                                    result.put("sql_id", "Speed");
//                                    result.put("kmx_id", key2);
//                                    result.put("sql_value", Speed);
//                                    result.put("kmx_value", null);
//                                    listout.add(result);
//
//                                    result = new HashMap<>();
//                                    continue;
//                                }
//                                if (Speed == null && result2.get(key2) == null) {
//                                    continue;
//                                }
//                                if (Double.valueOf(result2.get(key2).toString()).equals(Double.valueOf(Speed))) {
//                                    continue;
//                                }
//                                result.put("InfoType", "报警0x10");
//                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                result.put("MsgTime", MsgAlm_MsgTime);
//                                result.put("sql_id", "Speed");
//                                result.put("kmx_id", key2);
//                                result.put("sql_value", Speed);
//                                result.put("kmx_value", result2.get(key2));
//                                listout.add(result);
//
//                                result = new HashMap<>();
//                            }
//                            if (key2.equals("Lo")) {
//                                String Lo2 = null;
//                                String Lo3 = null;
//                                BigDecimal b = new BigDecimal(Double.valueOf(result2.get(key2).toString()));
//                                BigDecimal b2 = new BigDecimal(Lo);
//                                int s = Lo.indexOf(".");
//                                if (Lo.length() < result2.get(key2).toString().length()) {
//                                    Lo2 = String.valueOf(b.setScale(Lo.length() - s - 1, 4).doubleValue());
//                                }
//                                if (Lo.length() > result2.get(key2).toString().length()) {
//                                    Lo3 = String.valueOf(b2.setScale(result2.get(key2).toString().length() - s - 1, 4).doubleValue());
//                                }
//                                if (Lo == null && result2.get(key2) != null) {
//                                    result.put("InfoType", "报警0x10");
//                                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                    result.put("MsgTime", MsgAlm_MsgTime);
//                                    result.put("sql_id", "Lo");
//                                    result.put("kmx_id", key2);
//                                    result.put("sql_value", null);
//                                    result.put("kmx_value", result2.get(key2));
//                                    listout.add(result);
//
//                                    result = new HashMap<>();
//                                    continue;
//                                }
//                                if (Lo != null && result2.get(key2) == null) {
//                                    result.put("InfoType", "报警0x10");
//                                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                    result.put("MsgTime", MsgAlm_MsgTime);
//                                    result.put("sql_id", "Lo");
//                                    result.put("kmx_id", key2);
//                                    result.put("sql_value", Lo);
//                                    result.put("kmx_value", null);
//                                    listout.add(result);
//
//                                    result = new HashMap<>();
//                                    continue;
//                                }
//                                if (Lo == null && result2.get(key2) == null) {
//                                    continue;
//                                }
//                                if (Lo2 != null) {
//                                    if (Lo2.equals(Lo)) {
//                                        continue;
//                                    }
//                                    result.put("InfoType", "报警0x10");
//                                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                    result.put("MsgTime", MsgAlm_MsgTime);
//                                    result.put("sql_id", "Lo");
//                                    result.put("kmx_id", key2);
//                                    result.put("sql_value", Lo);
//                                    result.put("kmx_value", result2.get(key2));
//                                    listout.add(result);
//
//                                    result = new HashMap<>();
//                                }
//                                if (Lo3 != null) {
//                                    if (Lo3.equals(Lo)) {
//                                        continue;
//                                    }
//                                    result.put("InfoType", "报警0x10");
//                                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                    result.put("MsgTime", MsgAlm_MsgTime);
//                                    result.put("sql_id", "Lo");
//                                    result.put("kmx_id", key2);
//                                    result.put("sql_value", Lo);
//                                    result.put("kmx_value", result2.get(key2));
//                                    listout.add(result);
//
//                                    result = new HashMap<>();
//                                }
//                            }
//                            if (key2.equals("La")) {
//                                BigDecimal b3 = new BigDecimal(Double.valueOf(result2.get(key2).toString()));
//                                BigDecimal b4 = new BigDecimal(La);
//                                String La2 = null;
//                                String La3 = null;
//                                int s = La.indexOf(".");
//                                if (La.length() < result2.get(key2).toString().length()) {
//                                    La2 = String.valueOf(b3.setScale(La.length() - s - 1, 4).doubleValue());
//                                }
//                                if (La.length() > result2.get(key2).toString().length()) {
//                                    La3 = String.valueOf(b4.setScale(result2.get(key2).toString().length() - s - 1, 4).doubleValue());
//                                }
//                                if (La == null && result2.get(key2) != null) {
//                                    result.put("InfoType", "报警0x10");
//                                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                    result.put("MsgTime", MsgAlm_MsgTime);
//                                    result.put("sql_id", "La");
//                                    result.put("kmx_id", key2);
//                                    result.put("sql_value", null);
//                                    result.put("kmx_value", result2.get(key2));
//                                    listout.add(result);
//
//                                    result = new HashMap<>();
//                                    continue;
//                                }
//                                if (La != null && result2.get(key2) == null) {
//                                    result.put("InfoType", "报警0x10");
//                                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                    result.put("MsgTime", MsgAlm_MsgTime);
//                                    result.put("sql_id", "La");
//                                    result.put("kmx_id", key2);
//                                    result.put("sql_value", La);
//                                    result.put("kmx_value", null);
//                                    listout.add(result);
//
//                                    result = new HashMap<>();
//                                    continue;
//                                }
//                                if (La == null && result2.get(key2) == null) {
//                                    continue;
//                                }
//                                if (La2 != null) {
//                                    if (La2.equals(La)) {
//                                        continue;
//                                    }
//                                    result.put("InfoType", "报警0x10");
//                                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                    result.put("MsgTime", MsgAlm_MsgTime);
//                                    result.put("sql_id", "La");
//                                    result.put("kmx_id", key2);
//                                    result.put("sql_value", La);
//                                    result.put("kmx_value", result2.get(key2));
//                                    listout.add(result);
//
//                                    result = new HashMap<>();
//                                }
//                                if (La3 != null) {
//                                    if (La3.equals(La)) {
//                                        continue;
//                                    }
//                                    result.put("InfoType", "报警0x10");
//                                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                    result.put("MsgTime", MsgAlm_MsgTime);
//                                    result.put("sql_id", "La");
//                                    result.put("kmx_id", key2);
//                                    result.put("sql_value", La);
//                                    result.put("kmx_value", result2.get(key2));
//                                    listout.add(result);
//
//                                    result = new HashMap<>();
//                                    continue;
//                                }
//                            }
//                            if (key2.equals("Satellite")) {
//                                if (Satellite == null && result2.get(key2) != null) {
//                                    result.put("InfoType", "报警0x10");
//                                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                    result.put("MsgTime", MsgAlm_MsgTime);
//                                    result.put("sql_id", "Satellite");
//                                    result.put("kmx_id", key2);
//                                    result.put("sql_value", null);
//                                    result.put("kmx_value", result2.get(key2));
//                                    listout.add(result);
//
//                                    result = new HashMap<>();
//                                    continue;
//                                }
//                                if (Satellite != null && result2.get(key2) == null) {
//                                    result.put("InfoType", "报警0x10");
//                                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                    result.put("MsgTime", MsgAlm_MsgTime);
//                                    result.put("sql_id", "Satellite");
//                                    result.put("kmx_id", key2);
//                                    result.put("sql_value", Satellite);
//                                    result.put("kmx_value", null);
//                                    listout.add(result);
//
//                                    result = new HashMap<>();
//                                }
//                                if (Satellite == null && result2.get(key2) == null) {
//                                    continue;
//                                }
//                                if (result2.get(key2).equals(Satellite)) {
//                                    continue;
//                                }
//                                result.put("InfoType", "报警0x10");
//                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                result.put("MsgTime", MsgAlm_MsgTime);
//                                result.put("sql_id", "Satellite");
//                                result.put("kmx_id", key2);
//                                result.put("sql_value", Satellite);
//                                result.put("kmx_value", result2.get(key2));
//                                listout.add(result);
//
//                                result = new HashMap<>();
//                            }
//                            if (key2.equals("Direction")) {
//                                if (Direction == null && result2.get(key2) != null) {
//                                    result.put("InfoType", "报警0x10");
//                                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                    result.put("MsgTime", MsgAlm_MsgTime);
//                                    result.put("sql_id:", "Direction");
//                                    result.put("kmx_id", key2);
//                                    result.put("sql_value", null);
//                                    result.put("kmx_value", result2.get(key2));
//                                    listout.add(result);
//
//                                    result = new HashMap<>();
//                                    continue;
//                                }
//                                if (Direction != null && result2.get(key2) == null) {
//                                    result.put("InfoType", "报警0x10");
//                                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                    result.put("MsgTime", MsgAlm_MsgTime);
//                                    result.put("sql_id", "Direction");
//                                    result.put("kmx_id", key2);
//                                    result.put("sql_value", Direction);
//                                    result.put("kmx_value", null);
//                                    listout.add(result);
//
//                                    result = new HashMap<>();
//                                    continue;
//                                }
//                                if (Direction == null && result2.get(key2) == null) {
//                                    continue;
//                                }
//                                if (result2.get(key2).equals(Direction)) {
//                                    continue;
//                                }
//                                result.put("InfoType", "报警0x10");
//                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                result.put("MsgTime", MsgAlm_MsgTime);
//                                result.put("sql_id", "Direction");
//                                result.put("kmx_id", key2);
//                                result.put("sql_value", Direction);
//                                result.put("kmx_value", result2.get(key2));
//                                listout.add(result);
//
//                                result = new HashMap<>();
//                            }
//                            if (key2.equals("GSMSignal")) {
//                                if (GSMSignal == null && result2.get(key2) != null) {
//                                    result.put("InfoType", "报警0x10");
//                                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                    result.put("MsgTime", MsgAlm_MsgTime);
//                                    result.put("sql_id", "GSMSignal");
//                                    result.put("kmx_id", key2);
//                                    result.put("sql_value", null);
//                                    result.put("kmx_value", result2.get(key2));
//                                    listout.add(result);
//                                    result = new HashMap<>();
//                                    continue;
//                                }
//                                if (GSMSignal != null && result2.get(key2) == null) {
//                                    result.put("InfoType", "报警0x10");
//                                    result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                    result.put("MsgTime", MsgAlm_MsgTime);
//                                    result.put("sql_id", "GSMSignal");
//                                    result.put("kmx_id", key2);
//                                    result.put("sql_value", GSMSignal);
//                                    result.put("kmx_value", null);
//                                    listout.add(result);
//
//                                    result = new HashMap<>();
//                                    continue;
//                                }
//                                if (GSMSignal == null && result2.get(key2) == null) {
//                                    continue;
//                                }
//                                if (result2.get(key2).equals(GSMSignal)) {
//                                    continue;
//                                }
//                                result.put("InfoType", "报警0x10");
//                                result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                                result.put("MsgTime", MsgAlm_MsgTime);
//                                result.put("sql_id", "GSMSignal");
//                                result.put("kmx_id", key2);
//                                result.put("sql_value", GSMSignal);
//                                result.put("kmx_value", result2.get(key2));
//                                listout.add(result);
//
//                                result = new HashMap<>();
//                            }
//                        }
//                    }
//                }
//            } else {
//                result.put("InfoType", "报警0x10");
//                result.put("Vcl_ID", MsgAlm_Vcl_ID);
//                result.put("MsgTime", MsgAlm_MsgTime);
//                result.put("kmx_value", "KMX无GPS数据");
//                listout.add(result);
//                result = new HashMap<>();
//            }
        }
        outputSql.put("EventCompare", listout);
    }
}
