package com.easycoding.java.basic;

public class Variable {
    /**
     * Java变量
     *      类变量：独立于方法之外的变量，用 static 修饰
     *      实例变量：独立于方法之外的变量，不过没有 static 修饰
     *      局部变量：类的方法中的变量
     * **/

    static int a1  = 100;//类变量
    int a2 =  100;//实例变量  方法、构造方法之外的变量

    public static void main(String[] args) {
        int a3 =  100;//局部变量  栈上分配
    }
}
