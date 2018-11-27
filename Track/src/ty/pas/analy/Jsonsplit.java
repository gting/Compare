package ty.pas.analy;

public class Jsonsplit {
    public static String splitJson(String s) {
        String str = null;
        String[] tmp = s.split("\\.");
        int str2 = Integer.parseInt(tmp[0]);
        int str3 = Integer.parseInt(tmp[1]);
        int str4 = Integer.parseInt(tmp[2]);
        int str5 = Integer.parseInt(tmp[3]);
        str = new StringBuilder().append(str2).append(str3).append(str4).append(str5).toString();
        return str;
    }
}
