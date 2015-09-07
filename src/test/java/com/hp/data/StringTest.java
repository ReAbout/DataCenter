package com.hp.data;


import com.hp.data.core.DataBuilder;
import org.junit.Test;

public class StringTest {
    @Test
    public void testByteShow(){
        String a="0x23 0x23 0x00 0x4d 0x01 0x55 0xd2 0x0f 0xe7 0x13 0x01 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x55 0xbe 0xe2 0x58 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x31 0x32 0x33 0x34 0x35 0x36 0x37 0x38 0x39 0x31 0x39 0x39 0x39 0x31 0x32 0x33 0x34 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x5d ";
        String b=getByteString(a);
        System.out.println(b);
        DataBuilder db=DataBuilder.build();
        db.putString("A",5);
        String c=db.getString(5);
        System.out.println(c);
    }
    private static String getByteString(String str){
        StringBuffer stringBuffer=new StringBuffer();
        String[] strArray=str.split(" ");
        for(String s:strArray){
            stringBuffer.append(s.substring(2).toUpperCase()).append(" ");
        }
        return stringBuffer.toString();
    }

}