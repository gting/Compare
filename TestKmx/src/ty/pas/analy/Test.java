package ty.pas.analy;

import tykj.userfn.UserFunctionMultipleSql2;
import com.sagittarius3.bean.result.BooleanPoint;
import com.sagittarius3.bean.result.DoublePoint;
import com.sagittarius3.bean.result.FloatPoint;
import com.sagittarius3.bean.result.GeoPoint;
import com.sagittarius3.bean.result.IntPoint;
import com.sagittarius3.bean.result.LongPoint;
import com.sagittarius3.bean.result.StringPoint;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test extends UserFunctionMultipleSql2{
    @Override
    public void runOne(List<String> deviceList,
                       Map<String, Map<String, List<Map<String, String>>>> sqlData,
                       Map<String, Map<String, List<FloatPoint>>> floatInput,
                       Map<String, Map<String, List<DoublePoint>>> doubleInput,
                       Map<String, Map<String, List<StringPoint>>> stringInput,
                       Map<String, Map<String, List<IntPoint>>> intInput,
                       Map<String, Map<String, List<LongPoint>>> longInput,
                       Map<String, Map<String, List<BooleanPoint>>> booleanInput,
                       Map<String, Map<String, List<GeoPoint>>> geoInput, long startTime,
                       long endTime) {
        String deviceID = deviceList.get(0);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<DoublePoint> distList9 = doubleInput.get(deviceID).get("J_0001_00_172");
        List<LongPoint> distList10 = longInput.get(deviceID).get("TY_0002_00_716");
        List<LongPoint> distList11 = longInput.get(deviceID).get("TY_0002_00_718");
        System.out.println("数据1："+distList9);
        System.out.println("数据2："+distList10);
        System.out.println("数据3："+distList11);
        for (DoublePoint one:distList9)
        {
            System.out.println("J_0001_00_172:"+one.getValue());
        }
        for (LongPoint two:distList10)
        {
            System.out.println("TY_0002_00_716"+two.getValue());
        }
        for (LongPoint three:distList11)
        {
            System.out.println("TY_0002_00_718"+three.getValue());
        }
        List<HashMap<String, Object>> listout = new ArrayList<>();
        HashMap<String,Object> result=new HashMap<>();
        result.put("Msg_Time",String.valueOf(distList9.size()));
        result.put("Vcl_ID",deviceID);
        result.put("Table_Name",String.valueOf(distList10.size()));
        result.put("Wrong_count",String.valueOf(distList11.size()));
        listout.add(result);
        outputSql.put("VclCompareInfo",listout);
    }
}
