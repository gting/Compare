package ty.pas.analy;

import java.util.*;

public class Sub1 {
    public static String sub1(String str){
        String[] strs = str.split(",");
        Set set = new TreeSet();
        for (int i = 0; i < strs.length; i++) {
            set.add(strs[i]);
        }
        if (set.size()>1)
            return set.toString().substring(1, set.toString().length() - 1);
        else
            return null;
    }

}
