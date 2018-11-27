package ty.pas.analy;

import com.sagittarius3.bean.result.*;
import com.sagittarius3.util.TimeUtil;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
;
import java.util.stream.*;

import tykj.userfn.UserFunctionMultipleSql2;


import java.util.*;


public class DutyCycle extends UserFunctionMultipleSql2
{
    public void runOne(List<String> deviceList, Map<String, Map<String, List<Map<String, String>>>> sqlData, Map<String, Map<String, List<FloatPoint>>> floatInput, Map<String, Map<String, List<DoublePoint>>> doubleInput, Map<String, Map<String, List<StringPoint>>> stringInput, Map<String, Map<String, List<IntPoint>>> intInput, Map<String, Map<String, List<LongPoint>>> longInput, Map<String, Map<String, List<BooleanPoint>>> booleanInput, Map<String, Map<String, List<GeoPoint>>> geoInput, long startTime, long endTime) {
         String deviceID = deviceList.get(0);
         SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
         SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
         List<LongPoint> distList = longInput.get(deviceID).get("TY_0002_00_731");
         List<IntPoint> distList2 = intInput.get(deviceID).get("TY_0001_00_16");
         List<IntPoint> distList3 = intInput.get(deviceID).get("TY_0002_00_160");
         List<StringPoint> distList4 = stringInput.get(deviceID).get("TY_0002_00_161");
         List<IntPoint> distList5 = intInput.get(deviceID).get("TY_0002_00_162");
         List<StringPoint> distList6 = stringInput.get(deviceID).get("TY_0002_00_163");
         List<StringPoint> distList7 = stringInput.get(deviceID).get("TY_0002_00_164");
         List<IntPoint> distList8 = intInput.get(deviceID).get("TY_0002_00_165");
         List<StringPoint> distList9 = stringInput.get(deviceID).get("TY_0002_00_166");
         List<IntPoint> distList10 = intInput.get(deviceID).get("TY_0002_00_167");
         List<StringPoint> distList11 = stringInput.get(deviceID).get("TY_0002_00_168");
         List<IntPoint> distList12 = intInput.get(deviceID).get("TY_0002_00_169");
         List<StringPoint> distList13 = stringInput.get(deviceID).get("TY_0002_00_170");
         List<IntPoint> distList14 = intInput.get(deviceID).get("TY_0002_00_171");
         List<StringPoint> distList15 = stringInput.get(deviceID).get("TY_0002_00_172");
         List<StringPoint> distList16 = stringInput.get(deviceID).get("TY_0002_00_173");
         List<AbstractPoint> alldata = new ArrayList<AbstractPoint>();
         List<String> list = new ArrayList<String>();
        List<HashMap<String, Object>> listout = new ArrayList<>();
        if (distList != null) {
            alldata.addAll(distList);
            list.add("TY_0002_00_731");
        }
        if (distList2 != null) {
            alldata.addAll(distList2);
            list.add("TY_0001_00_16");
        }
        if (distList3 != null) {
            alldata.addAll(distList3);
            list.add("TY_0002_00_160");
        }
        if (distList4 != null) {
            alldata.addAll(distList4);
            list.add("TY_0002_00_161");
        }
        if (distList5 != null) {
            alldata.addAll(distList5);
            list.add("TY_0002_00_162");
        }
        if (distList6 != null) {
            alldata.addAll(distList6);
            list.add("TY_0002_00_163");
        }
        if (distList7 != null) {
            alldata.addAll(distList7);
            list.add("TY_0002_00_164");
        }
        if (distList8 != null) {
            alldata.addAll(distList8);
            list.add("TY_0002_00_165");
        }
        if (distList9 != null) {
            alldata.addAll(distList9);
            list.add("TY_0002_00_166");
        }
        if (distList10 != null) {
            alldata.addAll(distList10);
            list.add("TY_0002_00_167");
        }
        if (distList11 != null) {
            alldata.addAll(distList11);
            list.add("TY_0002_00_168");
        }
        if (distList12 != null) {
            alldata.addAll(distList12);
            list.add("TY_0002_00_169");
        }
        if (distList13 != null) {
            alldata.addAll(distList13);
            list.add("TY_0002_00_170");
        }
        if (distList14 != null) {
            alldata.addAll(distList14);
            list.add("TY_0002_00_171");
        }
        if (distList15 != null) {
            alldata.addAll(distList15);
            list.add("TY_0002_00_172");
        }
        if (distList16 != null) {
            alldata.addAll(distList16);
            list.add("TY_0002_00_173");
        }
        Map<Long, List<AbstractPoint>> resultMap = alldata.stream().collect(
                Collectors.groupingBy(AbstractPoint::getPrimaryTime));
        HashMap<String, Object> result = new HashMap<>();
         List<Map<String, String>> sqllist = sqlData.get("V_Msg_DutyCycle").get(deviceID);
        if (sqllist == null || sqllist.size() == 0) {
            return;
        }
        if (list == null || resultMap == null || resultMap.keySet().size() == 0) {
            result.put("InfoType", "DutyCycle");
            result.put("Vcl_ID", deviceID);
            result.put("kmx_value", "kmx无该设备数据");
            listout.add(result);
            outputSql.put("EventCompare",listout);
            return;
        }

        //按ID排序
        sort.sort(sqllist);
        long time = 0L;
        //获取第一条DutyCyle所属时间
        String MsgDCUC_MsgDate = sqllist.get(0).get("MsgDCUC_MsgDate");
        //获取第一条信息生成时间
        String MsgDCUC_MsgTime = sqllist.get(0).get("MsgDCUC_MsgTime");
        try {
            time = TimeUtil.string2Date(MsgDCUC_MsgTime);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        //按照信息生成时间抽取数据
         List<AbstractPoint> listpoint = resultMap.get(time);
         List<String> List_Length = new ArrayList<String>(); //DutyCycle长度
         List<String> List_UDSID = new ArrayList<String>(); //UDSID
         List<String> List_Date = new ArrayList<String>();  //DutyCycle所属日期
        //将数据库数据取出
        for ( Map<String, String> map : sqllist) {
            for (int m = 0; m < sqllist.size(); ++m) {
                List_Length.add(sqllist.get(m).get("MsgDCUC_DtcyLength"));
                List_UDSID.add(sqllist.get(m).get("MsgDCUC_UDSID"));
                List_Date.add(sqllist.get(m).get("MsgDCUC_MsgDate"));
            }
        }
         List<String> LengthTemp = new ArrayList<String>();
         Iterator<String> it = List_Length.iterator();
         Iterator<String> it2 = List_UDSID.iterator();
         Iterator<String> it3 = List_Date.iterator();
         //去重，保存
        while (it.hasNext()) {
             String a = it.next();
            if (LengthTemp.contains(a)) {
                it.remove();
            }
            else {
                LengthTemp.add(a);
            }
        }
        while (it2.hasNext()) {
             String a = it2.next();
            if (LengthTemp.contains(a)) {
                it2.remove();
            }
            else {
                LengthTemp.add(a);
            }
        }
        while (it3.hasNext()) {
             String a = it3.next();
            if (LengthTemp.contains(a)) {
                it3.remove();
            }
            else {
                LengthTemp.add(a);
            }
        }
//        System.out.println(LengthTemp);
        //判断udsid是否包含其他id的
        if (!LengthTemp.contains("2441") && !LengthTemp.contains("2442") && !LengthTemp.contains("2448") && !LengthTemp.contains("2449") && !LengthTemp.contains("243C") && !LengthTemp.contains("243F") && !LengthTemp.contains("2439")) {
            result.put("InfoType", "DutyCycle");
            result.put("Vcl_ID", deviceID);
            result.put("MsgTime", MsgDCUC_MsgTime);
            result.put("sql_id", "MsgDCUC_UDSID");
            result.put("sql_value", List_UDSID);
            listout.add(result);
            result = new HashMap<>();
        }
         String Length = List_Length.toString().substring(1, List_Length.toString().length() - 1);
         String Date = List_Date.toString().substring(1, List_Date.toString().length() - 1);
        if (listpoint == null) {
            result.put("InfoType", "DutyCycle");
            result.put("Vcl_ID", deviceID);
            result.put("MsgTime", MsgDCUC_MsgTime);
            result.put("kmx_value", "kmx无数据");
            listout.add(result);
            outputSql.put("EventCompare",listout);
            result = new HashMap<>();
        }
        //对比日期、长度和UDSID
        if (listpoint != null) {
            for ( AbstractPoint ap : listpoint) {
                if (ap.getMetric().equals("TY_0001_00_16")) {
                     IntPoint ap2 = (IntPoint)ap;
//                    if (String.valueOf(ap2.getValue()) == null) {
//                        result.put("InfoType", "DutyCycle");
//                        result.put("Vcl_ID", deviceID);
//                        result.put("MsgTime", MsgDCUC_MsgTime);
//                        result.put("sql_id", "MsgDCUC_DtcyLength");
//                        result.put("kmx_id", "TY_0001_00_16");
//                        result.put("sql_value", List_Length);
//                        result.put("kmx_value", null);
//                        listout.add(result);
//                        result = new HashMap<>();
//                    }
                    if (String.valueOf(ap2.getValue()).equals(Length)) {
                        continue;
                    }else {
                    result.put("InfoType", "DutyCycle");
                    result.put("Vcl_ID", deviceID);
                    result.put("MsgTime", MsgDCUC_MsgTime);
                    result.put("sql_id", "MsgDCUC_DtcyLength");
                    result.put("kmx_id", "TY_0001_00_16");
                    result.put("sql_value", List_Length);
                    result.put("kmx_value", String.valueOf(ap2.getValue()));
                    listout.add(result);
                    result = new HashMap<>();}
                }
                if (ap.getMetric().equals("TY_0002_00_160")) {
                     IntPoint ap2 = (IntPoint)ap;
//                    if (String.valueOf(ap2.getValue()) == null) {
//                        result.put("InfoType", "DutyCycle");
//                        result.put("Vcl_ID", deviceID);
//                        result.put("MsgTime", MsgDCUC_MsgTime);
//                        result.put("sql_id", "MsgDCUC_UDSID");
//                        result.put("kmx_id", "TY_0002_00_161");
//                        result.put("sql_value", "2441");
//                        result.put("kmx_value", null);
//                        listout.add(result);
//                        result = new HashMap<>();
//                    }
                    if (List_UDSID.contains(String.valueOf(ap2.getValue()))) {
                        continue;
                    }
                    result.put("InfoType", "DutyCycle");
                    result.put("Vcl_ID", deviceID);
                    result.put("MsgTime", MsgDCUC_MsgTime);
                    result.put("sql_id", "MsgDCUC_UDSID");
                    result.put("kmx_id", "TY_0002_00_160");
                    result.put("sql_value", "2441");
                    result.put("kmx_value", String.valueOf(ap2.getValue()));
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (ap.getMetric().equals("TY_0002_00_162")) {
                     IntPoint ap2 = (IntPoint)ap;
                    if (String.valueOf(ap2.getValue()) == null) {
                        result.put("InfoType", "DutyCycle");
                        result.put("Vcl_ID", deviceID);
                        result.put("MsgTime", MsgDCUC_MsgTime);
                        result.put("sql_id", "MsgDCUC_UDSID");
                        result.put("kmx_id", "TY_0002_00_162");
                        result.put("sql_value", "2442");
                        result.put("kmx_value", null);
                        listout.add(result);
                        result = new HashMap<>();
                    }
                    if (List_UDSID.contains(String.valueOf(ap2.getValue()))) {
                        continue;
                    }
                    result.put("InfoType", "DutyCycle");
                    result.put("Vcl_ID", deviceID);
                    result.put("MsgTime", MsgDCUC_MsgTime);
                    result.put("sql_id", "MsgDCUC_UDSID");
                    result.put("kmx_id", "TY_0002_00_162");
                    result.put("sql_value", "2442");
                    result.put("kmx_value", String.valueOf(ap2.getValue()));
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (ap.getMetric().equals("TY_0002_00_164")) {
                     StringPoint ap3 = (StringPoint)ap;
                    if (String.valueOf(ap3.getValue()) == null) {
                        result.put("InfoType", "DutyCycle");
                        result.put("Vcl_ID", deviceID);
                        result.put("MsgTime", MsgDCUC_MsgTime);
                        result.put("sql_id", "MsgDCUC_UDSID");
                        result.put("kmx_id", "TY_0002_00_164");
                        result.put("sql_value", "2448");
                        result.put("kmx_value", null);
                        listout.add(result);
                        result = new HashMap<>();
                    }
                    if (List_UDSID.contains(String.valueOf(ap3.getValue()))) {
                        continue;
                    }
                    result.put("InfoType", "DutyCycle");
                    result.put("Vcl_ID", deviceID);
                    result.put("MsgTime", MsgDCUC_MsgTime);
                    result.put("sql_id", "MsgDCUC_UDSID");
                    result.put("kmx_id", "TY_0002_00_164");
                    result.put("sql_value", "2449");
                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (ap.getMetric().equals("TY_0002_00_166")) {
                     StringPoint ap3 = (StringPoint)ap;
                    if (String.valueOf(ap3.getValue()) == null) {
                        result.put("InfoType", "DutyCycle");
                        result.put("Vcl_ID", deviceID);
                        result.put("MsgTime", MsgDCUC_MsgTime);
                        result.put("sql_id", "MsgDCUC_UDSID");
                        result.put("kmx_id", "TY_0002_00_166");
                        result.put("sql_value", "2449");
                        result.put("kmx_value", null);
                        listout.add(result);
                        result = new HashMap<>();
                    }
                    if (List_UDSID.contains(String.valueOf(ap3.getValue()))) {
                        continue;
                    }
                    result.put("InfoType", "DutyCycle");
                    result.put("Vcl_ID", deviceID);
                    result.put("MsgTime", MsgDCUC_MsgTime);
                    result.put("sql_id", "MsgDCUC_UDSID");
                    result.put("kmx_id", "TY_0002_00_166");
                    result.put("sql_value", "2449");
                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (ap.getMetric().equals("TY_0002_00_168")) {
                     StringPoint ap3 = (StringPoint)ap;
                    if (String.valueOf(ap3.getValue()) == null) {
                        result.put("InfoType", "DutyCycle");
                        result.put("Vcl_ID", deviceID);
                        result.put("MsgTime", MsgDCUC_MsgTime);
                        result.put("sql_id", "MsgDCUC_UDSID");
                        result.put("kmx_id", "TY_0002_00_168");
                        result.put("sql_value", "243F");
                        result.put("kmx_value", null);
                        listout.add(result);
                        result = new HashMap<>();
                    }
                    if (List_UDSID.contains(String.valueOf(ap3.getValue()))) {
                        continue;
                    }
                    result.put("InfoType", "DutyCycle");
                    result.put("Vcl_ID", deviceID);
                    result.put("MsgTime", MsgDCUC_MsgTime);
                    result.put("sql_id", "MsgDCUC_UDSID");
                    result.put("kmx_id", "TY_0002_00_168");
                    result.put("sql_value", "243F");
                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (ap.getMetric().equals("TY_0002_00_170")) {
                     StringPoint ap3 = (StringPoint)ap;
                    if (String.valueOf(ap3.getValue()) == null) {
                        result.put("InfoType", "DutyCycle");
                        result.put("Vcl_ID", deviceID);
                        result.put("MsgTime", MsgDCUC_MsgTime);
                        result.put("sql_id", "MsgDCUC_UDSID");
                        result.put("kmx_id", "TY_0002_00_170");
                        result.put("sql_value", "243C");
                        result.put("kmx_value", null);
                        listout.add(result);
                        result = new HashMap<>();
                    }
                    if (List_UDSID.contains(String.valueOf(ap3.getValue()))) {
                        continue;
                    }
                    result.put("InfoType", "DutyCycle");
                    result.put("Vcl_ID", deviceID);
                    result.put("MsgTime", MsgDCUC_MsgTime);
                    result.put("sql_id", "MsgDCUC_UDSID");
                    result.put("kmx_id", "TY_0002_00_170");
                    result.put("sql_value", "243C");
                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                    listout.add(result);
                    result = new HashMap<>();
                }
                if (ap.getMetric().equals("TY_0002_00_172")) {
                     StringPoint ap3 = (StringPoint)ap;
                    if (String.valueOf(ap3.getValue()) == null) {
                        result.put("InfoType", "DutyCycle");
                        result.put("Vcl_ID", deviceID);
                        result.put("MsgTime", MsgDCUC_MsgTime);
                        result.put("sql_id", "MsgDCUC_UDSID");
                        result.put("kmx_id", "TY_0002_00_172");
                        result.put("sql_value", "2439");
                        result.put("kmx_value", null);
                        listout.add(result);
                        result = new HashMap<>();
                    }
                    if (List_UDSID.contains(String.valueOf(ap3.getValue()))) {
                        continue;
                    }
                    result.put("InfoType", "DutyCycle");
                    result.put("Vcl_ID", deviceID);
                    result.put("MsgTime", MsgDCUC_MsgTime);
                    result.put("sql_id", "MsgDCUC_UDSID");
                    result.put("kmx_id", "TY_0002_00_172");
                    result.put("sql_value", "2439");
                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                    listout.add(result);
                    result = new HashMap<>();
                }

                if (ap.getMetric().equals("TY_0002_00_731")) {
                     LongPoint ap4 = (LongPoint)ap;
                     java.util.Date d = new Date(ap4.getValue());
                     DateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
                     String dd = sf.format(d);
                    if (String.valueOf(ap4.getValue()) == null && MsgDCUC_MsgDate == null) {
                        continue;
                    }
                    if (String.valueOf(ap4.getValue()) == null && MsgDCUC_MsgDate != null) {
                        result.put("InfoType", "DutyCycle");
                        result.put("Vcl_ID", deviceID);
                        result.put("MsgTime", MsgDCUC_MsgTime);
                        result.put("sql_id", "MsgDCUC_MsgDate");
                        result.put("kmx_id", "TY_0002_00_731");
                        result.put("sql_value", MsgDCUC_MsgDate);
                        result.put("kmx_value", null);
                        listout.add(result);
                        result = new HashMap<>();
                    }
                    if (MsgDCUC_MsgDate == null && String.valueOf(ap4.getValue()) != null) {
                        result.put("InfoType", "DutyCycle");
                        result.put("Vcl_ID", deviceID);
                        result.put("MsgTime", MsgDCUC_MsgTime);
                        result.put("sql_id", "MsgDCUC_MsgDate");
                        result.put("kmx_id", "TY_0002_00_731");
                        result.put("sql_value", null);
                        result.put("kmx_value", String.valueOf(ap4.getValue()));
                        listout.add(result);
                        result = new HashMap<>();
                    }
                    if (dd.equals(String.valueOf(Date))) {
                        continue;
                    }
                    result.put("InfoType", "DutyCycle");
                    result.put("Vcl_ID", deviceID);
                    result.put("MsgTime", MsgDCUC_MsgTime);
                    result.put("sql_id", "MsgDCUC_MsgDate");
                    result.put("kmx_id", "TY_0002_00_731");
                    result.put("sql_value", MsgDCUC_MsgDate);
                    result.put("kmx_value", String.valueOf(ap4.getValue()));
                    listout.add(result);
                    result = new HashMap<>();
                }
            }
            if (!list.contains("TY_0002_00_731") && MsgDCUC_MsgDate != null) {
                result.put("InfoType", "DutyCycle");
                result.put("Vcl_ID", deviceID);
                result.put("MsgTime", MsgDCUC_MsgTime);
                result.put("sql_id", "MsgDCUC_MsgDate");
                result.put("kmx_id", "TY_0002_00_731");
                result.put("sql_value", MsgDCUC_MsgDate);
                result.put("kmx_value", "kmx缺少数据");
                listout.add(result);
                result = new HashMap<>();
            }
            if (!list.contains("TY_0002_00_160") && LengthTemp.contains("2441")) {
                result.put("InfoType", "DutyCycle");
                result.put("Vcl_ID", deviceID);
                result.put("MsgTime", MsgDCUC_MsgTime);
                result.put("sql_id", "MsgDCUC_UDSID");
                result.put("kmx_id", "TY_0002_00_160");
                result.put("sql_value", "2441");
                result.put("kmx_value", "kmx缺少数据");
                listout.add(result);
                result = new HashMap<>();
            }
            if (!list.contains("TY_0002_00_162") && LengthTemp.contains("2442")) {
                result.put("InfoType", "DutyCycle");
                result.put("Vcl_ID", deviceID);
                result.put("MsgTime", MsgDCUC_MsgTime);
                result.put("sql_id", "MsgDCUC_UDSID");
                result.put("kmx_id", "TY_0002_00_162");
                result.put("sql_value", "2442");
                result.put("kmx_value", "kmx缺少数据");
                listout.add(result);
                result = new HashMap<>();
            }
            if (!list.contains("TY_0002_00_164") && LengthTemp.contains("2448")) {
                result.put("InfoType", "DutyCycle");
                result.put("Vcl_ID", deviceID);
                result.put("MsgTime", MsgDCUC_MsgTime);
                result.put("sql_id", "MsgDCUC_UDSID");
                result.put("kmx_id", "TY_0002_00_164");
                result.put("sql_value", "2448");
                result.put("kmx_value", "kmx缺少数据");
                listout.add(result);
                result = new HashMap<>();
            }
            if (!list.contains("TY_0002_00_166") && LengthTemp.contains("2449")) {
                result.put("InfoType", "DutyCycle");
                result.put("Vcl_ID", deviceID);
                result.put("MsgTime", MsgDCUC_MsgTime);
                result.put("sql_id", "MsgDCUC_UDSID");
                result.put("kmx_id", "TY_0002_00_166");
                result.put("sql_value", "2449");
                result.put("kmx_value", "kmx缺少数据");
                listout.add(result);
                result = new HashMap<>();
            }
            if (!list.contains("TY_0002_00_168") && LengthTemp.contains("243F")) {
                result.put("InfoType", "DutyCycle");
                result.put("Vcl_ID", deviceID);
                result.put("MsgTime", MsgDCUC_MsgTime);
                result.put("sql_id", "MsgDCUC_UDSID");
                result.put("kmx_id", "TY_0002_00_168");
                result.put("sql_value", "243F");
                result.put("kmx_value", "kmx缺少数据");
                listout.add(result);
                result = new HashMap<>();
            }
            if (!list.contains("TY_0002_00_170") && LengthTemp.contains("243C")) {
                result.put("InfoType", "DutyCycle");
                result.put("Vcl_ID", deviceID);
                result.put("MsgTime", MsgDCUC_MsgTime);
                result.put("sql_id", "MsgDCUC_UDSID");
                result.put("kmx_id", "TY_0002_00_170");
                result.put("sql_value", "243C");
                result.put("kmx_value", "kmx缺少数据");
                listout.add(result);
                result = new HashMap<>();
            }
            if (!list.contains("TY_0002_00_172") && LengthTemp.contains("2439")) {
                result.put("InfoType", "DutyCycle");
                result.put("Vcl_ID", deviceID);
                result.put("MsgTime", MsgDCUC_MsgTime);
                result.put("sql_id", "MsgDCUC_UDSID");
                result.put("kmx_id", "TY_0002_00_172");
                result.put("sql_value", "2439");
                result.put("kmx_value", "kmx缺少数据");
                listout.add(result);
                result = new HashMap<>();
            }
            if (!list.contains("TY_0001_00_16") && List_Date.toString() != null) {
                result.put("InfoType", "DutyCycle");
                result.put("Vcl_ID", deviceID);
                result.put("MsgTime", MsgDCUC_MsgTime);
                result.put("sql_id", "MsgDCUC_MsgDate");
                result.put("kmx_id", "TY_0001_00_16");
                result.put("sql_value", Date);
                result.put("kmx_value", "kmx缺少数据");
                listout.add(result);
                result = new HashMap<>();
            }
        }

        Map<String, String> smap = null;
        int j = 0;

        int size = 1;
        //判断设备共有几条数据
        for (int i = 0; i < sqllist.size(); ++i) {
            smap = sqllist.get(i);
             String MsgDCUC_RcvTime = smap.get("MsgDCUC_RcvTime");
            if (i > 0 && !MsgDCUC_RcvTime.equals(sqllist.get(i - 1).get("MsgDCUC_RcvTime"))) {
                ++size;
            }
        }

        //region Description
        for (int s = 0; s < size; ++s) {
            String json_2441 = null;
            String json_2442 = null;
            String json_2443 = null;

            //region Description
            for (int l = s * (sqllist.size() / size); l < (s + 1) * (sqllist.size() / size); ++l) {
                result = new HashMap<>();
                smap = sqllist.get(l);
//                 String MsgDCUC_ID = smap.get("MsgDCUC_ID");
                 String MsgDCUC_Vcl_ID = smap.get("MsgDCUC_Vcl_ID");
                MsgDCUC_MsgTime = smap.get("MsgDCUC_MsgTime");
                MsgDCUC_MsgDate = smap.get("MsgDCUC_MsgDate");
                 String MsgDCUC_DtcyLength = smap.get("MsgDCUC_DtcyLength");
                 String MsgDCUC_UDSID = smap.get("MsgDCUC_UDSID");
                 String MsgDCUC_Value = smap.get("MsgDCUC_Value");
                long time2 = 0L;
                try {
                    time2 = TimeUtil.string2Date(MsgDCUC_MsgTime);
                    time = TimeUtil.string2Date(MsgDCUC_MsgDate);
                }
                catch (ParseException e2) {
                    e2.printStackTrace();
                }
                 List<AbstractPoint> listpoint2 = resultMap.get(time2);
                if (MsgDCUC_UDSID.equals("2441")) {
                    if (json_2441 == null) {
                        json_2441 = MsgDCUC_Value;
                    }
                    else if (MsgDCUC_UDSID.equals(sqllist.get(l).get("MsgDCUC_UDSID"))) {
                        json_2441 = String.valueOf(json_2441) + "," + sqllist.get(l).get("MsgDCUC_Value");
                    }
                    ++j;
                }

                if (MsgDCUC_UDSID.equals("2442")) {
                    if (json_2442 == null) {
                        json_2442 = MsgDCUC_Value;
                    }
                    else if (MsgDCUC_UDSID.equals(sqllist.get(l).get("MsgDCUC_UDSID"))) {
                        json_2442 = String.valueOf(json_2442) + "," + sqllist.get(l).get("MsgDCUC_Value");
                    }
                }

                if (MsgDCUC_UDSID.equals("2439")) {
                    if (json_2443 == null) {
                        json_2443 = MsgDCUC_Value;
                    }
                    else if (MsgDCUC_UDSID.equals(sqllist.get(l).get("MsgDCUC_UDSID"))) {
                        json_2443 = String.valueOf(json_2443) + "," + sqllist.get(l).get("MsgDCUC_Value");
                    }
                }

                if (listpoint != null) {
                    for ( AbstractPoint ap5 : listpoint) {
                        if (ap5.getMetric().equals("TY_0002_00_165") && MsgDCUC_UDSID.equals("2448")) {
                             IntPoint ap6 = (IntPoint)ap5;
                            if (MsgDCUC_Value == null && String.valueOf(ap6.getValue()) == null) {
                                continue;
                            }
                            if (MsgDCUC_Value != null && String.valueOf(ap6.getValue()) == null) {
                                result.put("InfoType", "DutyCycle");
                                result.put("Vcl_ID", MsgDCUC_Vcl_ID);
                                result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                                result.put("sql_id", "MsgDCUC_Value");
                                result.put("kmx_id", "TY_0002_00_165");
                                result.put("sql_value", MsgDCUC_Value);
                                result.put("kmx_value", null);
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (MsgDCUC_Value == null && String.valueOf(ap6.getValue()) != null) {
                                result.put("InfoType", "DutyCycle");
                                result.put("Vcl_ID", MsgDCUC_Vcl_ID);
                                result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                                result.put("sql_id", "MsgDCUC_Value");
                                result.put("kmx_id", "TY_0002_00_165");
                                result.put("sql_value", null);
                                result.put("kmx_value", String.valueOf(ap6.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (String.valueOf(ap6.getValue()).equals(MsgDCUC_Value)) {
                                continue;
                            }
                            result.put("InfoType", "DutyCycle");
                            result.put("Vcl_ID", MsgDCUC_Vcl_ID);
                            result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                            result.put("sql_id", "MsgDCUC_Value");
                            result.put("kmx_id", "TY_0002_00_165");
                            result.put("sql_value", MsgDCUC_Value);
                            result.put("kmx_value", ap6.getValue());
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        if (ap5.getMetric().equals("TY_0002_00_167") && MsgDCUC_UDSID.equals("2449")) {
                             IntPoint ap6 = (IntPoint)ap5;
                            if (MsgDCUC_Value == null && String.valueOf(ap6.getValue()) == null) {
                                continue;
                            }
                            if (MsgDCUC_Value != null && String.valueOf(ap6.getValue()) == null) {
                                result.put("InfoType", "DutyCycle");
                                result.put("Vcl_ID", MsgDCUC_Vcl_ID);
                                result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                                result.put("sql_id", "MsgDCUC_Value");
                                result.put("kmx_id", "TY_0002_00_167");
                                result.put("sql_value", MsgDCUC_Value);
                                result.put("kmx_value", null);
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (MsgDCUC_Value == null && String.valueOf(ap6.getValue()) != null) {
                                result.put("InfoType", "DutyCycle");
                                result.put("Vcl_ID", MsgDCUC_Vcl_ID);
                                result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                                result.put("sql_id", "MsgDCUC_Value");
                                result.put("kmx_id", "TY_0002_00_167");
                                result.put("sql_value", null);
                                result.put("kmx_value", String.valueOf(ap6.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (String.valueOf(ap6.getValue()).equals(MsgDCUC_Value)) {
                                continue;
                            }
                            result.put("InfoType", "DutyCycle");
                            result.put("Vcl_ID", MsgDCUC_Vcl_ID);
                            result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                            result.put("sql_id", "MsgDCUC_Value");
                            result.put("kmx_id", "TY_0002_00_167");
                            result.put("sql_value", MsgDCUC_Value);
                            result.put("kmx_value", ap6.getValue());
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        if (ap5.getMetric().equals("TY_0002_00_169") && MsgDCUC_UDSID.equals("243F")) {
                             IntPoint ap6 = (IntPoint)ap5;
                            if (MsgDCUC_Value == null && String.valueOf(ap6.getValue()) == null) {
                                continue;
                            }
                            if (MsgDCUC_Value != null && String.valueOf(ap6.getValue()) == null) {
                                result.put("InfoType", "DutyCycle");
                                result.put("Vcl_ID", MsgDCUC_Vcl_ID);
                                result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                                result.put("sql_id", "MsgDCUC_Value");
                                result.put("kmx_id", "TY_0002_00_169");
                                result.put("sql_value", MsgDCUC_Value);
                                result.put("kmx_value", null);
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (MsgDCUC_Value == null && String.valueOf(ap6.getValue()) != null) {
                                result.put("InfoType", "DutyCycle");
                                result.put("Vcl_ID", MsgDCUC_Vcl_ID);
                                result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                                result.put("sql_id", "MsgDCUC_Value");
                                result.put("kmx_id", "TY_0002_00_169");
                                result.put("sql_value", null);
                                result.put("kmx_value", String.valueOf(ap6.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (String.valueOf(ap6.getValue()).equals(MsgDCUC_Value)) {
                                continue;
                            }
                            result.put("InfoType", "DutyCycle");
                            result.put("Vcl_ID", MsgDCUC_Vcl_ID);
                            result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                            result.put("sql_id", "MsgDCUC_Value");
                            result.put("kmx_id", "TY_0002_00_169");
                            result.put("sql_value", MsgDCUC_Value);
                            result.put("kmx_value", ap6.getValue());
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        if (ap5.getMetric().equals("TY_0002_00_171") && MsgDCUC_UDSID.equals("243C")) {
                             IntPoint ap6 = (IntPoint)ap5;
                            if (MsgDCUC_Value == null && String.valueOf(ap6.getValue()) == null) {
                                continue;
                            }
                            if (MsgDCUC_Value != null && String.valueOf(ap6.getValue()) == null) {
                                result.put("InfoType", "DutyCycle");
                                result.put("Vcl_ID", MsgDCUC_Vcl_ID);
                                result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                                result.put("sql_id", "MsgDCUC_Value");
                                result.put("kmx_id", "TY_0002_00_171");
                                result.put("sql_value", MsgDCUC_Value);
                                result.put("kmx_value", null);
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (MsgDCUC_Value == null && String.valueOf(ap6.getValue()) != null) {
                                result.put("InfoType", "DutyCycle");
                                result.put("Vcl_ID", MsgDCUC_Vcl_ID);
                                result.put("MsgTime", MsgDCUC_MsgTime);
                                result.put("sql_id", "MsgDCUC_Value");
                                result.put("kmx_id", "TY_0002_00_171");
                                result.put("sql_value", null);
                                result.put("kmx_value", String.valueOf(ap6.getValue()));
                                listout.add(result);
                                result = new HashMap<>();
                            }
                            if (String.valueOf(ap6.getValue()).equals(MsgDCUC_Value)) {
                                continue;
                            }
                            result.put("InfoType", "DutyCycle");
                            result.put("Vcl_ID", MsgDCUC_Vcl_ID);
                            result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                            result.put("sql_id", "MsgDCUC_Value");
                            result.put("kmx_id", "TY_0002_00_171");
                            result.put("sql_value", MsgDCUC_Value);
                            result.put("kmx_value", ap6.getValue());
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (MsgDCUC_UDSID.equals("2448") && !list.contains("TY_0002_00_165") && MsgDCUC_Value == null) {
                        result.put("InfoType", "DutyCycle");
                        result.put("Vcl_ID", deviceID);
                        result.put("MsgTime", MsgDCUC_MsgTime);
                        result.put("sql_id", "MsgDCUC_Value");
                        result.put("kmx_id", "TY_0002_00_165");
                        result.put("sql_value", MsgDCUC_Value);
                        result.put("kmx_value", "kmx缺少数据");
                        listout.add(result);
                        result = new HashMap<>();
                    }
                    if (MsgDCUC_UDSID.equals("2449") && !list.contains("TY_0002_00_167") && MsgDCUC_Value == null) {
                        result.put("InfoType", "DutyCycle");
                        result.put("Vcl_ID", deviceID);
                        result.put("MsgTime", MsgDCUC_MsgTime);
                        result.put("sql_id", "MsgDCUC_Value");
                        result.put("kmx_id", "TY_0002_00_167");
                        result.put("sql_value", MsgDCUC_Value);
                        result.put("kmx_value", "kmx缺少数据");
                        listout.add(result);
                        result = new HashMap<>();
                    }
                    if (MsgDCUC_UDSID.equals("243F") && !list.contains("TY_0002_00_169") && MsgDCUC_Value == null) {
                        result.put("InfoType", "DutyCycle");
                        result.put("Vcl_ID", deviceID);
                        result.put("MsgTime", MsgDCUC_MsgTime);
                        result.put("sql_id", "MsgDCUC_Value");
                        result.put("kmx_id", "TY_0002_00_169");
                        result.put("sql_value", MsgDCUC_Value);
                        result.put("kmx_value", "kmx缺少数据");
                        listout.add(result);
                        result = new HashMap<>();
                    }
                    if (MsgDCUC_UDSID.equals("243C") && !list.contains("TY_0002_00_171") && MsgDCUC_Value == null) {
                        result.put("InfoType", "DutyCycle");
                        result.put("Vcl_ID", deviceID);
                        result.put("MsgTime", MsgDCUC_MsgTime);
                        result.put("sql_id", "MsgDCUC_Value");
                        result.put("kmx_id", "TY_0002_00_171");
                        result.put("sql_value", MsgDCUC_Value);
                        result.put("kmx_value", "kmx缺少数据");
                        listout.add(result);
                        result = new HashMap<>();
                    }
                }else {
                    result.put("InfoType", "DutyCycle");
                    result.put("Vcl_ID", deviceID);
                    result.put("MsgTime", MsgDCUC_MsgTime);
                    result.put("kmx_value", "kmx无数据");
                    listout.add(result);
                    result = new HashMap<>();
                }
            }
            //endregion

            String value = null;
            //region Description
            if (listpoint != null) {
                for ( AbstractPoint ap7 : listpoint) {
                    if (ap7.getMetric().equals("TY_0002_00_161")) {
                         StringPoint ap8 = (StringPoint)ap7;
                        if (ap8.getValue().length() > 1) {
                            value = ap8.getValue().substring(1, ap8.getValue().length() - 1);
                        }
                        else {
                            value = ap8.getValue();
                        }
                        if (json_2441 == null && ap8.getValue() == null) {
                            continue;
                        }
                        if (json_2441 != null && String.valueOf(ap8.getValue()) == null) {
                            result.put("InfoType", "DutyCycle");
                            result.put("Vcl_ID", deviceID);
                            result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                            result.put("sql_id", "MsgDCUC_Value");
                            result.put("kmx_id", "TY_0002_00_161");
                            result.put("sql_value", json_2441);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (json_2441 == null && String.valueOf(ap8.getValue()) != null) {
                            result.put("InfoType", "DutyCycle");
                            result.put("Vcl_ID", deviceID);
                            result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                            result.put("sql_id", "MsgDCUC_Value");
                            result.put("kmx_id", "TY_0002_00_161");
                            result.put("sql_value", null);
                            result.put("kmx_value", String.valueOf(ap8.getValue()));
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (value.equals(json_2441)) {
                                continue;
                            }
                            result.put("InfoType", "DutyCycle");
                            result.put("Vcl_ID", deviceID);
                            result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                            result.put("sql_id", "MsgDCUC_Value");
                            result.put("kmx_id", "TY_0002_00_161");
                            result.put("sql_value", json_2441);
                            result.put("kmx_value", ap8.getValue());
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap7.getMetric().equals("TY_0002_00_163")) {
                         StringPoint ap8 = (StringPoint)ap7;
                        if (ap8.getValue().length() > 1) {
                            value = ap8.getValue().substring(1, ap8.getValue().length() - 1);
                        }
                        else {
                            value = ap8.getValue();
                        }
                        if (json_2442 == null && ap8.getValue() == null) {
                            continue;
                        }
                        if (json_2442 != null && String.valueOf(ap8.getValue()) == null) {
                            result.put("InfoType", "DutyCycle");
                            result.put("Vcl_ID", deviceID);
                            result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                            result.put("sql_id", "MsgDCUC_Value");
                            result.put("kmx_id", "TY_0002_00_163");
                            result.put("sql_value", json_2442);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (json_2442 == null && String.valueOf(ap8.getValue()) != null) {
                            result.put("InfoType", "DutyCycle");
                            result.put("Vcl_ID", deviceID);
                            result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                            result.put("sql_id", "MsgDCUC_Value");
                            result.put("kmx_id", "TY_0002_00_163");
                            result.put("sql_value", null);
                            result.put("kmx_value", ap8.getValue());
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (value.equals(json_2442)) {
                                continue;
                            }
                            result.put("InfoType", "DutyCycle");
                            result.put("Vcl_ID", deviceID);
                            result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                            result.put("sql_id", "MsgDCUC_Value");
                            result.put("kmx_id", "TY_0002_00_163");
                            result.put("sql_value", json_2442);
                            result.put("kmx_value", ap8.getValue());
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                    if (ap7.getMetric().equals("TY_0002_00_173")) {
                         StringPoint ap8 = (StringPoint)ap7;
                        if (ap8.getValue().length() > 1) {
                            value = ap8.getValue().substring(1, ap8.getValue().length() - 1);
                        }
                        else {
                            value = ap8.getValue();
                        }
                        if (json_2443 == null && ap8.getValue() == null) {
                            continue;
                        }
                        if (json_2443 != null && String.valueOf(ap8.getValue()) == null) {
                            result.put("InfoType", "DutyCycle");
                            result.put("Vcl_ID", deviceID);
                            result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                            result.put("sql_id", "MsgDCUC_Value");
                            result.put("kmx_id", "TY_0002_00_173");
                            result.put("sql_value", json_2443);
                            result.put("kmx_value", null);
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else if (json_2443 == null && String.valueOf(ap8.getValue()) != null) {
                            result.put("InfoType", "DutyCycle");
                            result.put("Vcl_ID", deviceID);
                            result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                            result.put("sql_id", "MsgDCUC_Value");
                            result.put("kmx_id", "TY_0002_00_173");
                            result.put("sql_value", null);
                            result.put("kmx_value", ap8.getValue());
                            listout.add(result);
                            result = new HashMap<>();
                        }
                        else {
                            if (value.equals(json_2443)) {
                                continue;
                            }
                            result.put("InfoType", "DutyCycle");
                            result.put("Vcl_ID", deviceID);
                            result.put("MsgTime", sqllist.get(s * (sqllist.size() / size)).get("MsgDCUC_RcvTime"));
                            result.put("sql_id", "MsgDCUC_Value");
                            result.put("kmx_id", "TY_0002_00_173");
                            result.put("sql_value", json_2443);
                            result.put("kmx_value", ap8.getValue());
                            listout.add(result);
                            result = new HashMap<>();
                        }
                    }
                }
            }else {
                result.put("InfoType", "DutyCycle");
                result.put("Vcl_ID", deviceID);
                result.put("MsgTime", MsgDCUC_MsgTime);
                result.put("kmx_value", "kmx无数据");
                listout.add(result);
                result = new HashMap<>();
            }
            //endregion
        }
        //endregion
        outputSql.put("EventCompare",listout);
    }
}
