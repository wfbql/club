package com.wfbql.club.utiles;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtile {
    //日期类型转换成字符串
    public static String Date2String(Date date, String patter){
        SimpleDateFormat sdf=new SimpleDateFormat(patter);
        String format = sdf.format(date);
        return format;
    }

    //字符串类型转换成日期
    public static Date String2Date(String str,String patter) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(patter);
        Date parse = sdf.parse(str);
        return parse;
    }
}
