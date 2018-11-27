package ty.pas.analy;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CompareData {
    public Boolean CompareInt(String sql,String kmx)
    {
        float kmxvalue=Float.parseFloat(kmx)/3600;

        if (Math.abs(Float.parseFloat(sql)-kmxvalue)<0.05)
            return true;
        else
            return false;
    }
    public Boolean Comparefloat(String sql,String kmx)
    {
        String ap6 = String.valueOf(kmx);
        BigDecimal b5 = new BigDecimal(Double.valueOf(ap6.toString()));
        BigDecimal b6 = new BigDecimal(sql);
        int s2 = sql.indexOf(".");
        if (sql.length() >= ap6.toString().length()) {
            if (sql.length() > ap6.toString().length()) {
                sql = String.valueOf(b6.setScale(ap6.toString().length() - s2 - 1, 4).doubleValue());
            }
        } else {
            ap6 = String.valueOf(b5.setScale(sql.length() - s2 - 1, 4).doubleValue());
        }
        if (sql.equals(ap6))
            return true;
        else
            return false;
    }
    public Boolean Comparelong(String sql,String kmx)
    {
        if (sql.contains(":"))
        {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long time=0L;
            Date date=new Date();
            try {
                date = df.parse(sql);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (String.valueOf(date.getTime()).equals(kmx))
                return true;
            else
                return false;
        }else {
            if (Math.abs(Float.parseFloat(sql)-Float.parseFloat(kmx))<0.05)
                return true;
            else
                return false;
        }

    }
}
