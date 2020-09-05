package com.easycoding.java.basic;

public class Operator {
    /**
     * 运算符
     *      算数运算符  逻辑运算符 位运算符  赋值运算符  其他运算符
     *后缀	() [] . (点操作符)	左到右
     * 一元	expr++ expr--	从左到右
     * 一元	++expr --expr + - ～ ！	从右到左
     * 乘性 	* /％	左到右
     * 加性 	+ -	左到右
     * 移位 	>> >>>  << 	左到右
     * 关系 	> >= < <= 	左到右
     * 相等 	==  !=	左到右
     * 按位与	＆	左到右
     * 按位异或	^	左到右
     * 按位或	|	左到右
     * 逻辑与	&&	左到右
     * 逻辑或	| |	左到右
     * 条件	？：	从右到左
     * 赋值	= + = - = * = / =％= >> = << =＆= ^ = | =	从右到左
     * 逗号	，	左到右
     *
     * **/
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println("a+b: "+(a+b));//算数运算
        System.out.println(a == b); //关系运算

        boolean d1 = true;
        boolean d2 = false;
        System.out.println("d1&&d2: "+(d1 && d2));//&&  称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。
        System.out.println("d1&&d2: "+(d1 || d2));//|| 称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真
        System.out.println("!d1&&d2: "+!(d1 && d2));// !称为逻辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。

        int e1 = 10;
        int e2 =  20;
        System.out.println();
    }
}
