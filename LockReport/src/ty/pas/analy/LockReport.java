package ty.pas.analy;

import com.sagittarius3.bean.result.*;
import com.sagittarius3.util.TimeUtil;

import java.text.*;

import java.util.stream.*;
import java.math.*;
import java.util.*;
import com.alibaba.fastjson.*;

import tykj.userfn.UserFunctionMultipleSql2;

public class LockReport extends UserFunctionMultipleSql2
{
    public void runOne(List<String> deviceList, Map<String, Map<String, List<Map<String, String>>>> sqlData, Map<String, Map<String, List<FloatPoint>>> floatInput, Map<String, Map<String, List<DoublePoint>>> doubleInput, Map<String, Map<String, List<StringPoint>>> stringInput, Map<String, Map<String, List<IntPoint>>> intInput, Map<String, Map<String, List<LongPoint>>> longInput, Map<String, Map<String, List<BooleanPoint>>> booleanInput, Map<String, Map<String, List<GeoPoint>>> geoInput, long startTime, long endTime) {
         String deviceID = deviceList.get(0);
         SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         List<Map<String, String>> sqllist = sqlData.get("v_Msg_Lock_Report").get(deviceID);
        if (sqllist.size() == 0) {
            return;
        }
        List<HashMap<String, Object>> listout = new ArrayList<>();

         List<StringPoint> distList = stringInput.get(deviceID).get("TY_0002_00_5");
         List<IntPoint> distList2 = intInput.get(deviceID).get("TY_0002_00_25");
         List<IntPoint> distList3 = intInput.get(deviceID).get("TY_0002_00_26");
         List<IntPoint> distList4 = intInput.get(deviceID).get("TY_0002_00_27");
         List<IntPoint> distList5 = intInput.get(deviceID).get("TY_0002_00_29");
         List<IntPoint> distList6 = intInput.get(deviceID).get("TY_0002_00_30");
         List<IntPoint> distList7 = intInput.get(deviceID).get("TY_0002_00_31");
         List<IntPoint> distList8 = intInput.get(deviceID).get("TY_0002_00_33");
         List<IntPoint> distList9 = intInput.get(deviceID).get("TY_0002_00_34");
         List<IntPoint> distList10 = intInput.get(deviceID).get("TY_0002_00_35");
         List<AbstractPoint> alldata = new ArrayList<AbstractPoint>();
         List<String> list = new ArrayList<String>();
        if (distList != null) {
            alldata.addAll(distList);
            list.add("TY_0002_00_5");
        }
        if (distList2 != null) {
            alldata.addAll(distList2);
            list.add("TY_0002_00_25");
        }
        if (distList3 != null) {
            alldata.addAll(distList3);
            list.add("TY_0002_00_26");
        }
        if (distList4 != null) {
            alldata.addAll(distList4);
            list.add("TY_0002_00_27");
        }
        if (distList5 != null) {
            alldata.addAll(distList5);
            list.add("TY_0002_00_29");
        }
        if (distList6 != null) {
            alldata.addAll(distList6);
            list.add("TY_0002_00_30");
        }
        if (distList7 != null) {
            alldata.addAll(distList7);
            list.add("TY_0002_00_31");
        }
        if (distList8 != null) {
            alldata.addAll(distList8);
            list.add("TY_0002_00_33");
        }
        if (distList9 != null) {
            alldata.addAll(distList9);
            list.add("TY_0002_00_34");
        }
        if (distList10 != null) {
            alldata.addAll(distList10);
            list.add("TY_0002_00_35");
        }
        HashMap<String, Object> result = new HashMap<>();
        Map<Long, List<AbstractPoint>> resultMap = alldata.stream().collect(
                Collectors.groupingBy(AbstractPoint::getPrimaryTime));
        if (list == null || resultMap == null || resultMap.keySet().size() == 0) {
            result.put("InfoType", "锁车报告");
            result.put("Vcl_ID", deviceID);
            result.put("kmx_value", "kmx无该设备数据");
            listout.add(result);
            outputSql.put("",listout);
            return;
        }
        for ( Map<String, String> smap2 : sqllist) {
             String MsgLRpt_ID = smap2.get("MsgLRpt_ID");
             String MsgLRpt_Vcl_ID = smap2.get("MsgLRpt_Vcl_ID");
             String MsgLRpt_MsgTime2 = smap2.get("MsgLRpt_MsgTime");
             String MsgLRpt_La = smap2.get("MsgLRpt_La");
             String MsgLRpt_Lo = smap2.get("MsgLRpt_Lo");
             String MsgLRpt_Speed = smap2.get("MsgLRpt_Speed");
             String MsgLRpt_Direction = smap2.get("MsgLRpt_Direction");
             String MsgLRpt_Satellite = smap2.get("MsgLRpt_Satellite");
             String MsgLRpt_GSMSignal = smap2.get("MsgLRpt_GSMSignal");
             String MsgLRpt_L1TWork = smap2.get("MsgLRpt_L1TWork");
             String MsgLRpt_L1Schedule = smap2.get("MsgLRpt_L1Schedule");
             String MsgLRpt_L1Pstn = smap2.get("MsgLRpt_L1Pstn");
             String MsgLRpt_L2TWork = smap2.get("MsgLRpt_L2TWork");
             String MsgLRpt_L2Schedule = smap2.get("MsgLRpt_L2Schedule");
             String MsgLRpt_L2Pstn = smap2.get("MsgLRpt_L2Pstn");
             String MsgLRpt_L3TWork = smap2.get("MsgLRpt_L3TWork");
             String MsgLRpt_L3Schedule = smap2.get("MsgLRpt_L3Schedule");
             String MsgLRpt_L3Pstn = smap2.get("MsgLRpt_L3Pstn");
            long time2 = 0L;
            try {
                time2 = TimeUtil.string2Date(MsgLRpt_MsgTime2);
            }
            catch (ParseException e2) {
                e2.printStackTrace();
            }
             HashMap<String, Object> result2 = new HashMap<>();
             List<AbstractPoint> listpoint = resultMap.get(time2);
            if (listpoint != null) {
                for ( AbstractPoint ap : listpoint) {
                    if (ap.getMetric().equals("TY_0002_00_5")) {
                         StringPoint ap2 = (StringPoint)ap;
                         String jsongps = "[" + ap2.getValue() + "]";
                         JSONArray arrFC = JSON.parseArray(jsongps);
                        for (int i = 0; i < arrFC.size(); ++i) {
                             Map<String, Object> mapTypes = arrFC.getJSONObject(i);
                            for ( String key : mapTypes.keySet()) {
                                result2.put(key, mapTypes.get(key).toString());
                            }
                        }
                        for ( String key2 : result2.keySet()) {
                            if (key2.equals("Speed")) {
                                if (MsgLRpt_Speed == null && result2.get(key2) != null) {
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id", "MsgLRpt_Speed");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", null);
                                    result.put("kmx_value", result2.get(key2));
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                                else if (MsgLRpt_Speed != null && result2.get(key2) == null) {
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id", "MsgLRpt_Speed");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", MsgLRpt_Speed);
                                    result.put("kmx_value", null);
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                                else {
                                    if (MsgLRpt_Speed == null && result2.get(key2) == null) {
                                        continue;
                                    }
                                    if (Double.valueOf(result2.get(key2).toString()).equals(Double.valueOf(MsgLRpt_Speed))) {
                                        continue;
                                    }
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id", "MsgLRpt_Speed");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", MsgLRpt_Speed);
                                    result.put("kmx_value", result2.get(key2));
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                            }
                            if (key2.equals("Lo")) {
                                String Lo1 = null;
                                String Lo2 = null;
                                 BigDecimal b = new BigDecimal(Double.valueOf(result2.get(key2).toString()));
                                 BigDecimal b2 = new BigDecimal(MsgLRpt_Lo);
                                 int s = MsgLRpt_Lo.indexOf(".");
                                if (MsgLRpt_Lo.length() < result2.get(key2).toString().length()) {
                                    Lo1 = String.valueOf(b.setScale(MsgLRpt_Lo.length() - s - 1, 4).doubleValue());
                                }
                                if (MsgLRpt_Lo.length() > result2.get(key2).toString().length()) {
                                    Lo2 = String.valueOf(b2.setScale(result2.get(key2).toString().length() - s, 4).doubleValue());
                                }
                                if (MsgLRpt_Lo != null && result2.get(key2) == null) {
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id", "MsgLRpt_Lo");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", MsgLRpt_Lo);
                                    result.put("kmx_value", null);
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                                else if (Lo1 != null) {
                                    if (Lo1.equals(MsgLRpt_Lo)) {
                                        continue;
                                    }
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id", "MsgLRpt_Lo");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", MsgLRpt_Lo);
                                    result.put("kmx_value", result2.get(key2));
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                                else if (Lo2 != null) {
                                    if (Lo2.equals(MsgLRpt_Lo)) {
                                        continue;
                                    }
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id", "MsgLRpt_Lo");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", MsgLRpt_Lo);
                                    result.put("kmx_value", result2.get(key2));
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                            }
                            if (key2.equals("La")) {
                                 BigDecimal b3 = new BigDecimal(Double.valueOf(result2.get(key2).toString()));
                                 BigDecimal b4 = new BigDecimal(MsgLRpt_La);
                                String La1 = null;
                                String La2 = null;
                                 int s = MsgLRpt_La.indexOf(".");
                                if (MsgLRpt_La.length() < result2.get(key2).toString().length()) {
                                    La1 = String.valueOf(b3.setScale(MsgLRpt_La.length() - s - 1, 4).doubleValue());
                                }
                                if (MsgLRpt_La.length() > result2.get(key2).toString().length()) {
                                    La2 = String.valueOf(b4.setScale(result2.get(key2).toString().length() - s - 1, 4).doubleValue());
                                }
                                if (MsgLRpt_La != null && result2.get(key2) == null) {
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id", "MsgLRpt_La");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", MsgLRpt_La);
                                    result.put("kmx_value", null);
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                                else if (La1 != null) {
                                    if (La1.equals(MsgLRpt_La)) {
                                        continue;
                                    }
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id", "MsgLRpt_La");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", MsgLRpt_La);
                                    result.put("kmx_value", result2.get(key2));
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                                else if (La2 != null) {
                                    if (La2.equals(MsgLRpt_La)) {
                                        continue;
                                    }
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id", "MsgLRpt_La");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", MsgLRpt_La);
                                    result.put("kmx_value", result2.get(key2));
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                            }
                            if (key2.equals("Satellite")) {
                                if (MsgLRpt_Satellite == null && result2.get(key2) != null) {
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id", "MsgLRpt_Satellite");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", null);
                                    result.put("kmx_value", result2.get(key2));
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                                else if (MsgLRpt_Satellite != null && result2.get(key2) == null) {
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id", "MsgLRpt_Satellite");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", MsgLRpt_Satellite);
                                    result.put("kmx_value", null);
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                                else {
                                    if (MsgLRpt_Satellite == null && result2.get(key2) == null) {
                                        continue;
                                    }
                                    if (result2.get(key2).equals(MsgLRpt_Satellite)) {
                                        continue;
                                    }
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id", "MsgLRpt_Satellite");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", MsgLRpt_Satellite);
                                    result.put("kmx_value", result2.get(key2));
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                            }
                            if (key2.equals("Direction")) {
                                if (MsgLRpt_Direction == null && result2.get(key2) != null) {
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id:", "MsgLRpt_Direction");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", null);
                                    result.put("kmx_value", result2.get(key2));
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                                else if (MsgLRpt_Direction != null && result2.get(key2) == null) {
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id", "MsgLRpt_Direction");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", MsgLRpt_Direction);
                                    result.put("kmx_value", null);
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                                else {
                                    if (MsgLRpt_Direction == null && result2.get(key2) == null) {
                                        continue;
                                    }
                                    if (result2.get(key2).equals(MsgLRpt_Direction)) {
                                        continue;
                                    }
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id", "MsgLRpt_Direction");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", MsgLRpt_Direction);
                                    result.put("kmx_value", result2.get(key2));
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                            }
                            if (key2.equals("GSMSignal")) {
                                if (MsgLRpt_GSMSignal == null && result2.get(key2) != null) {
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id", "MsgLRpt_GSMSignal");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", null);
                                    result.put("kmx_value", result2.get(key2));
                                    listout.add(result);
                                }
                                else if (MsgLRpt_GSMSignal != null && result2.get(key2) == null) {
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id", "MsgLRpt_GSMSignal");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", MsgLRpt_GSMSignal);
                                    result.put("kmx_value", null);
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                                else {
                                    if (MsgLRpt_GSMSignal == null && result2.get(key2) == null) {
                                        continue;
                                    }
                                    if (result2.get(key2).equals(MsgLRpt_GSMSignal)) {
                                        continue;
                                    }
                                    result.put("InfoType", "锁车报告");
                                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                                    result.put("MsgTime", MsgLRpt_MsgTime2);
                                    result.put("sql_id", "MsgLRpt_GSMSignal");
                                    result.put("kmx_id", key2);
                                    result.put("sql_value", MsgLRpt_GSMSignal);
                                    result.put("kmx_value", result2.get(key2));
                                    listout.add(result);
                                    result = new HashMap<>();
                                }
                            }
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_25")) {
                         IntPoint ap3 = (IntPoint)ap;
                        if (MsgLRpt_L1TWork == null && String.valueOf(ap3.getValue()) != null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L1TWork");
                            result.put("kmx_id", "TY_0002_00_25");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgLRpt_L1TWork != null && String.valueOf(ap3.getValue()) == null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L1TWork");
                            result.put("kmx_id", "TY_0002_00_25");
                            result.put("sql_value", MsgLRpt_L1TWork);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgLRpt_L1TWork.equals(String.valueOf(ap3.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L1TWork");
                            result.put("kmx_id", "TY_0002_00_25");
                            result.put("sql_value", MsgLRpt_L1TWork);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_26")) {
                         IntPoint ap3 = (IntPoint)ap;
                        if (MsgLRpt_L1Schedule == null && String.valueOf(ap3.getValue()) != null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L1Schedule");
                            result.put("kmx_id", "TY_0002_00_26");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgLRpt_L1Schedule != null && String.valueOf(ap3.getValue()) == null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L1Schedule");
                            result.put("kmx_id", "TY_0002_00_26");
                            result.put("sql_value", MsgLRpt_L1Schedule);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgLRpt_L1Schedule.equals(String.valueOf(ap3.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L1Schedule");
                            result.put("kmx_id", "TY_0002_00_26");
                            result.put("sql_value", MsgLRpt_L1Schedule);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_27")) {
                         IntPoint ap3 = (IntPoint)ap;
                        if (MsgLRpt_L1Pstn == null && String.valueOf(ap3.getValue()) != null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L1Pstn");
                            result.put("kmx_id", "TY_0002_00_27");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgLRpt_L1Pstn != null && String.valueOf(ap3.getValue()) == null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L1Pstn");
                            result.put("kmx_id", "TY_0002_00_27");
                            result.put("sql_value", MsgLRpt_L1Pstn);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgLRpt_L1Pstn.equals(String.valueOf(ap3.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L1Pstn");
                            result.put("kmx_id", "TY_0002_00_27");
                            result.put("sql_value", MsgLRpt_L1Pstn);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_29")) {
                         IntPoint ap3 = (IntPoint)ap;
                        if (MsgLRpt_L2TWork == null && String.valueOf(ap3.getValue()) != null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L2TWork");
                            result.put("kmx_id", "TY_0002_00_29");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgLRpt_L2TWork != null && String.valueOf(ap3.getValue()) == null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L2TWork");
                            result.put("kmx_id", "TY_0002_00_29");
                            result.put("sql_value", MsgLRpt_L2TWork);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgLRpt_L2TWork.equals(String.valueOf(ap3.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L2TWork");
                            result.put("kmx_id", "TY_0002_00_29");
                            result.put("sql_value", MsgLRpt_L2TWork);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_30")) {
                         IntPoint ap3 = (IntPoint)ap;
                        if (MsgLRpt_L2Schedule == null && String.valueOf(ap3.getValue()) != null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L2Schedule");
                            result.put("kmx_id", "TY_0002_00_30");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgLRpt_L2Schedule != null && String.valueOf(ap3.getValue()) == null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L2Schedule");
                            result.put("kmx_id", "TY_0002_00_30");
                            result.put("sql_value", MsgLRpt_L2Schedule);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgLRpt_L2Schedule.equals(String.valueOf(ap3.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L2Schedule");
                            result.put("kmx_id", "TY_0002_00_30");
                            result.put("sql_value", MsgLRpt_L2Schedule);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_31")) {
                         IntPoint ap3 = (IntPoint)ap;
                        if (MsgLRpt_L2Pstn == null && String.valueOf(ap3.getValue()) != null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L2Pstn");
                            result.put("kmx_id", "TY_0002_00_31");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgLRpt_L2Pstn != null && String.valueOf(ap3.getValue()) == null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L2Pstn");
                            result.put("kmx_id", "TY_0002_00_31");
                            result.put("sql_value", MsgLRpt_L2Pstn);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgLRpt_L2Pstn.equals(String.valueOf(ap3.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L2Pstn");
                            result.put("kmx_id", "TY_0002_00_31");
                            result.put("sql_value", MsgLRpt_L2Pstn);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_33")) {
                         IntPoint ap3 = (IntPoint)ap;
                        if (MsgLRpt_L3TWork == null && String.valueOf(ap3.getValue()) != null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L3TWork");
                            result.put("kmx_id", "TY_0002_00_33");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgLRpt_L3TWork != null && String.valueOf(ap3.getValue()) == null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L3TWork");
                            result.put("kmx_id", "TY_0002_00_33");
                            result.put("sql_value", MsgLRpt_L3TWork);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgLRpt_L3TWork.equals(String.valueOf(ap3.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L3TWork");
                            result.put("kmx_id", "TY_0002_00_33");
                            result.put("sql_value", MsgLRpt_L3TWork);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_34")) {
                         IntPoint ap3 = (IntPoint)ap;
                        if (MsgLRpt_L3Schedule == null && String.valueOf(ap3.getValue()) != null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L3Schedule");
                            result.put("kmx_id", "TY_0002_00_34");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgLRpt_L3Schedule != null && String.valueOf(ap3.getValue()) == null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L3Schedule");
                            result.put("kmx_id", "TY_0002_00_34");
                            result.put("sql_value", MsgLRpt_L3Schedule);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgLRpt_L3Schedule.equals(String.valueOf(ap3.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L3Schedule");
                            result.put("kmx_id", "TY_0002_00_34");
                            result.put("sql_value", MsgLRpt_L3Schedule);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_35")) {
                         IntPoint ap3 = (IntPoint)ap;
                        if (MsgLRpt_L3Pstn == null && String.valueOf(ap3.getValue()) != null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L3Pstn");
                            result.put("kmx_id", "TY_0002_00_35");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgLRpt_L3Pstn != null && String.valueOf(ap3.getValue()) == null) {
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L3Pstn");
                            result.put("kmx_id", "TY_0002_00_35");
                            result.put("sql_value", MsgLRpt_L3Pstn);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgLRpt_L3Pstn.equals(String.valueOf(ap3.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "锁车报告");
                            result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                            result.put("MsgTime", MsgLRpt_MsgTime2);
                            result.put("sql_id", "MsgLRpt_L3Pstn");
                            result.put("kmx_id", "TY_0002_00_35");
                            result.put("sql_value", MsgLRpt_L3Pstn);
                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                }
                if (!list.contains("TY_0002_00_25") && MsgLRpt_L1TWork != null) {
                    result.put("InfoType", "锁车报告");
                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                    result.put("MsgTime", MsgLRpt_MsgTime2);
                    result.put("sql_id", "MsgLRpt_L1TWork");
                    result.put("sql_value", MsgLRpt_L1TWork);
                    result.put("kmx_id", "TY_0002_00_25");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_26") && MsgLRpt_L1Schedule != null) {
                    result.put("InfoType", "锁车报告");
                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                    result.put("MsgTime", MsgLRpt_MsgTime2);
                    result.put("sql_id", "MsgLRpt_L1Schedule");
                    result.put("sql_value", MsgLRpt_L1Schedule);
                    result.put("kmx_id", "TY_0002_00_26");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_27") && MsgLRpt_L1Pstn != null) {
                    result.put("InfoType", "锁车报告");
                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                    result.put("MsgTime", MsgLRpt_MsgTime2);
                    result.put("sql_id", "MsgLRpt_L1Pstn");
                    result.put("sql_value", MsgLRpt_L1Pstn);
                    result.put("kmx_id", "TY_0002_00_27");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_29") && MsgLRpt_L2TWork != null) {
                    result.put("InfoType", "锁车报告");
                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                    result.put("MsgTime", MsgLRpt_MsgTime2);
                    result.put("sql_id", "MsgLRpt_L2TWork");
                    result.put("sql_value", MsgLRpt_L2TWork);
                    result.put("kmx_id", "TY_0002_00_29");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_30") && MsgLRpt_L2Schedule != null) {
                    result.put("InfoType", "锁车报告");
                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                    result.put("MsgTime", MsgLRpt_MsgTime2);
                    result.put("sql_id", "MsgLRpt_L2Schedule");
                    result.put("sql_value", MsgLRpt_L2Schedule);
                    result.put("kmx_id", "TY_0002_00_30");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_31") && MsgLRpt_L2Pstn != null) {
                    result.put("InfoType", "锁车报告");
                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                    result.put("MsgTime", MsgLRpt_MsgTime2);
                    result.put("sql_id", "MsgLRpt_L2Pstn");
                    result.put("sql_value", MsgLRpt_L2Pstn);
                    result.put("kmx_id", "TY_0002_00_31");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_31") && MsgLRpt_L2Pstn != null) {
                    result.put("InfoType", "锁车报告");
                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                    result.put("MsgTime", MsgLRpt_MsgTime2);
                    result.put("sql_id", "MsgLRpt_L2Pstn");
                    result.put("sql_value", MsgLRpt_L2Pstn);
                    result.put("kmx_id", "TY_0002_00_31");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_33") && MsgLRpt_L3TWork != null) {
                    result.put("InfoType", "锁车报告");
                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                    result.put("MsgTime", MsgLRpt_MsgTime2);
                    result.put("sql_id", "MsgLRpt_L3TWork");
                    result.put("sql_value", MsgLRpt_L3TWork);
                    result.put("kmx_id", "TY_0002_00_33");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_34") && MsgLRpt_L3Schedule != null) {
                    result.put("InfoType", "锁车报告");
                    result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                    result.put("MsgTime", MsgLRpt_MsgTime2);
                    result.put("sql_id", "MsgLRpt_L3Schedule");
                    result.put("sql_value", MsgLRpt_L3Schedule);
                    result.put("kmx_id", "TY_0002_00_34");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (list.contains("TY_0002_00_35") || MsgLRpt_L3Pstn == null) {
                    continue;
                }
                result.put("InfoType", "锁车报告");
                result.put("Vcl_ID", MsgLRpt_Vcl_ID);
                result.put("MsgTime", MsgLRpt_MsgTime2);
                result.put("sql_id", "MsgLRpt_L3Pstn");
                result.put("sql_value", MsgLRpt_L3Pstn);
                result.put("kmx_id", "TY_0002_00_35");
                result.put("kmx_value", "kmx缺少数据");
                listout.add(result);
                result = new HashMap<>();
            }
            else {
                result.put("InfoType", "锁车报告");
                result.put("Vcl_ID",
                        MsgLRpt_Vcl_ID);
                result.put("MsgTime", MsgLRpt_MsgTime2);
                result.put("sql_id", "MsgLRpt_ID");
                result.put("sql_value", MsgLRpt_ID);
                result.put("kmx_value", "KMX无数据");
                listout.add(result);
                result = new HashMap<>();
            }
        }
        outputSql.put("",listout);
    }
}
