package com.easycoding.java.basic;

public class StringTest {
    public static void main(String[] args) {
        /**
         * 字符串
         * StringBuffer和StringBuild:
         *      StringBuffer 和 StringBuilder 类的对象能够被多次的修改
         *      要求线程安全的情况下，则必须使用 StringBuffer 类
         * **/
        String s1 = "hello world1";
        String s2 = new String("||hello world2");
        String s3 ="HELLO";
        System.out.println(s1.concat(s2));
        System.out.println(s2.length());
        System.out.println(s3.toLowerCase());//大写转小写

        StringBuffer stringBuffer = new StringBuffer();//synchronized 线程安全
        stringBuffer.append("hello");
        stringBuffer.append(" world");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello");
        stringBuilder.append(" java");
    }
}
