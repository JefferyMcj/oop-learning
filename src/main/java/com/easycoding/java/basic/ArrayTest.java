package com.easycoding.java.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class ArrayTest {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 数组
         * **/
        int [] arr1 = new int[10];
        int [] arr2 = {1,2,3,4};
        Date date  = new Date();
        System.out.println(date.toString());

        Thread.sleep(1000);//1s
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间为: " + ft.format(dNow));

        Calendar c = Calendar.getInstance();//默认是当前日期
        System.out.println(c);

        String content = "I am noob " +
                "from runoob.com.";
        String pattern = ".*runoob.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);

    }
}
