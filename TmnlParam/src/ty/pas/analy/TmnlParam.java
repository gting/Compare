package ty.pas.analy;

import com.sagittarius3.bean.result.*;
import com.sagittarius3.util.TimeUtil;

import java.util.stream.*;

import tykj.userfn.UserFunctionMultipleSql2;

import java.text.*;
import java.util.*;

public class TmnlParam extends UserFunctionMultipleSql2
{
    public void runOne(List<String> deviceList, Map<String, Map<String, List<Map<String, String>>>> sqlData, Map<String, Map<String, List<FloatPoint>>> floatInput, Map<String, Map<String, List<DoublePoint>>> doubleInput, Map<String, Map<String, List<StringPoint>>> stringInput, Map<String, Map<String, List<IntPoint>>> intInput, Map<String, Map<String, List<LongPoint>>> longInput, Map<String, Map<String, List<BooleanPoint>>> booleanInput, Map<String, Map<String, List<GeoPoint>>> geoInput, long startTime, long endTime) {
         String deviceID = deviceList.get(0);
         SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         List<Map<String, String>> sqllist = sqlData.get("V_Msg_TmnlDiagnosis").get(deviceID);
        if (sqllist.size() == 0) {
            return;
        }
         List<IntPoint> distList = intInput.get(deviceID).get("TY_0002_00_623");
         List<IntPoint> distList2 = intInput.get(deviceID).get("TY_0002_00_624");
         List<IntPoint> distList3 = intInput.get(deviceID).get("TY_0002_00_625");
         List<IntPoint> distList4 = intInput.get(deviceID).get("TY_0002_00_626");
         List<IntPoint> distList5 = intInput.get(deviceID).get("TY_0002_00_627");
         List<IntPoint> distList6 = intInput.get(deviceID).get("TY_0002_00_628");
         List<IntPoint> distList7 = intInput.get(deviceID).get("TY_0002_00_630");
         List<IntPoint> distList8 = intInput.get(deviceID).get("TY_0002_00_631");
         List<IntPoint> distList9 = intInput.get(deviceID).get("TY_0002_00_632");
         List<IntPoint> distList10 = intInput.get(deviceID).get("TY_0002_00_633");
         List<IntPoint> distList11 = intInput.get(deviceID).get("TY_0002_00_634");
         List<IntPoint> distList12 = intInput.get(deviceID).get("TY_0002_00_635");
         List<IntPoint> distList13 = intInput.get(deviceID).get("TY_0002_00_636");
         List<IntPoint> distList14 = intInput.get(deviceID).get("TY_0002_00_637");
         List<IntPoint> distList15 = intInput.get(deviceID).get("TY_0002_00_638");
         List<IntPoint> distList16 = intInput.get(deviceID).get("TY_0002_00_639");
         List<IntPoint> distList17 = intInput.get(deviceID).get("TY_0002_00_640");
         List<IntPoint> distList18 = intInput.get(deviceID).get("TY_0002_00_641");
         List<IntPoint> distList19 = intInput.get(deviceID).get("TY_0002_00_642");
         List<IntPoint> distList20 = intInput.get(deviceID).get("TY_0002_00_645");
         List<IntPoint> distList21 = intInput.get(deviceID).get("TY_0002_00_646");
         List<IntPoint> distList22 = intInput.get(deviceID).get("TY_0002_00_647");
         List<IntPoint> distList23 = intInput.get(deviceID).get("TY_0002_00_648");
         List<IntPoint> distList24 = intInput.get(deviceID).get("TY_0002_00_649");
         List<IntPoint> distList25 = intInput.get(deviceID).get("TY_0002_00_650");
         List<IntPoint> distList26 = intInput.get(deviceID).get("TY_0002_00_651");
         List<IntPoint> distList27 = intInput.get(deviceID).get("TY_0002_00_661");
         List<IntPoint> distList28 = intInput.get(deviceID).get("TY_0002_00_662");
         List<IntPoint> distList29 = intInput.get(deviceID).get("TY_0002_00_663");
         List<IntPoint> distList30 = intInput.get(deviceID).get("TY_0002_00_664");
         List<IntPoint> distList31 = intInput.get(deviceID).get("TY_0002_00_665");
         List<IntPoint> distList32 = intInput.get(deviceID).get("TY_0002_00_666");
         List<IntPoint> distList33 = intInput.get(deviceID).get("TY_0002_00_667");
         List<IntPoint> distList34 = intInput.get(deviceID).get("TY_0002_00_668");
         List<IntPoint> distList35 = intInput.get(deviceID).get("TY_0002_00_669");
         List<IntPoint> distList36 = intInput.get(deviceID).get("TY_0002_00_670");
         List<IntPoint> distList37 = intInput.get(deviceID).get("TY_0002_00_671");
         List<IntPoint> distList38 = intInput.get(deviceID).get("TY_0002_00_672");
         List<IntPoint> distList39 = intInput.get(deviceID).get("TY_0002_00_673");
         List<IntPoint> distList40 = intInput.get(deviceID).get("TY_0002_00_674");
         List<IntPoint> distList41 = intInput.get(deviceID).get("TY_0002_00_675");
         List<IntPoint> distList42 = intInput.get(deviceID).get("TY_0002_00_676");
         List<AbstractPoint> alldata = new ArrayList<AbstractPoint>();
         List<String> list = new ArrayList<String>();
        if (distList != null) {
            alldata.addAll(distList);
            list.add("TY_0002_00_623");
        }
        if (distList2 != null) {
            alldata.addAll(distList2);
            list.add("TY_0002_00_624");
        }
        if (distList3 != null) {
            alldata.addAll(distList3);
            list.add("TY_0002_00_625");
        }
        if (distList4 != null) {
            alldata.addAll(distList4);
            list.add("TY_0002_00_626");
        }
        if (distList5 != null) {
            alldata.addAll(distList5);
            list.add("TY_0002_00_627");
        }
        if (distList6 != null) {
            alldata.addAll(distList6);
            list.add("TY_0002_00_628");
        }
        if (distList7 != null) {
            alldata.addAll(distList7);
            list.add("TY_0002_00_630");
        }
        if (distList8 != null) {
            alldata.addAll(distList8);
            list.add("TY_0002_00_631");
        }
        if (distList9 != null) {
            alldata.addAll(distList9);
            list.add("TY_0002_00_632");
        }
        if (distList10 != null) {
            alldata.addAll(distList10);
            list.add("TY_0002_00_633");
        }
        if (distList11 != null) {
            alldata.addAll(distList11);
            list.add("TY_0002_00_634");
        }
        if (distList12 != null) {
            alldata.addAll(distList12);
            list.add("TY_0002_00_635");
        }
        if (distList13 != null) {
            alldata.addAll(distList13);
            list.add("TY_0002_00_636");
        }
        if (distList14 != null) {
            alldata.addAll(distList14);
            list.add("TY_0002_00_637");
        }
        if (distList15 != null) {
            alldata.addAll(distList15);
            list.add("TY_0002_00_638");
        }
        if (distList16 != null) {
            alldata.addAll(distList16);
            list.add("TY_0002_00_639");
        }
        if (distList17 != null) {
            alldata.addAll(distList17);
            list.add("TY_0002_00_640");
        }
        if (distList18 != null) {
            alldata.addAll(distList18);
            list.add("TY_0002_00_641");
        }
        if (distList19 != null) {
            alldata.addAll(distList19);
            list.add("TY_0002_00_642");
        }
        if (distList20 != null) {
            alldata.addAll(distList20);
            list.add("TY_0002_00_645");
        }
        if (distList21 != null) {
            alldata.addAll(distList21);
            list.add("TY_0002_00_646");
        }
        if (distList22 != null) {
            alldata.addAll(distList22);
            list.add("TY_0002_00_647");
        }
        if (distList23 != null) {
            alldata.addAll(distList23);
            list.add("TY_0002_00_648");
        }
        if (distList24 != null) {
            alldata.addAll(distList24);
            list.add("TY_0002_00_649");
        }
        if (distList25 != null) {
            alldata.addAll(distList25);
            list.add("TY_0002_00_650");
        }
        if (distList26 != null) {
            alldata.addAll(distList26);
            list.add("TY_0002_00_651");
        }
        if (distList27 != null) {
            alldata.addAll(distList27);
            list.add("TY_0002_00_661");
        }
        if (distList28 != null) {
            alldata.addAll(distList28);
            list.add("TY_0002_00_662");
        }
        if (distList29 != null) {
            alldata.addAll(distList29);
            list.add("TY_0002_00_663");
        }
        if (distList30 != null) {
            alldata.addAll(distList30);
            list.add("TY_0002_00_664");
        }
        if (distList31 != null) {
            alldata.addAll(distList31);
            list.add("TY_0002_00_665");
        }
        if (distList32 != null) {
            alldata.addAll(distList32);
            list.add("TY_0002_00_666");
        }
        if (distList33 != null) {
            alldata.addAll(distList33);
            list.add("TY_0002_00_667");
        }
        if (distList34 != null) {
            alldata.addAll(distList34);
            list.add("TY_0002_00_668");
        }
        if (distList35 != null) {
            alldata.addAll(distList35);
            list.add("TY_0002_00_669");
        }
        if (distList36 != null) {
            alldata.addAll(distList36);
            list.add("TY_0002_00_670");
        }
        if (distList37 != null) {
            alldata.addAll(distList37);
            list.add("TY_0002_00_671");
        }
        if (distList38 != null) {
            alldata.addAll(distList38);
            list.add("TY_0002_00_672");
        }
        if (distList39 != null) {
            alldata.addAll(distList39);
            list.add("TY_0002_00_673");
        }
        if (distList40 != null) {
            alldata.addAll(distList40);
            list.add("TY_0002_00_674");
        }
        if (distList41 != null) {
            alldata.addAll(distList41);
            list.add("TY_0002_00_675");
        }
        if (distList42 != null) {
            alldata.addAll(distList42);
            list.add("TY_0002_00_676");
        }
        List<HashMap<String, Object>> listout = new ArrayList<>();
        HashMap<String, Object> result = new HashMap<String, Object>();
        Map<Long, List<AbstractPoint>> resultMap = alldata.stream().collect(
                Collectors.groupingBy(AbstractPoint::getPrimaryTime));
        if (list == null || resultMap == null || resultMap.keySet().size() == 0) {
            result.put("InfoType", "终端诊断");
            result.put("Vcl_ID", deviceID);
            result.put("kmx_value", "kmx无该设备数据");
            listout.add(result);
            outputSql.put("EventCompare",listout);
            return;
        }
        for ( Map<String, String> smap : sqllist) {
             String MsgTD_ID = smap.get("MsgTD_ID");
             String MsgTD_Vcl_ID = smap.get("MsgTD_Vcl_ID");
             String MsgTD_MsgTime = smap.get("MsgTD_MsgTime");
             String MsgTD_POR = smap.get("MsgTD_POR");
             String MsgTD_RST = smap.get("MsgTD_RST");
             String MsgTD_RS = smap.get("MsgTD_RS");
             String MsgTD_ROP = smap.get("MsgTD_ROP");
             String MsgTD_KeyOn = smap.get("MsgTD_KeyOn");
             String MsgTD_EngineStart = smap.get("MsgTD_EngineStart");
             String MsgTD_GSMTurnOn = smap.get("MsgTD_GSMTurnOn");
             String MsgTD_GPSTurnOn = smap.get("MsgTD_GPSTurnOn");
             String MsgTD_E2OverFlow = smap.get("MsgTD_E2OverFlow");
             String MsgTD_InfoCount = smap.get("MsgTD_InfoCount");
             String MsgTD_KeepE2Error = smap.get("MsgTD_KeepE2Error");
             String MsgTD_GetE2Error = smap.get("MsgTD_GetE2Error");
             String MsgTD_Lock = smap.get("MsgTD_Lock");
             String MsgTD_Fail_SMS = smap.get("MsgTD_Fail_SMS");
             String MsgTD_Fail_GPRS = smap.get("MsgTD_Fail_GPRS");
             String MsgTD_IPChange = smap.get("MsgTD_IPChange");
             String MsgTD_Awaken = smap.get("MsgTD_Awaken");
             String MsgTD_GSMSign = smap.get("MsgTD_GSMSign");
             String MsgTD_DelSMS = smap.get("MsgTD_DelSMS");
             String MsgTD_CANReset = smap.get("MsgTD_CANReset");
             String MsgTD_GSPSetType = smap.get("MsgTD_GSPSetType");
             String MsgTD_GPSSetCount = smap.get("MsgTD_GPSSetCount");
             String MsgTD_Lock_GSM = smap.get("MsgTD_Lock_GSM");
             String MsgTD_Lock_GPS = smap.get("MsgTD_Lock_GPS");
             String MsgTD_Lock_SIM = smap.get("MsgTD_Lock_SIM");
             String MsgTD_Lock_Tmnl = smap.get("MsgTD_Lock_Tmnl");
             String MsgTD_GSMState1 = smap.get("MsgTD_GSMState1");
             String MsgTD_GSMState2 = smap.get("MsgTD_GSMState2");
             String MsgTD_GSMState3 = smap.get("MsgTD_GSMState3");
             String MsgTD_GSMState4 = smap.get("MsgTD_GSMState4");
             String MsgTD_GSMState5 = smap.get("MsgTD_GSMState5");
             String MsgTD_GSMState6 = smap.get("MsgTD_GSMState6");
             String MsgTD_GSMState7 = smap.get("MsgTD_GSMState7");
             String MsgTD_GSMState8 = smap.get("MsgTD_GSMState8");
             String MsgTD_GSMState9 = smap.get("MsgTD_GSMState9");
             String MsgTD_GSMState10 = smap.get("MsgTD_GSMState10");
             String MsgTD_GSMState11 = smap.get("MsgTD_GSMState11");
             String MsgTD_GSMState12 = smap.get("MsgTD_GSMState12");
             String MsgTD_GSMState13 = smap.get("MsgTD_GSMState13");
             String MsgTD_GSMState14 = smap.get("MsgTD_GSMState14");
             String MsgTD_GSMState15 = smap.get("MsgTD_GSMState15");
             String MsgTD_GSMState16 = smap.get("MsgTD_GSMState16");
            long time = 0L;
             long time2 = 0L;
            try {
                time = TimeUtil.string2Date(MsgTD_MsgTime);
            }
            catch (ParseException e) {
                e.printStackTrace();
            }
             List<AbstractPoint> listpoint = resultMap.get(time);
            if (listpoint != null) {
                for ( AbstractPoint ap : listpoint) {
                    if (ap.getMetric().equals("TY_0002_00_623")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_POR == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_POR");
                            result.put("kmx_id", "TY_0002_00_623");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_POR != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_POR");
                            result.put("kmx_id", "TY_0002_00_623");
                            result.put("sql_value", MsgTD_POR);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_POR.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_POR");
                            result.put("kmx_id", "TY_0002_00_623");
                            result.put("sql_value", MsgTD_POR);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_624")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_RST == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_RST");
                            result.put("kmx_id", "TY_0002_00_624");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_RST != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_RST");
                            result.put("kmx_id", "TY_0002_00_624");
                            result.put("sql_value", MsgTD_RST);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_RST.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_RST");
                            result.put("kmx_id", "TY_0002_00_624");
                            result.put("sql_value", MsgTD_RST);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_625")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_RS == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_RS");
                            result.put("kmx_id", "TY_0002_00_625");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_RS != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_RS");
                            result.put("kmx_id", "TY_0002_00_625");
                            result.put("sql_value", MsgTD_RS);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_RS.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_RS");
                            result.put("kmx_id", "TY_0002_00_625");
                            result.put("sql_value", MsgTD_RS);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_626")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_ROP == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_ROP");
                            result.put("kmx_id", "TY_0002_00_626");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_ROP != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_ROP");
                            result.put("kmx_id", "TY_0002_00_626");
                            result.put("sql_value", MsgTD_ROP);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_ROP.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_ROP");
                            result.put("kmx_id", "TY_0002_00_626");
                            result.put("sql_value", MsgTD_ROP);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_627")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_KeyOn == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_KeyOn");
                            result.put("kmx_id", "TY_0002_00_627");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_KeyOn != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_KeyOn");
                            result.put("kmx_id", "TY_0002_00_627");
                            result.put("sql_value", MsgTD_KeyOn);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_KeyOn.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_KeyOn");
                            result.put("kmx_id", "TY_0002_00_627");
                            result.put("sql_value", MsgTD_KeyOn);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_628")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_EngineStart == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_EngineStart");
                            result.put("kmx_id", "TY_0002_00_628");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_EngineStart != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_EngineStart");
                            result.put("kmx_id", "TY_0002_00_628");
                            result.put("sql_value", MsgTD_EngineStart);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_EngineStart.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_EngineStart");
                            result.put("kmx_id", "TY_0002_00_628");
                            result.put("sql_value", MsgTD_EngineStart);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_630")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMTurnOn == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMTurnOn");
                            result.put("kmx_id", "TY_0002_00_630");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMTurnOn != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMTurnOn");
                            result.put("kmx_id", "TY_0002_00_630");
                            result.put("sql_value", MsgTD_GSMTurnOn);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMTurnOn.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMTurnOn");
                            result.put("kmx_id", "TY_0002_00_630");
                            result.put("sql_value", MsgTD_GSMTurnOn);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_631")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GPSTurnOn == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GPSTurnOn");
                            result.put("kmx_id", "TY_0002_00_631");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GPSTurnOn != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GPSTurnOn");
                            result.put("kmx_id", "TY_0002_00_631");
                            result.put("sql_value", MsgTD_GPSTurnOn);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GPSTurnOn.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GPSTurnOn");
                            result.put("kmx_id", "TY_0002_00_631");
                            result.put("sql_value", MsgTD_GPSTurnOn);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_632")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_E2OverFlow == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_E2OverFlow");
                            result.put("kmx_id", "TY_0002_00_632");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_E2OverFlow != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_E2OverFlow");
                            result.put("kmx_id", "TY_0002_00_632");
                            result.put("sql_value", MsgTD_E2OverFlow);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_E2OverFlow.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_E2OverFlow");
                            result.put("kmx_id", "TY_0002_00_632");
                            result.put("sql_value", MsgTD_E2OverFlow);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_633")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_InfoCount == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_InfoCount");
                            result.put("kmx_id", "TY_0002_00_633");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_InfoCount != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_InfoCount");
                            result.put("kmx_id", "TY_0002_00_633");
                            result.put("sql_value", MsgTD_InfoCount);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_InfoCount.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_InfoCount");
                            result.put("kmx_id", "TY_0002_00_633");
                            result.put("sql_value", MsgTD_InfoCount);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_634")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_KeepE2Error == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_KeepE2Error");
                            result.put("kmx_id", "TY_0002_00_634");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_KeepE2Error != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_KeepE2Error");
                            result.put("kmx_id", "TY_0002_00_634");
                            result.put("sql_value", MsgTD_KeepE2Error);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_KeepE2Error.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_KeepE2Error");
                            result.put("kmx_id", "TY_0002_00_634");
                            result.put("sql_value", MsgTD_KeepE2Error);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_635")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GetE2Error == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GetE2Error");
                            result.put("kmx_id", "TY_0002_00_635");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GetE2Error != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GetE2Error");
                            result.put("kmx_id", "TY_0002_00_635");
                            result.put("sql_value", MsgTD_GetE2Error);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GetE2Error.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GetE2Error");
                            result.put("kmx_id", "TY_0002_00_635");
                            result.put("sql_value", MsgTD_GetE2Error);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_636")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_Lock == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Lock");
                            result.put("kmx_id", "TY_0002_00_636");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_Lock != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Lock");
                            result.put("kmx_id", "TY_0002_00_636");
                            result.put("sql_value", MsgTD_Lock);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_Lock.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Lock");
                            result.put("kmx_id", "TY_0002_00_636");
                            result.put("sql_value", MsgTD_Lock);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_637")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_Fail_SMS == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Fail_SMS");
                            result.put("kmx_id", "TY_0002_00_637");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_Fail_SMS != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Fail_SMS");
                            result.put("kmx_id", "TY_0002_00_637");
                            result.put("sql_value", MsgTD_Fail_SMS);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_Fail_SMS.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Fail_SMS");
                            result.put("kmx_id", "TY_0002_00_637");
                            result.put("sql_value", MsgTD_Fail_SMS);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_638")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_Fail_GPRS == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Fail_GPRS");
                            result.put("kmx_id", "TY_0002_00_638");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_Fail_GPRS != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Fail_GPRS");
                            result.put("kmx_id", "TY_0002_00_638");
                            result.put("sql_value", MsgTD_Fail_GPRS);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_Fail_GPRS.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Fail_GPRS");
                            result.put("kmx_id", "TY_0002_00_638");
                            result.put("sql_value", MsgTD_Fail_GPRS);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_639")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_IPChange == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_IPChange");
                            result.put("kmx_id", "TY_0002_00_639");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_IPChange != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_IPChange");
                            result.put("kmx_id", "TY_0002_00_639");
                            result.put("sql_value", MsgTD_IPChange);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_IPChange.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_IPChange");
                            result.put("kmx_id", "TY_0002_00_639");
                            result.put("sql_value", MsgTD_IPChange);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_640")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_Awaken == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Awaken");
                            result.put("kmx_id", "TY_0002_00_640");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_Awaken != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Awaken");
                            result.put("kmx_id", "TY_0002_00_640");
                            result.put("sql_value", MsgTD_Awaken);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_Awaken.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Awaken");
                            result.put("kmx_id", "TY_0002_00_640");
                            result.put("sql_value", MsgTD_Awaken);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_641")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMSign == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMSign");
                            result.put("kmx_id", "TY_0002_00_641");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMSign != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMSign");
                            result.put("kmx_id", "TY_0002_00_641");
                            result.put("sql_value", MsgTD_GSMSign);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMSign.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMSign");
                            result.put("kmx_id", "TY_0002_00_641");
                            result.put("sql_value", MsgTD_GSMSign);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_642")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_DelSMS == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_DelSMS");
                            result.put("kmx_id", "TY_0002_00_642");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_DelSMS != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_DelSMS");
                            result.put("kmx_id", "TY_0002_00_642");
                            result.put("sql_value", MsgTD_DelSMS);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_DelSMS.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_DelSMS");
                            result.put("kmx_id", "TY_0002_00_642");
                            result.put("sql_value", MsgTD_DelSMS);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_645")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_CANReset == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_CANReset");
                            result.put("kmx_id", "TY_0002_00_645");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_CANReset != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_CANReset");
                            result.put("kmx_id", "TY_0002_00_645");
                            result.put("sql_value", MsgTD_CANReset);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_CANReset.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_CANReset");
                            result.put("kmx_id", "TY_0002_00_645");
                            result.put("sql_value", MsgTD_CANReset);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_646")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSPSetType == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSPSetType");
                            result.put("kmx_id", "TY_0002_00_646");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSPSetType != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSPSetType");
                            result.put("kmx_id", "TY_0002_00_646");
                            result.put("sql_value", MsgTD_GSPSetType);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSPSetType.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSPSetType");
                            result.put("kmx_id", "TY_0002_00_646");
                            result.put("sql_value", MsgTD_GSPSetType);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_647")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GPSSetCount == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GPSSetCount");
                            result.put("kmx_id", "TY_0002_00_647");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GPSSetCount != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GPSSetCount");
                            result.put("kmx_id", "TY_0002_00_647");
                            result.put("sql_value", MsgTD_GPSSetCount);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GPSSetCount.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GPSSetCount");
                            result.put("kmx_id", "TY_0002_00_647");
                            result.put("sql_value", MsgTD_GPSSetCount);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_648")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_Lock_GSM == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Lock_GSM");
                            result.put("kmx_id", "TY_0002_00_648");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_Lock_GSM != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Lock_GSM");
                            result.put("kmx_id", "TY_0002_00_648");
                            result.put("sql_value", MsgTD_Lock_GSM);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_Lock_GSM.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Lock_GSM");
                            result.put("kmx_id", "TY_0002_00_648");
                            result.put("sql_value", MsgTD_Lock_GSM);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_649")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_Lock_GPS == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Lock_GPS");
                            result.put("kmx_id", "TY_0002_00_649");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_Lock_GPS != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Lock_GPS");
                            result.put("kmx_id", "TY_0002_00_649");
                            result.put("sql_value", MsgTD_Lock_GPS);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_Lock_GPS.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Lock_GPS");
                            result.put("kmx_id", "TY_0002_00_649");
                            result.put("sql_value", MsgTD_Lock_GPS);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_650")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_Lock_SIM == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Lock_SIM");
                            result.put("kmx_id", "TY_0002_00_650");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_Lock_SIM != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Lock_SIM");
                            result.put("kmx_id", "TY_0002_00_650");
                            result.put("sql_value", MsgTD_Lock_SIM);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_Lock_SIM.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Lock_SIM");
                            result.put("kmx_id", "TY_0002_00_650");
                            result.put("sql_value", MsgTD_Lock_SIM);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_651")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_Lock_Tmnl == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Lock_Tmnl");
                            result.put("kmx_id", "TY_0002_00_651");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_Lock_Tmnl != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Lock_Tmnl");
                            result.put("kmx_id", "TY_0002_00_651");
                            result.put("sql_value", MsgTD_Lock_Tmnl);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_Lock_Tmnl.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_Lock_Tmnl");
                            result.put("kmx_id", "TY_0002_00_651");
                            result.put("sql_value", MsgTD_Lock_Tmnl);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_661")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMState1 == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState1");
                            result.put("kmx_id", "TY_0002_00_661");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMState1 != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState1");
                            result.put("kmx_id", "TY_0002_00_661");
                            result.put("sql_value", MsgTD_GSMState1);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMState1.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState1");
                            result.put("kmx_id", "TY_0002_00_661");
                            result.put("sql_value", MsgTD_GSMState1);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_662")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMState2 == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState2");
                            result.put("kmx_id", "TY_0002_00_662");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMState2 != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState2");
                            result.put("kmx_id", "TY_0002_00_662");
                            result.put("sql_value", MsgTD_GSMState2);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMState2.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState2");
                            result.put("kmx_id", "TY_0002_00_662");
                            result.put("sql_value", MsgTD_GSMState2);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_663")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMState3 == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState3");
                            result.put("kmx_id", "TY_0002_00_663");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMState3 != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState3");
                            result.put("kmx_id", "TY_0002_00_663");
                            result.put("sql_value", MsgTD_GSMState3);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMState3.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState3");
                            result.put("kmx_id", "TY_0002_00_663");
                            result.put("sql_value", MsgTD_GSMState3);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_664")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMState4 == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState4");
                            result.put("kmx_id", "TY_0002_00_664");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMState4 != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState4");
                            result.put("kmx_id", "TY_0002_00_664");
                            result.put("sql_value", MsgTD_GSMState4);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMState4.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState4");
                            result.put("kmx_id", "TY_0002_00_664");
                            result.put("sql_value", MsgTD_GSMState4);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_665")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMState5 == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState5");
                            result.put("kmx_id", "TY_0002_00_665");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMState5 != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState5");
                            result.put("kmx_id", "TY_0002_00_665");
                            result.put("sql_value", MsgTD_GSMState5);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMState5.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState5");
                            result.put("kmx_id", "TY_0002_00_665");
                            result.put("sql_value", MsgTD_GSMState5);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_666")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMState6 == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState6");
                            result.put("kmx_id", "TY_0002_00_666");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMState6 != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState6");
                            result.put("kmx_id", "TY_0002_00_666");
                            result.put("sql_value", MsgTD_GSMState6);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMState6.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState6");
                            result.put("kmx_id", "TY_0002_00_666");
                            result.put("sql_value", MsgTD_GSMState6);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_667")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMState7 == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState7");
                            result.put("kmx_id", "TY_0002_00_667");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMState7 != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState7");
                            result.put("kmx_id", "TY_0002_00_667");
                            result.put("sql_value", MsgTD_GSMState7);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMState7.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState7");
                            result.put("kmx_id", "TY_0002_00_667");
                            result.put("sql_value", MsgTD_GSMState7);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_668")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMState8 == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState8");
                            result.put("kmx_id", "TY_0002_00_668");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMState8 != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState8");
                            result.put("kmx_id", "TY_0002_00_668");
                            result.put("sql_value", MsgTD_GSMState8);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMState8.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState8");
                            result.put("kmx_id", "TY_0002_00_668");
                            result.put("sql_value", MsgTD_GSMState8);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_669")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMState9 == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState9");
                            result.put("kmx_id", "TY_0002_00_669");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMState9 != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState9");
                            result.put("kmx_id", "TY_0002_00_669");
                            result.put("sql_value", MsgTD_GSMState9);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMState9.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState9");
                            result.put("kmx_id", "TY_0002_00_669");
                            result.put("sql_value", MsgTD_GSMState9);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_670")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMState10 == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState10");
                            result.put("kmx_id", "TY_0002_00_670");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMState10 != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState10");
                            result.put("kmx_id", "TY_0002_00_670");
                            result.put("sql_value", MsgTD_GSMState10);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMState10.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState10");
                            result.put("kmx_id", "TY_0002_00_670");
                            result.put("sql_value", MsgTD_GSMState10);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_671")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMState11 == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState11");
                            result.put("kmx_id", "TY_0002_00_671");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMState11 != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState11");
                            result.put("kmx_id", "TY_0002_00_671");
                            result.put("sql_value", MsgTD_GSMState11);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMState11.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState11");
                            result.put("kmx_id", "TY_0002_00_671");
                            result.put("sql_value", MsgTD_GSMState11);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_672")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMState12 == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState12");
                            result.put("kmx_id", "TY_0002_00_672");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMState12 != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState12");
                            result.put("kmx_id", "TY_0002_00_672");
                            result.put("sql_value", MsgTD_GSMState12);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMState12.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState12");
                            result.put("kmx_id", "TY_0002_00_672");
                            result.put("sql_value", MsgTD_GSMState12);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_673")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMState13 == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState13");
                            result.put("kmx_id", "TY_0002_00_673");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMState13 != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState13");
                            result.put("kmx_id", "TY_0002_00_673");
                            result.put("sql_value", MsgTD_GSMState13);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMState13.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState13");
                            result.put("kmx_id", "TY_0002_00_673");
                            result.put("sql_value", MsgTD_GSMState13);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_674")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMState14 == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState14");
                            result.put("kmx_id", "TY_0002_00_674");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMState14 != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState14");
                            result.put("kmx_id", "TY_0002_00_674");
                            result.put("sql_value", MsgTD_GSMState14);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMState14.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState14");
                            result.put("kmx_id", "TY_0002_00_674");
                            result.put("sql_value", MsgTD_GSMState14);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_675")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMState15 == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState15");
                            result.put("kmx_id", "TY_0002_00_675");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMState15 != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState15");
                            result.put("kmx_id", "TY_0002_00_675");
                            result.put("sql_value", MsgTD_GSMState15);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMState15.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState15");
                            result.put("kmx_id", "TY_0002_00_675");
                            result.put("sql_value", MsgTD_GSMState15);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap.getMetric().equals("TY_0002_00_676")) {
                         IntPoint ap2 = (IntPoint)ap;
                        if (MsgTD_GSMState16 == null && String.valueOf(ap2.getValue()) != null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState16");
                            result.put("kmx_id", "TY_0002_00_676");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (MsgTD_GSMState16 != null && String.valueOf(ap2.getValue()) == null) {
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState16");
                            result.put("kmx_id", "TY_0002_00_676");
                            result.put("sql_value", MsgTD_GSMState16);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (MsgTD_GSMState16.equals(String.valueOf(ap2.getValue()))) {
                                continue;
                            }
                            result.put("InfoType", "终端诊断");
                            result.put("Vcl_ID", MsgTD_Vcl_ID);
                            result.put("MsgTime", MsgTD_MsgTime);
                            result.put("sql_id", "MsgTD_GSMState16");
                            result.put("kmx_id", "TY_0002_00_676");
                            result.put("sql_value", MsgTD_GSMState16);
                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                }
                if (!list.contains("TY_0002_00_623") && MsgTD_POR != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_POR");
                    result.put("sql_value", MsgTD_POR);
                    result.put("kmx_id", "TY_0002_00_623");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_624") && MsgTD_RST != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_RST");
                    result.put("sql_value", MsgTD_RST);
                    result.put("kmx_id", "TY_0002_00_624");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_625") && MsgTD_RS != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_RS");
                    result.put("sql_value", MsgTD_RS);
                    result.put("kmx_id", "TY_0002_00_625");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_626") && MsgTD_ROP != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_ROP");
                    result.put("sql_value", MsgTD_ROP);
                    result.put("kmx_id", "TY_0002_00_626");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_627") && MsgTD_KeyOn != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_KeyOn");
                    result.put("sql_value", MsgTD_KeyOn);
                    result.put("kmx_id", "TY_0002_00_627");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_628") && MsgTD_EngineStart != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_EngineStart");
                    result.put("sql_value", MsgTD_EngineStart);
                    result.put("kmx_id", "TY_0002_00_628");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_630") && MsgTD_GSMTurnOn != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSMTurnOn");
                    result.put("sql_value", MsgTD_GSMTurnOn);
                    result.put("kmx_id", "TY_0002_00_630");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_631") && MsgTD_GPSTurnOn != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GPSTurnOn");
                    result.put("sql_value", MsgTD_GPSTurnOn);
                    result.put("kmx_id", "TY_0002_00_631");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_632") && MsgTD_E2OverFlow != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_E2OverFlow");
                    result.put("sql_value", MsgTD_E2OverFlow);
                    result.put("kmx_id", "TY_0002_00_632");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_633") && MsgTD_InfoCount != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_InfoCount");
                    result.put("sql_value", MsgTD_InfoCount);
                    result.put("kmx_id", "TY_0002_00_633");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_634") && MsgTD_KeepE2Error != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_KeepE2Error");
                    result.put("sql_value", MsgTD_KeepE2Error);
                    result.put("kmx_id", "TY_0002_00_634");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_635") && MsgTD_GetE2Error != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GetE2Error");
                    result.put("sql_value", MsgTD_GetE2Error);
                    result.put("kmx_id", "TY_0002_00_635");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_636") && MsgTD_Lock != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_Lock");
                    result.put("sql_value", MsgTD_Lock);
                    result.put("kmx_id", "TY_0002_00_636");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_637") && MsgTD_Fail_SMS != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_Fail_SMS");
                    result.put("sql_value", MsgTD_Fail_SMS);
                    result.put("kmx_id", "TY_0002_00_637");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_638") && MsgTD_Fail_GPRS != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_Fail_GPRS");
                    result.put("sql_value", MsgTD_Fail_GPRS);
                    result.put("kmx_id", "TY_0002_00_638");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_639") && MsgTD_IPChange != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_IPChange");
                    result.put("sql_value", MsgTD_IPChange);
                    result.put("kmx_id", "TY_0002_00_639");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_640") && MsgTD_Awaken != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_Awaken");
                    result.put("sql_value", MsgTD_Awaken);
                    result.put("kmx_id", "TY_0002_00_640");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_641") && MsgTD_GSMSign != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSMSign");
                    result.put("sql_value", MsgTD_GSMSign);
                    result.put("kmx_id", "TY_0002_00_641");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_642") && MsgTD_DelSMS != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_DelSMS");
                    result.put("sql_value", MsgTD_DelSMS);
                    result.put("kmx_id", "TY_0002_00_642");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_645") && MsgTD_CANReset != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_CANReset");
                    result.put("sql_value", MsgTD_CANReset);
                    result.put("kmx_id", "TY_0002_00_645");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_646") && MsgTD_GSPSetType != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSPSetType");
                    result.put("sql_value", MsgTD_GSPSetType);
                    result.put("kmx_id", "TY_0002_00_646");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_647") && MsgTD_GPSSetCount != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GPSSetCount");
                    result.put("sql_value", MsgTD_GPSSetCount);
                    result.put("kmx_id", "TY_0002_00_647");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_648") && MsgTD_Lock_GSM != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_Lock_GSM");
                    result.put("sql_value", MsgTD_Lock_GSM);
                    result.put("kmx_id", "TY_0002_00_648");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_649") && MsgTD_Lock_GPS != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_Lock_GPS");
                    result.put("sql_value", MsgTD_Lock_GPS);
                    result.put("kmx_id", "TY_0002_00_649");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_650") && MsgTD_Lock_SIM != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_Lock_SIM");
                    result.put("sql_value", MsgTD_Lock_SIM);
                    result.put("kmx_id", "TY_0002_00_650");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_651") && MsgTD_Lock_Tmnl != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_Lock_Tmnl");
                    result.put("sql_value", MsgTD_Lock_Tmnl);
                    result.put("kmx_id", "TY_0002_00_651");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_661") && MsgTD_GSMState1 != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSMState1");
                    result.put("sql_value", MsgTD_GSMState1);
                    result.put("kmx_id", "TY_0002_00_661");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_662") && MsgTD_GSMState2 != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSMState2");
                    result.put("sql_value", MsgTD_GSMState2);
                    result.put("kmx_id", "TY_0002_00_662");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_663") && MsgTD_GSMState3 != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSMState3");
                    result.put("sql_value", MsgTD_GSMState3);
                    result.put("kmx_id", "TY_0002_00_663");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_664") && MsgTD_GSMState4 != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSMState4");
                    result.put("sql_value", MsgTD_GSMState4);
                    result.put("kmx_id", "TY_0002_00_664");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_665") && MsgTD_GSMState5 != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSMState5");
                    result.put("sql_value", MsgTD_GSMState5);
                    result.put("kmx_id", "TY_0002_00_665");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_666") && MsgTD_GSMState6 != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSMState6");
                    result.put("sql_value", MsgTD_GSMState6);
                    result.put("kmx_id", "TY_0002_00_666");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_667") && MsgTD_GSMState7 != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSMState7");
                    result.put("sql_value", MsgTD_GSMState7);
                    result.put("kmx_id", "TY_0002_00_667");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_668") && MsgTD_GSMState8 != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSMState8");
                    result.put("sql_value", MsgTD_GSMState8);
                    result.put("kmx_id", "TY_0002_00_668");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_669") && MsgTD_GSMState9 != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSMState9");
                    result.put("sql_value", MsgTD_GSMState9);
                    result.put("kmx_id", "TY_0002_00_669");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_670") && MsgTD_GSMState10 != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSMState10");
                    result.put("sql_value", MsgTD_GSMState10);
                    result.put("kmx_id", "TY_0002_00_670");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_671") && MsgTD_GSMState11 != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSMState11");
                    result.put("sql_value", MsgTD_GSMState11);
                    result.put("kmx_id", "TY_0002_00_671");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_672") && MsgTD_GSMState12 != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSMState12");
                    result.put("sql_value", MsgTD_GSMState12);
                    result.put("kmx_id", "TY_0002_00_672");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_673") && MsgTD_GSMState13 != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSMState13");
                    result.put("sql_value", MsgTD_GSMState13);
                    result.put("kmx_id", "TY_0002_00_673");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_674") && MsgTD_GSMState14 != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSMState14");
                    result.put("sql_value", MsgTD_GSMState14);
                    result.put("kmx_id", "TY_0002_00_674");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (!list.contains("TY_0002_00_675") && MsgTD_GSMState15 != null) {
                    result.put("InfoType", "终端诊断");
                    result.put("Vcl_ID", MsgTD_Vcl_ID);
                    result.put("MsgTime", MsgTD_MsgTime);
                    result.put("sql_id", "MsgTD_GSMState15");
                    result.put("sql_value", MsgTD_GSMState15);
                    result.put("kmx_id", "TY_0002_00_675");
                    result.put("kmx_value", "kmx缺少数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (list.contains("TY_0002_00_676") || MsgTD_GSMState16 == null) {
                    continue;
                }
                result.put("InfoType", "终端诊断");
                result.put("Vcl_ID", MsgTD_Vcl_ID);
                result.put("MsgTime", MsgTD_MsgTime);
                result.put("sql_id", "MsgTD_GSMState16");
                result.put("sql_value", MsgTD_GSMState16);
                result.put("kmx_id", "TY_0002_00_676");
                result.put("kmx_value", "kmx缺少数据");
                listout.add(result);
                result = new HashMap<>();
            }
            else {
                result.put("InfoType", "终端诊断");
                result.put("Vcl_ID", MsgTD_Vcl_ID);
                result.put("MsgTime", MsgTD_MsgTime);
                result.put("sql_id", "MsgTD_ID");
                result.put("sql_value", MsgTD_ID);
                result.put("kmx_value", "KMX无数据");
                listout.add(result);
                result = new HashMap<>();
            }
        }
        outputSql.put("EventCompare",listout);
    }
}
