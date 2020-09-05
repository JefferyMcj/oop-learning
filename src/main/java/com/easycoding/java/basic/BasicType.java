package com.easycoding.java.basic;

public class BasicType {
    public static void main(String[] args) {

        /**
         * 创建变量需要在内存申请空间  内存系统根据变量分配存储空间  分配的空间只能用来存储该类型的数据
         *          *      不同类型的变量在内存存储  整数、小数、字符
         *
                         * 内置数据类型  8种  int/long/shortint/double/float/boolean/char/byte
         *
                         * 引用数据类型
         * new时候 申请堆内存
         * int是基本数据类型，integer是引用数据类型，是int的包装类  同余定理
         * 所有的包装类（Integer、Long、Byte、Double、Float、Short）都是抽象类 Number 的子类。
         *
         * **/
        int a1 =  100; //占4个字节   -2^31-2^31-1   初始值为0
        long a2  =  100; //-2^63-2^63-1
        short a3 =  100;
        double a4  =  3.1415926;
        float a5 = 100.0f;
        char a6 = 100; //
        byte a7  =  0x4a; // -128-127

        Integer b1 = 1000;
        Integer b2 =  1000;
        int b3  = 1000;

        System.out.println(b1.equals(b2));
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b3));
        System.out.println(b1 == b3);


        Integer c1 = 127;
        Integer c2 = 127;

        Integer c3 = 128;
        Integer c4 = 128;


        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);


        System.out.println(c1 == c2);//  128 false | 127 true | -129 false
        System.out.println(c3 == c4);//false   -128到127之间 就返回池子中的对象
        System.out.println(i1 == i2); // new是在堆内存发生    a，b都是在堆中申请了空间 返回的引用肯定不一样
//        String a2 = "100"; //

        System.out.println(a7);
    }
}
