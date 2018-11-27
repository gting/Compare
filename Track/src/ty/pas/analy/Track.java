package ty.pas.analy;


import java.util.stream.*;

import com.sagittarius3.bean.result.*;

import com.sagittarius3.util.TimeUtil;
import tykj.userfn.UserFunctionMultipleSql2;

import java.text.*;
import java.util.*;

public class Track extends UserFunctionMultipleSql2 {
    public void runOne(List<String> deviceList, Map<String, Map<String, List<Map<String, String>>>> sqlData, Map<String, Map<String, List<FloatPoint>>> floatInput, Map<String, Map<String, List<DoublePoint>>> doubleInput, Map<String, Map<String, List<StringPoint>>> stringInput, Map<String, Map<String, List<IntPoint>>> intInput, Map<String, Map<String, List<LongPoint>>> longInput, Map<String, Map<String, List<BooleanPoint>>> booleanInput, Map<String, Map<String, List<GeoPoint>>> geoInput, long startTime, long endTime) {
        String deviceID = deviceList.get(0);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Map<String, String>> sqllist = sqlData.get("V_Msg_Track").get(deviceID);
        if (sqllist.size() == 0) {
            return;
        }
        List<StringPoint> distList = stringInput.get(deviceID).get("TY_0002_00_48");
        List<StringPoint> distList2 = stringInput.get(deviceID).get("TY_0002_00_49");
        List<LongPoint> distList3 = longInput.get(deviceID).get("TY_0002_00_50");
        List<StringPoint> distList4 = stringInput.get(deviceID).get("TY_0002_00_51");
        List<StringPoint> distList5 = stringInput.get(deviceID).get("TY_0002_00_854");
        List<StringPoint> distList6 = stringInput.get(deviceID).get("TY_0002_00_855");
        List<StringPoint> distList7 = stringInput.get(deviceID).get("TY_0002_00_47");
        List<StringPoint> distList8 = stringInput.get(deviceID).get("TY_0002_00_856");
        List<StringPoint> distList9 = stringInput.get(deviceID).get("PP_0001_00_16785831_Track");
        List<StringPoint> distList10 = stringInput.get(deviceID).get("PP_0001_00_16785842_Track");
        List<DoublePoint> distList11 = doubleInput.get(deviceID).get("PP_0001_00_16824469_Track");
        List<IntPoint> distList12 = intInput.get(deviceID).get("PP_0001_00_16824596_Track");
        List<IntPoint> distList13 = intInput.get(deviceID).get("PP_0001_00_16815922_Track");
        List<IntPoint> distList14 = intInput.get(deviceID).get("PP_0001_00_16785187_Track");
        List<IntPoint> distList15 = intInput.get(deviceID).get("PP_0001_00_16824385_Track");
        List<IntPoint> distList16 = intInput.get(deviceID).get("PP_0001_00_16801893_Track");
        List<IntPoint> distList17 = intInput.get(deviceID).get("PP_0001_00_16784911_Track");
        List<IntPoint> distList18 = intInput.get(deviceID).get("PP_0001_00_16791331_Track");
        List<IntPoint> distList19 = intInput.get(deviceID).get("PP_0001_00_16824427_Track");
        List<IntPoint> distList20 = intInput.get(deviceID).get("PP_0001_00_16785223_Track");
        List<StringPoint> distList21 = stringInput.get(deviceID).get("TY_0002_00_911");
        List<IntPoint> distList22 = intInput.get(deviceID).get("TY_0002_00_912");
        List<AbstractPoint> alldata = new ArrayList<AbstractPoint>();
        List<String> list = new ArrayList<String>();
        if (distList != null) {
            alldata.addAll(distList);
            list.add("TY_0002_00_48");
        }
        if (distList2 != null) {
            alldata.addAll(distList2);
            list.add("TY_0002_00_49");
        }
        if (distList3 != null) {
            alldata.addAll(distList3);
            list.add("TY_0002_00_50");
        }
        if (distList4 != null) {
            alldata.addAll(distList4);
            list.add("TY_0002_00_51");
        }
        if (distList5 != null) {
            alldata.addAll(distList5);
            list.add("TY_0002_00_854");
        }
        if (distList6 != null) {
            alldata.addAll(distList6);
            list.add("TY_0002_00_855");
        }
        if (distList7 != null) {
            alldata.addAll(distList7);
            list.add("TY_0002_00_47");
        }
        if (distList8 != null) {
            alldata.addAll(distList8);
            list.add("TY_0002_00_856");
        }
        if (distList9 != null) {
            alldata.addAll(distList9);
            list.add("PP_0001_00_16785831_Track");
        }
        if (distList10 != null) {
            alldata.addAll(distList10);
            list.add("PP_0001_00_16785842_Track");
        }
        if (distList11 != null) {
            alldata.addAll(distList11);
            list.add("PP_0001_00_16824469_Track");
        }
        if (distList12 != null) {
            alldata.addAll(distList12);
            list.add("PP_0001_00_16824596_Track");
        }
        if (distList13 != null) {
            alldata.addAll(distList13);
            list.add("PP_0001_00_16815922_Track");
        }
        if (distList14 != null) {
            alldata.addAll((distList14));
            list.add("PP_0001_00_16785187_Track");
        }
        if (distList15 != null) {
            alldata.addAll((distList15));
            list.add("PP_0001_00_16824385_Track");
        }
        if (distList16 != null) {
            alldata.addAll(distList16);
            list.add("PP_0001_00_16801893_Track");
        }
        if (distList17 != null) {
            alldata.addAll(distList17);
            list.add("PP_0001_00_16784911_Track");
        }
        if (distList18 != null) {
            alldata.addAll(distList18);
            list.add("PP_0001_00_16791331_Track");
        }
        if (distList19 != null) {
            alldata.addAll(distList19);
            list.add("PP_0001_00_16824427_Track");
        }
        if (distList20 != null) {
            alldata.addAll(distList20);
            list.add("PP_0001_00_16785223_Track");
        }
        if (distList21 != null) {
            alldata.addAll(distList21);
            list.add("TY_0002_00_911");
        }
        if (distList22 != null) {
            alldata.addAll(distList22);
            list.add("TY_0002_00_912");
        }
        List<HashMap<String, Object>> listout = new ArrayList<>();
        Map<Long, List<AbstractPoint>> resultMap = alldata.stream().collect(
                Collectors.groupingBy(AbstractPoint::getPrimaryTime));

        if (list == null || resultMap == null || resultMap.keySet().size() == 0) {
            HashMap<String, Object> result = new HashMap<>();

            result.put("Vcl_ID", deviceID);
            result.put("kmx_value", "kmx无该设备数据");
            listout.add(result);
            outputSql.put("EventCompare",listout);
            return;
        }
        int n=0;
        for (Map<String, String> smap : sqllist) {
            HashMap<String, Object> result = new HashMap<>();
            String MsgTK_ID = smap.get("MsgTk_ID");
            String MsgTk_Vcl_ID = smap.get("MsgTk_Vcl_ID");
            String MsgTk_MsgTime = smap.get("MsgTk_MsgTime");
            String MsgTk_PartNo = smap.get("MsgTk_PartNo");
            String MsgTk_ProductNo = smap.get("MsgTk_ProductNo");
            String MsgTk_NominalTime = smap.get("MsgTk_NominalTime");
            String MsgTk_NominalSoftWare = smap.get("MsgTk_NominalSoftWare");
            String MsgTk_EgnMode = smap.get("MsgTk_EgnMode");
//            if (MsgTk_EgnMode != null) {
//                MsgTk_EgnMode = smap.get("MsgTk_EgnMode").replaceAll(" ", "");
//            }
//            MsgTk_EgnMode = smap.get("MsgTk_EgnMode");
            String MsgTk_ProductSerialNo = smap.get("MsgTk_ProductSerialNo");
//            if (MsgTk_ProductSerialNo != null) {
//                MsgTk_ProductSerialNo = smap.get("MsgTk_ProductSerialNo").replaceAll(" ", "");
//            }

            String MsgTk_NominalCode = smap.get("MsgTk_NominalCode");
            String MsgTk_VINCode = smap.get("MsgTk_VINCode");
//            if (MsgTk_VINCode != null) {
//                MsgTk_VINCode = smap.get("MsgTk_VINCode").replaceAll(" ", "");
//            }
            String MsgTk_ECM = smap.get("MsgTk_ECM");
//            if (MsgTk_ECM != null) {
//                MsgTk_ECM = smap.get("MsgTk_ECM").replaceAll(" ", "");
//            }
            String MsgTk_VclMode = smap.get("MsgTk_VclMode");
//            if (MsgTk_VclMode != null) {
//                MsgTk_VclMode = smap.get("MsgTk_VclMode").replaceAll(" ", "");
//            }
            String MsgTk_EBPState = smap.get("MsgTk_EBPState");
            String MsgTk_EBPMaxSpeed = smap.get("MsgTk_EBPMaxSpeed");
            String MsgTk_Acceleration = smap.get("MsgTk_Acceleration");
            String MsgTk_ShiftDownProtected = smap.get("MsgTk_ShiftDownProtected");
            String MsgTk_SpeedControl = smap.get("MsgTk_SpeedControl");
            String MsgTk_IdleSpeedHalt = smap.get("MsgTk_IdleSpeedHalt");
            String MsgTk_CruiseState = smap.get("MsgTk_CruiseState");
            String MsgTk_GuardState = smap.get("MsgTk_GuardState");
            String MsgTk_EBPEnableState = smap.get("MsgTk_EBPEnableState");
            String MsgTk_CruiseControlEnable = smap.get("MsgTk_CruiseControlEnable");
            String MsgTk_EngineManufacturer = smap.get("MsgTk_EngineManufacturer");
            String MsgTk_ProductSign = smap.get("MsgTk_ProductSign");
            long time = 0L;
            long time2 = 0L;
            try {
                time = TimeUtil.string2Date(MsgTk_MsgTime);
                if (MsgTk_NominalTime != null) {
                    time2 = TimeUtil.string2Date(MsgTk_NominalTime);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
            List<AbstractPoint> listpoint = resultMap.get(time);
            if (listpoint != null) {
                for (AbstractPoint ap : listpoint) {
                    if (ap.getMetric().equals("TY_0002_00_48")) {
                        StringPoint ap2 = (StringPoint) ap;
                        if (MsgTk_PartNo == null && ap2.getValue() != null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_PartNo");
                            result.put("kmx_id", "TY_0002_00_48");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();

                        } else if (MsgTk_PartNo != null && ap2.getValue() == null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_PartNo");
                            result.put("kmx_id", "TY_0002_00_48");
                            result.put("sql_value", MsgTk_PartNo);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        } else {
                            if (!MsgTk_PartNo.equals(ap2.getValue().trim())) {
                                System.out.println("sql"+MsgTk_PartNo.length());
                                System.out.println("kmx"+ap2.getValue().length());
                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);
                                result.put("sql_id", "MsgTk_PartNo");
                                result.put("kmx_id", "TY_0002_00_48");
                                result.put("sql_value", MsgTk_PartNo);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_49")) {
                        StringPoint ap2 = (StringPoint) ap;
                        if (MsgTk_ProductNo == null && ap2.getValue() != null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_ProductNo");
                            result.put("kmx_id", "TY_0002_00_49");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_ProductNo != null && ap2.getValue() == null) {

                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_ProductNo");
                            result.put("kmx_id", "TY_0002_00_49");
                            result.put("sql_value", MsgTk_ProductNo);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        } else {
                            if (MsgTk_ProductNo.equals(ap2.getValue())) {
                                continue;
                            }
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_ProductNo");
                            result.put("kmx_id", "TY_0002_00_49");
                            result.put("sql_value", MsgTk_ProductNo);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_50")) {
                        LongPoint ap3 = (LongPoint) ap;
                        if (MsgTk_NominalTime == null && String.valueOf(ap3.getValue()) != null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_NominalTime");
                            result.put("kmx_id", "TY_0002_00_50");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_NominalTime != null && String.valueOf(ap3.getValue()) == null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_NominalTime");
                            result.put("kmx_id", "TY_0002_00_50");
                            result.put("sql_value", MsgTk_NominalTime);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        } else {
                            if (String.valueOf(time2).equals(String.valueOf(ap3.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_NominalTime");
                            result.put("kmx_id", "TY_0002_00_50");
                            result.put("sql_value", MsgTk_NominalTime);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_51")) {
                        StringPoint ap2 = (StringPoint) ap;
                        if (MsgTk_NominalSoftWare == null && ap2.getValue() != null) {

                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_NominalSoftWare");
                            result.put("kmx_id", "TY_0002_00_51");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_NominalSoftWare != null && ap2.getValue() == null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_NominalSoftWare");
                            result.put("kmx_id", "TY_0002_00_51");
                            result.put("sql_value", MsgTk_NominalSoftWare);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        } else {
                            if (Jsonsplit.splitJson(MsgTk_NominalSoftWare).equals(Jsonsplit.splitJson(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_NominalSoftWare");
                            result.put("kmx_id", "TY_0002_00_51");
                            result.put("sql_value", MsgTk_NominalSoftWare);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_854")) {
                        StringPoint ap2 = (StringPoint) ap;
                        if (MsgTk_EgnMode == null && ap2.getValue() != null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_EgnMode");
                            result.put("kmx_id", "TY_0002_00_854");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_EgnMode != null && ap2.getValue() == null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_EgnMode");
                            result.put("kmx_id", "TY_0002_00_854");
                            result.put("sql_value", MsgTk_EgnMode);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        if (MsgTk_EgnMode != null && ap2.getValue() != null) {
                            if (MsgTk_EgnMode.matches("^[A-Za-z0-9]*$") && !ap2.getValue().matches("^[A-Za-z0-9]*$")) {
                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);
                                result.put("sql_id", "MsgTk_EgnMode");
                                result.put("kmx_id", "TY_0002_00_854");
                                result.put("sql_value", MsgTk_EgnMode);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (!MsgTk_EgnMode.matches("^[A-Za-z0-9]*$") && ap2.getValue().matches("^[A-Za-z0-9]*$")) {

                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);
                                result.put("sql_id", "MsgTk_EgnMode");
                                result.put("kmx_id", "TY_0002_00_854");
                                result.put("sql_value", MsgTk_EgnMode);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (!MsgTk_EgnMode.matches("^[A-Za-z0-9]*$") && !ap2.getValue().matches("^[A-Za-z0-9]*$")) {
                                continue;
                            }
                            if (MsgTk_EgnMode.matches("^[A-Za-z0-9]*$") && ap2.getValue().matches("^[A-Za-z0-9]*$")) {
                                if (MsgTk_EgnMode.equals(ap2.getValue())) {
                                    continue;
                                }

                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);
                                result.put("sql_id", "MsgTk_EgnMode");
                                result.put("kmx_id", "TY_0002_00_854");
                                result.put("sql_value", MsgTk_EgnMode);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_855")) {
                        StringPoint ap2 = (StringPoint) ap;
                        if (MsgTk_ProductSerialNo == null && ap2.getValue() != null) {

                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_ProductSerialNo");
                            result.put("kmx_id", "TY_0002_00_855");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_ProductSerialNo != null && ap2.getValue() == null) {

                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);

                            result.put("sql_id", "MsgTk_ProductSerialNo");
                            result.put("kmx_id", "TY_0002_00_855");
                            result.put("sql_value", MsgTk_ProductSerialNo);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        if (MsgTk_ProductSerialNo != null && ap2.getValue() != null) {
                            if (MsgTk_ProductSerialNo.matches("^[A-Za-z0-9]*$") && !ap2.getValue().matches("^[A-Za-z0-9]*$")) {

                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);

                                result.put("sql_id", "MsgTk_ProductSerialNo");
                                result.put("kmx_id", "TY_0002_00_855");
                                result.put("sql_value", MsgTk_ProductSerialNo);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (!MsgTk_ProductSerialNo.matches("^[A-Za-z0-9]*$") && ap2.getValue().matches("^[A-Za-z0-9]*$")) {


                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);
                                result.put("sql_id", "MsgTk_ProductSerialNo");
                                result.put("kmx_id", "TY_0002_00_855");
                                result.put("sql_value", MsgTk_ProductSerialNo);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (!MsgTk_ProductSerialNo.matches("^[A-Za-z0-9]*$") && !ap2.getValue().matches("^[A-Za-z0-9]*$")) {
                                continue;
                            }
                            if (MsgTk_ProductSerialNo.matches("^[A-Za-z0-9]*$") && ap2.getValue().matches("^[A-Za-z0-9]*$")) {
                                if (MsgTk_ProductSerialNo.equals(ap2.getValue())) {
                                    continue;
                                }

                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);

                                result.put("sql_id", "MsgTk_ProductSerialNo");
                                result.put("kmx_id", "TY_0002_00_855");
                                result.put("sql_value", MsgTk_ProductSerialNo);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_47")) {
                        StringPoint ap2 = (StringPoint) ap;
                        if (MsgTk_NominalCode == null && ap2.getValue() != null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);


                            result.put("sql_id", "MsgTk_NominalCode");
                            result.put("kmx_id", "TY_0002_00_47");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_NominalCode != null && ap2.getValue() == null) {

                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);

                            result.put("sql_id", "MsgTk_NominalCode");
                            result.put("kmx_id", "TY_0002_00_47");
                            result.put("sql_value", MsgTk_NominalCode);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        if (MsgTk_NominalCode != null && ap2.getValue() != null) {
                            if (MsgTk_NominalCode.matches("^[A-Za-z0-9]*$") && !ap2.getValue().matches("^[A-Za-z0-9]*$")) {


                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);
                                result.put("sql_id", "MsgTk_NominalCode");
                                result.put("kmx_id", "TY_0002_00_47");
                                result.put("sql_value", MsgTk_NominalCode);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (!MsgTk_NominalCode.matches("^[A-Za-z0-9]*$") && ap2.getValue().matches("^[A-Za-z0-9]*$")) {


                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);
                                result.put("sql_id", "MsgTk_NominalCode");
                                result.put("kmx_id", "TY_0002_00_47");
                                result.put("sql_value", MsgTk_NominalCode);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (!MsgTk_NominalCode.matches("^[A-Za-z0-9]*$") && !ap2.getValue().matches("^[A-Za-z0-9]*$")) {
                                continue;
                            }
                            if (MsgTk_NominalCode.matches("^[A-Za-z0-9]*$") && ap2.getValue().matches("^[A-Za-z0-9]*$")) {
                                if (MsgTk_NominalCode.equals(ap2.getValue())) {
                                    continue;
                                }


                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);
                                result.put("sql_id", "MsgTk_NominalCode");
                                result.put("kmx_id", "TY_0002_00_47");
                                result.put("sql_value", MsgTk_NominalCode);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_856")) {
                        StringPoint ap2 = (StringPoint) ap;
                        if (MsgTk_VINCode == null && ap2.getValue() != null) {

                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);

                            result.put("sql_id", "MsgTk_VINCode");
                            result.put("kmx_id", "TY_0002_00_856");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_VINCode != null && ap2.getValue() == null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);


                            result.put("sql_id", "MsgTk_VINCode");
                            result.put("kmx_id", "TY_0002_00_856");
                            result.put("sql_value", MsgTk_VINCode);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        if (MsgTk_VINCode != null && ap2.getValue() != null) {
                            if (MsgTk_VINCode.matches("^[A-Za-z0-9]*$") && !ap2.getValue().matches("^[A-Za-z0-9]*$")) {
                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);


                                result.put("sql_id", "MsgTk_VINCode");
                                result.put("kmx_id", "TY_0002_00_856");
                                result.put("sql_value", MsgTk_VINCode);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (!MsgTk_VINCode.matches("^[A-Za-z0-9]*$") && ap2.getValue().matches("^[A-Za-z0-9]*$")) {

                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);

                                result.put("sql_id", "MsgTk_VINCode");
                                result.put("kmx_id", "TY_0002_00_856");
                                result.put("sql_value", MsgTk_VINCode);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (MsgTk_VINCode.matches("^[A-Za-z0-9]*$") && ap2.getValue().matches("^[A-Za-z0-9]*$")) {
                                if (MsgTk_VINCode.equals(ap2.getValue())) {
                                    continue;
                                }

                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);

                                result.put("sql_id", "MsgTk_VINCode");
                                result.put("kmx_id", "TY_0002_00_856");
                                result.put("sql_value", MsgTk_VINCode);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            //如果不是ASCII码，不参与比较
                            if (!MsgTk_VINCode.matches("^[A-Za-z0-9]*$") && !ap2.getValue().matches("^[A-Za-z0-9]*$")) {
                                continue;
                            }
                        }
                    }
                    if (ap.getMetric().equals("PP_0001_00_16785831_Track")) {
                        StringPoint ap2 = (StringPoint) ap;
                        if (MsgTk_ECM == null && ap2.getValue() != null) {


                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_ECM");
                            result.put("kmx_id", "PP_0001_00_16785831_Track");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_ECM != null && ap2.getValue() == null) {


                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_ECM");
                            result.put("kmx_id", "PP_0001_00_16785831_Track");
                            result.put("sql_value", MsgTk_ECM);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        if (MsgTk_ECM != null && ap2.getValue() != null) {
                            if (MsgTk_ECM.matches("^[A-Za-z0-9]*$") && !ap2.getValue().matches("^[A-Za-z0-9]*$")) {

                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);

                                result.put("sql_id", "MsgTk_ECM");
                                result.put("kmx_id", "TY_0002_00_854");
                                result.put("sql_value", MsgTk_ECM);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (!MsgTk_ECM.matches("^[A-Za-z0-9]*$") && ap2.getValue().matches("^[A-Za-z0-9]*$")) {


                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);
                                result.put("sql_id", "MsgTk_ECM");
                                result.put("kmx_id", "TY_0002_00_854");
                                result.put("sql_value", MsgTk_ECM);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (!MsgTk_ECM.matches("^[A-Za-z0-9]*$") && !ap2.getValue().matches("^[A-Za-z0-9]*$")) {
                                continue;
                            }
                            if (MsgTk_ECM.matches("^[A-Za-z0-9]*$") && ap2.getValue().matches("^[A-Za-z0-9]*$")) {
                                if (MsgTk_ECM.equals(ap2.getValue())) {
                                    continue;
                                }
                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);


                                result.put("sql_id", "MsgTk_ECM");
                                result.put("kmx_id", "PP_0001_00_16785831_Track");
                                result.put("sql_value", MsgTk_ECM);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                        }
                    }
                    if (ap.getMetric().equals("PP_0001_00_16785842_Track")) {
                        StringPoint ap2 = (StringPoint) ap;
                        String kmx_value = ap2.getValue().replaceAll(" ", "");
                        if (MsgTk_VclMode == null && ap2.getValue() != null) {


                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_VclMode");
                            result.put("kmx_id", "PP_0001_00_16785842_Track");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_VclMode != null && ap2.getValue() == null) {


                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_VclMode");
                            result.put("kmx_id", "PP_0001_00_16785842_Track");
                            result.put("sql_value", MsgTk_VclMode);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        if (MsgTk_VclMode != null && ap2.getValue() != null) {
                            if (MsgTk_VclMode.matches("^[A-Za-z0-9]*$") && !ap2.getValue().matches("^[A-Za-z0-9]*$")) {


                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);
                                result.put("sql_id", "MsgTk_VclMode");
                                result.put("kmx_id", "TY_0002_00_854");
                                result.put("sql_value", MsgTk_VclMode);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (!MsgTk_VclMode.matches("^[A-Za-z0-9]*$") && ap2.getValue().matches("^[A-Za-z0-9]*$")) {

                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);

                                result.put("sql_id", "MsgTk_VclMode");
                                result.put("kmx_id", "TY_0002_00_854");
                                result.put("sql_value", MsgTk_VclMode);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (!MsgTk_VclMode.matches("^[A-Za-z0-9]*$") && !ap2.getValue().matches("^[A-Za-z0-9]*$")) {
                                continue;
                            }
                            if (MsgTk_VclMode.matches("^[A-Za-z0-9]*$") && ap2.getValue().matches("^[A-Za-z0-9]*$")) {
                                if (MsgTk_VclMode.equals(kmx_value)) {
                                    continue;
                                }

                                result.put("InfoType", "车辆跟踪信息");
                                result.put("Vcl_ID", MsgTk_Vcl_ID);
                                result.put("MsgTime", MsgTk_MsgTime);
                                result.put("sql_id", "MsgTk_VclMode");
                                result.put("kmx_id", "PP_0001_00_16785842_Track");
                                result.put("sql_value", MsgTk_VclMode);
                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                listout.add(result);
                                result = new HashMap<>();

                            }
                        }
                    }
                    if (ap.getMetric().equals("PP_0001_00_16824469_Track")) {
                        DoublePoint ap4 = (DoublePoint) ap;
                        if (MsgTk_EBPState == null && String.valueOf(ap4.getValue()) != null) {


                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_EBPState");
                            result.put("kmx_id", "PP_0001_00_16824469_Track");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap4.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_EBPState != null && String.valueOf(ap4.getValue()) == null) {

                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);

                            result.put("sql_id", "MsgTk_EBPState");
                            result.put("kmx_id", "PP_0001_00_16824469_Track");
                            result.put("sql_value", MsgTk_EBPState);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        } else {
                            if (MsgTk_EBPState.equals(String.valueOf(ap4.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_EBPState");
                            result.put("kmx_id", "PP_0001_00_16824469_Track");
                            result.put("sql_value", MsgTk_EBPState);
                            result.put("kmx_value", String.valueOf(ap4.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("PP_0001_00_16824596_Track")) {
                        IntPoint ap5 = (IntPoint) ap;
                        if (MsgTk_EBPMaxSpeed == null && String.valueOf(ap5.getValue()) != null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_EBPMaxSpeed");
                            result.put("kmx_id", "PP_0001_00_16824596_Track");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_EBPMaxSpeed != null && String.valueOf(ap5.getValue()) == null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_EBPMaxSpeed");
                            result.put("kmx_id", "PP_0001_00_16824596_Track");
                            result.put("sql_value", MsgTk_EBPMaxSpeed);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        } else {
                            if (MsgTk_EBPMaxSpeed.equals(String.valueOf(ap5.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_EBPMaxSpeed");
                            result.put("kmx_id", "PP_0001_00_16824596_Track");
                            result.put("sql_value", MsgTk_EBPMaxSpeed);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("PP_0001_00_16815922_Track")) {
                        IntPoint ap5 = (IntPoint) ap;
                        if (MsgTk_Acceleration == null && String.valueOf(ap5.getValue()) != null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_Acceleration");
                            result.put("kmx_id", "PP_0001_00_16815922_Track");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_Acceleration != null && String.valueOf(ap5.getValue()) == null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_Acceleration");
                            result.put("kmx_id", "PP_0001_00_16815922_Track");
                            result.put("sql_value", MsgTk_Acceleration);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        } else {
                            if (MsgTk_Acceleration.equals(String.valueOf(ap5.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_Acceleration");
                            result.put("kmx_id", "PP_0001_00_16815922_Track");
                            result.put("sql_value", MsgTk_Acceleration);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("PP_0001_00_16785187_Track")) {
                        IntPoint ap5 = (IntPoint) ap;
                        if (MsgTk_ShiftDownProtected == null && String.valueOf(ap5.getValue()) != null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_ShiftDownProtected");
                            result.put("kmx_id", "PP_0001_00_16785187_Track");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();

                        } else if (MsgTk_ShiftDownProtected != null && String.valueOf(ap5.getValue()) == null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_ShiftDownProtected");
                            result.put("kmx_id", "PP_0001_00_16785187_Track");
                            result.put("sql_value", MsgTk_ShiftDownProtected);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();

                        } else {
                            if (MsgTk_ShiftDownProtected.equals(String.valueOf(ap5.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_ShiftDownProtected");
                            result.put("kmx_id", "PP_0001_00_16785187_Track");
                            result.put("sql_value", MsgTk_ShiftDownProtected);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();

                        }
                    }
                    if (ap.getMetric().equals("PP_0001_00_16824385_Track")) {
                        IntPoint ap5 = (IntPoint) ap;
                        if (MsgTk_SpeedControl == null && String.valueOf(ap5.getValue()) != null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_SpeedControl");
                            result.put("kmx_id", "PP_0001_00_16824385_Track");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();

                        } else if (MsgTk_SpeedControl != null && String.valueOf(ap5.getValue()) == null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_SpeedControl");
                            result.put("kmx_id", "PP_0001_00_16824385_Track");
                            result.put("sql_value", MsgTk_SpeedControl);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result=new HashMap<>();

                        } else {
                            if (MsgTk_SpeedControl.equals(String.valueOf(ap5.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_SpeedControl");
                            result.put("kmx_id", "PP_0001_00_16824385_Track");
                            result.put("sql_value", MsgTk_SpeedControl);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result=new HashMap<>();

                        }
                    }
                    if (ap.getMetric().equals("PP_0001_00_16801893_Track")) {
                        IntPoint ap5 = (IntPoint) ap;
                        if (MsgTk_IdleSpeedHalt == null && String.valueOf(ap5.getValue()) != null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_IdleSpeedHalt");
                            result.put("kmx_id", "PP_0001_00_16801893_Track");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result=new HashMap<>();

                        } else if (MsgTk_IdleSpeedHalt != null && String.valueOf(ap5.getValue()) == null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_IdleSpeedHalt");
                            result.put("kmx_id", "PP_0001_00_16801893_Track");
                            result.put("sql_value", MsgTk_IdleSpeedHalt);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result=new HashMap<>();

                        } else {
                            if (MsgTk_IdleSpeedHalt.equals(String.valueOf(ap5.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_IdleSpeedHalt");
                            result.put("kmx_id", "PP_0001_00_16801893_Track");
                            result.put("sql_value", MsgTk_IdleSpeedHalt);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("PP_0001_00_16784911_Track")) {
                        IntPoint ap5 = (IntPoint) ap;
                        if (MsgTk_CruiseState == null && String.valueOf(ap5.getValue()) != null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_CruiseState");
                            result.put("kmx_id", "PP_0001_00_16784911_Track");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_CruiseState != null && String.valueOf(ap5.getValue()) == null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_CruiseState");
                            result.put("kmx_id", "PP_0001_00_16784911_Track");
                            result.put("sql_value", MsgTk_CruiseState);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        } else {
                            if (MsgTk_CruiseState.equals(String.valueOf(ap5.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_CruiseState");
                            result.put("kmx_id", "PP_0001_00_16784911_Track");
                            result.put("sql_value", MsgTk_CruiseState);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("PP_0001_00_16791331_Track")) {
                        IntPoint ap5 = (IntPoint) ap;
                        if (MsgTk_GuardState == null && String.valueOf(ap5.getValue()) != null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_GuardState");
                            result.put("kmx_id", "PP_0001_00_16791331_Track");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_GuardState != null && String.valueOf(ap5.getValue()) == null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_GuardState");
                            result.put("kmx_id", "PP_0001_00_16791331_Track");
                            result.put("sql_value", MsgTk_GuardState);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        } else {
                            if (MsgTk_GuardState.equals(String.valueOf(ap5.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_GuardState");
                            result.put("kmx_id", "PP_0001_00_16791331_Track");
                            result.put("sql_value", MsgTk_GuardState);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("PP_0001_00_16824427_Track")) {
                        IntPoint ap5 = (IntPoint) ap;
                        if (MsgTk_EBPEnableState == null && String.valueOf(ap5.getValue()) != null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_EBPEnableState");
                            result.put("kmx_id", "PP_0001_00_16824427_Track");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_EBPEnableState != null && String.valueOf(ap5.getValue()) == null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_EBPEnableState");
                            result.put("kmx_id", "PP_0001_00_16824427_Track");
                            result.put("sql_value", MsgTk_EBPEnableState);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        } else {
                            if (MsgTk_EBPEnableState.equals(String.valueOf(ap5.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_EBPEnableState");
                            result.put("kmx_id", "PP_0001_00_16824427_Track");
                            result.put("sql_value", MsgTk_EBPEnableState);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("PP_0001_00_16785223_Track")) {
                        IntPoint ap5 = (IntPoint) ap;
                        if (MsgTk_CruiseControlEnable == null && String.valueOf(ap5.getValue()) != null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_CruiseControlEnable");
                            result.put("kmx_id", "PP_0001_00_16785223_Track");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_CruiseControlEnable != null && String.valueOf(ap5.getValue()) == null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_CruiseControlEnable");
                            result.put("kmx_id", "PP_0001_00_16785223_Track");
                            result.put("sql_value", MsgTk_CruiseControlEnable);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        } else {
                            if (MsgTk_CruiseControlEnable.equals(String.valueOf(ap5.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_CruiseControlEnable");
                            result.put("kmx_id", "PP_0001_00_16785223_Track");
                            result.put("sql_value", MsgTk_CruiseControlEnable);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_911")) {
                        StringPoint ap2 = (StringPoint) ap;
                        if (MsgTk_EngineManufacturer == null && ap2.getValue() != null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_EngineManufacturer");
                            result.put("kmx_id", "TY_0002_00_911");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_EngineManufacturer != null && ap2.getValue() == null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_EngineManufacturer");
                            result.put("kmx_id", "TY_0002_00_911");
                            result.put("sql_value", MsgTk_EngineManufacturer);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        } else {
                            if (MsgTk_EngineManufacturer.equals(ap2.getValue())) {
                                continue;
                            }
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_EngineManufacturer");
                            result.put("kmx_id", "TY_0002_00_911");
                            result.put("sql_value", MsgTk_EngineManufacturer);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_912")) {
                        IntPoint ap5 = (IntPoint) ap;
                        if (MsgTk_ProductSign == null && String.valueOf(ap5.getValue()) != null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_ProductSign");
                            result.put("kmx_id", "TY_0002_00_912");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        } else if (MsgTk_ProductSign != null && String.valueOf(ap5.getValue()) == null) {
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_ProductSign");
                            result.put("kmx_id", "TY_0002_00_912");
                            result.put("sql_value", MsgTk_ProductSign);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        } else {
                            if (MsgTk_ProductSign.equals(String.valueOf(ap5.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "车辆跟踪信息");
                            result.put("Vcl_ID", MsgTk_Vcl_ID);
                            result.put("MsgTime", MsgTk_MsgTime);
                            result.put("sql_id", "MsgTk_ProductSign");
                            result.put("kmx_id", "TY_0002_00_912");
                            result.put("sql_value", MsgTk_ProductSign);
                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                }
                if (!list.contains("TY_0002_00_48") && MsgTk_PartNo != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_PartNo");
                    result.put("sql_value", MsgTk_PartNo);
                    result.put("kmx_id", "TY_0002_00_48");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_49") && MsgTk_ProductNo != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_ProductNo");
                    result.put("sql_value", MsgTk_ProductNo);
                    result.put("kmx_id", "TY_0002_00_49");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_50") && MsgTk_NominalTime != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_NominalTime");
                    result.put("sql_value", MsgTk_NominalTime);
                    result.put("kmx_id", "TY_0002_00_50");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_51") && MsgTk_NominalSoftWare != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_NominalSoftWare");
                    result.put("sql_value", MsgTk_NominalSoftWare);
                    result.put("kmx_id", "TY_0002_00_51");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_854") && MsgTk_EgnMode != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_EgnMode");
                    result.put("sql_value", MsgTk_EgnMode);
                    result.put("kmx_id", "TY_0002_00_854");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_855") && MsgTk_ProductSerialNo != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_ProductSerialNo");
                    result.put("sql_value", MsgTk_ProductSerialNo);
                    result.put("kmx_id", "TY_0002_00_855");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_47") && MsgTk_NominalCode != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_NominalCode");
                    result.put("sql_value", MsgTk_NominalCode);
                    result.put("kmx_id", "TY_0002_00_47");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_856") && MsgTk_VINCode != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_VINCode");
                    result.put("sql_value", MsgTk_VINCode);
                    result.put("kmx_id", "TY_0002_00_856");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("PP_0001_00_16785831_Track") && MsgTk_ECM != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_ECM");
                    result.put("sql_value", MsgTk_ECM);
                    result.put("kmx_id", "PP_0001_00_16785831_Track");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("PP_0001_00_16785842_Track") && MsgTk_VclMode != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_VclMode");
                    result.put("sql_value", MsgTk_VclMode);
                    result.put("kmx_id", "PP_0001_00_16785842_Track");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("PP_0001_00_16824469_Track") && MsgTk_EBPState != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_EBPState");
                    result.put("sql_value", MsgTk_EBPState);
                    result.put("kmx_id", "PP_0001_00_16824469_Track");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("PP_0001_00_16824596_Track") && MsgTk_EBPMaxSpeed != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_EBPMaxSpeed");
                    result.put("sql_value", MsgTk_EBPMaxSpeed);
                    result.put("kmx_id", "PP_0001_00_16824596_Track");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("PP_0001_00_16815922_Track") && MsgTk_Acceleration != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_Acceleration");
                    result.put("sql_value", MsgTk_Acceleration);
                    result.put("kmx_id", "PP_0001_00_16815922_Track");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("PP_0001_00_16785187_Track") && MsgTk_ShiftDownProtected != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_ShiftDownProtected");
                    result.put("sql_value", MsgTk_ShiftDownProtected);
                    result.put("kmx_id", "PP_0001_00_16785187_Track");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("PP_0001_00_16824385_Track") && MsgTk_SpeedControl != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_SpeedControl");
                    result.put("sql_value", MsgTk_SpeedControl);
                    result.put("kmx_id", "PP_0001_00_16824385_Track");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("PP_0001_00_16801893_Track") && MsgTk_IdleSpeedHalt != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_IdleSpeedHalt");
                    result.put("sql_value", MsgTk_IdleSpeedHalt);
                    result.put("kmx_id", "PP_0001_00_16801893_Track");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("PP_0001_00_16784911_Track") && MsgTk_CruiseState != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_CruiseState");
                    result.put("sql_value", MsgTk_CruiseState);
                    result.put("kmx_id", "PP_0001_00_16784911_Track");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("PP_0001_00_16791331_Track") && MsgTk_GuardState != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_GuardState");
                    result.put("sql_value", MsgTk_GuardState);
                    result.put("kmx_id", "PP_0001_00_16791331_Track");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("PP_0001_00_16824427_Track") && MsgTk_EBPEnableState != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_EBPEnableState");
                    result.put("sql_value", MsgTk_EBPEnableState);
                    result.put("kmx_id", "PP_0001_00_16824427_Track");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("PP_0001_00_16785223_Track") && MsgTk_CruiseControlEnable != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_CruiseControlEnable");
                    result.put("sql_value", MsgTk_CruiseControlEnable);
                    result.put("kmx_id", "PP_0001_00_16785223_Track");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_911") && MsgTk_EngineManufacturer != null) {
                    result.put("InfoType", "车辆跟踪信息");
                    result.put("Vcl_ID", MsgTk_Vcl_ID);
                    result.put("MsgTime", MsgTk_MsgTime);
                    result.put("sql_id", "MsgTk_EngineManufacturer");
                    result.put("sql_value", MsgTk_EngineManufacturer);
                    result.put("kmx_id", "TY_0002_00_911");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (list.contains("TY_0002_00_912") || MsgTk_ProductSign == null) {
                    continue;
                }
                result.put("InfoType", "车辆跟踪信息");
                result.put("Vcl_ID", MsgTk_Vcl_ID);
                result.put("MsgTime", MsgTk_MsgTime);
                result.put("sql_id", "MsgTk_ProductSign");
                result.put("sql_value", MsgTk_ProductSign);
                result.put("kmx_id", "TY_0002_00_912");
                result.put("kmx_value", "kmx缺少数据");
                listout.add(result);
                result = new HashMap<>();
            } else {
                result.put("InfoType", "车辆跟踪信息");
                result.put("Vcl_ID", MsgTk_Vcl_ID);
                result.put("MsgTime", MsgTk_MsgTime);
                result.put("sql_id", "MsgTK_ID");
                result.put("sql_value", MsgTK_ID);
                result.put("kmx_value", "KMX无数据");
                listout.add(result);
                n++;
                result = new HashMap<>();
            }

        }
        System.out.println(n);
        outputSql.put("EventCompare",listout);
    }
}
