package ty.pas.analy;

import java.util.ArrayList;
import java.util.List;

public class TestSource {
    public static void main(String[] args) {
        String s="7E0F861477034343713FD41068094000120B01000C06108C4A02F9F8FF2A4A00018EA4053CFFFF06C3F8FF234A0000FFFFFFFFFFFF06F4F8FF2A4A00018EA6053CFFFF0AD2F8FF2A4A00018EA4053DFFFF0E9CF8FF234A0000FFFFFFFFFFFF0EAFF8FF2A4A00018EA5053DFFFF1298F8FF234A0000FFFFFFFFFFFF12D1F8FF2A4A00018EA5053DFFFF16A8F8FF234A0000FFFFFFFFFFFF16D9F8FF2A4A00018EA5053EFFFF1A91F8FF234A0000FFFFFFFFFFFF1AB4F8FF2A4A00018EA7053EFFFF1C3FF8FF004A002E0000000000021C3FF8FF014A0021052A003064001C3FF8FF024A0A0C0000000000001E96F8FF234A0000FFFFFFFFFFFF1EE2F8FF2A4A00018EA6053FFFFF22ECF8FF234A0000FFFFFFFFFFFF230CF8FF2A4A00018EA5053FFFFF26F2F8FF234A0000FFFFFFFFFFFF2713F8FF2A4A00018EA40540FFFF2AEEF8FF234A0000FFFFFFFFFFFF2B0FF8FF2A4A00018EA40540FFFF2EEAF8FF234A0000FFFFFFFFFFFF2F0AF8FF2A4A00018EA60541FFFF32E6F8FF234A0000FFFFFFFFFFFF3324F8FF2A4A00018EA30541FFFF36FEF8FF2A4A00018EA60542FFFF3AC4F8FF234A0000FFFFFFFFFFFF3AE5F8FF2A4A00018EA70543FFFF3EBCF8FF234A0000FFFFFFFFFFFF3EF0F8FF2A4A00018EA50543FFFF42B8F8FF234A0000FFFFFFFFFFFF42EEF8FF2A4A00018EA70544FFFF46BEF8FF234A0000FFFFFFFFFFFF46EFF8FF2A4A00018EA50545FFFF4AB0F8FF234A0000FFFFFFFFFFFF4AD0F8FF2A4A00018EA50546FFFF4EACF8FF234A0000FFFFFFFFFFFF4EE2F8FF2A4A00018EA40546FFFF52C7F8FF2A4A00018EA50547FFFF5686F8FF234A0000FFFFFFFFFFFF56BCF8FF2A4A00018EA60548FFFF5A82F8FF234A0000FFFFFFFFFFFF5AA2F8FF2A4A00018EA80549FFFF5E7EF8FF234A0000FFFFFFFFFFFF5EB7F8FF2A4A00018EA4054AFFFF6284F8FF234A0000FFFFFFFFFFFF62B9F8FF2A4A00018EA5054AFFFF6676F8FF234A0000FFFFFFFFFFFF66ACF8FF2A4A00018EA5054CFFFF6A7CF8FF234A0000FFFFFFFFFFFF6A9DF8FF2A4A00018EA8054DFFFF6E82F8FF234A0000FFFFFFFFFFFF6EF3F8FF2A4A00018EA6054EFFFF72A0F8FF2A4A00018EA4054FFFFF7670F8FF234A0000FFFFFFFFFFFF7691F8FF2A4A00018EA60550FFFF7A7FF8FF2A4A00018EA60551FFFF7A7FF8FF284A00000000000000007E91F8FF234A0000FFFFFFFFFFFF7F07F8FF2A4A00018EA80552FFFF8296F8FF234A0000FFFFFFFFFFFF82BDF8FF2A4A00018EA40553FFFF8661F6FF0100F1004700107F6FFF8688F8FF234A0000FFFFFFFFFFFF86BAF8FF2A4A00018EA60555FFFF86BAF6FF010000C30803AA0002008A39F6FF01000004041E03F109078A66F6FF010000063EFFFFFFFFFF8A8EF8FF234A0000FFFFFFFFFFFF8AFCF8FF2A4A00018EA60556FFFF8AFCF6FF0100F10047FFFFFFFFFF8E32F6FF0100F1003E0012526FFFF6007E";
        if (s.contains("8FF004A"))
        {
            int n=s.indexOf("8FF004A");
            if ((n-1-4-50)%28==0)
                System.out.println(true);
            System.out.println(n);
            System.out.println(s.substring(n+8,n+12));
            Integer x=Integer.parseInt(s.substring(n+7,n+11),16);
            System.out.println(x);
            String dog = s.substring(n+11,n+15);
            Integer y=Integer.parseInt(dog,16);
            System.out.println(dog);
        }
    }
    static String sub1(String str){
        List list = new ArrayList();
        StringBuffer sb = new StringBuffer(str);
        int j=0;
        for(int i=0; i<str.length(); i++){
            if(list.contains(str.charAt(i))){
                sb.deleteCharAt(i-j);     //String 是没有delete方法的
                j++; //因为删除了sb中的字符，有一个偏移
            }else{
                list.add(str.charAt(i));
            }
        }
        return sb.toString();
    }

}
