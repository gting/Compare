package ty.pas.analy;

import com.sagittarius.bean.result.*;
import tykj.userfn.UserFunctionMultipleSql;


import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fuwei extends UserFunctionMultipleSql {
    @Override
    public void runOne(List<String> deviceList, Map<String, Map<String, List<Map<String, String>>>> sqlData, Map<String, Map<String, List<FloatPoint>>> floatInput, Map<String, Map<String, List<DoublePoint>>> doubleInput, Map<String, Map<String, List<StringPoint>>> stringInput, Map<String, Map<String, List<IntPoint>>> intInput, Map<String, Map<String, List<LongPoint>>> longInput, Map<String, Map<String, List<BooleanPoint>>> booleanInput, Map<String, Map<String, List<GeoPoint>>> geoInput, long startTime, long endTime) {
        String deviceID = deviceList.get(0);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<IntPoint> distList = intInput.get(deviceID).get("TC_0002_00_18");
        List<StringPoint> distList2 = stringInput.get(deviceID).get("TC_0002_00_01");

        List<HashMap<String,Object>> list=new ArrayList<>();
        int value=0;
        for (StringPoint source:distList2)
        {
            HashMap<String,Object> result=new HashMap<>();
            String str2 = source.getValue().substring(50, source.getValue().length() - 6);

            String strcont = source.getValue().substring(48, 50);

            if (Integer.parseInt(strcont, 16) * 28 == str2.length()&&source.getValue().contains("8FF004A"))
            {
                int n=0;
                n=source.getValue().indexOf("8FF004A");
                if ((n-1-4-50)%28==0)
                {
                    String shangdian=source.getValue().substring(n+7,n+11);
                    Integer x=Integer.parseInt(shangdian,16);
                    System.out.println(x);
                    String dog = source.getValue().substring(n+11,n+15);
                    Integer y=Integer.parseInt(dog,16);
                    if (x>30 || y>30)
                    {
                        result.put("Vcl_ID", deviceID);
                        result.put("MsgTime",new Date(source.getPrimaryTime()).toString());
                        result.put("Value1",String.valueOf(x));
                        result.put("Value2",String.valueOf(y));
                        list.add(result);
                    }

                }
            }
        }
//        for (IntPoint n:distList)
//        {
//            if (n.getValue()>30) {
//                result.put("Vcl_ID", deviceID);
//                result.put("Value",String.valueOf(n.getValue()));
//                list.add(result);
//            }
//        }
        outputSql.put("FuWei",list);
    }
}
