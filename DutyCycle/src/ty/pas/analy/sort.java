package ty.pas.analy;

import java.util.*;

public class sort
{
    static void sort( List<Map<String, String>> data) {
        Collections.sort(data, new Comparator<Map>() {
            @Override
            public int compare( Map o1,  Map o2) {
                 Integer a = Integer.valueOf(o1.get("MsgDCUC_ID").toString());
                 Integer b = Integer.valueOf(o2.get("MsgDCUC_ID").toString());
                return a.compareTo(b);
            }
        });
    }

    public static void compare(String s1, String s2) {
         byte[] b1 = s1.getBytes();
         byte[] b2 = s2.getBytes();
        Arrays.sort(b1);
        Arrays.sort(b2);
        s1 = new String(b1);
        s2 = new String(b2);
        if (s1.equals(s2)) {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }
}
