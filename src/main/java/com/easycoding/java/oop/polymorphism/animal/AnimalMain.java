package com.easycoding.java.oop.polymorphism.animal;

public class AnimalMain {

    /**
     * 重写：
     *      重写是子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变。即外壳不变，核心重写！
     *      重写的好处在于子类可以根据需要，定义特定于自己的行为。 也就是说子类能够根据需要实现父类的方法。
     *      重写方法不能抛出新的检查异常或者比被重写方法申明更加宽泛的异常。例如： 父类的一个方法申明了一个检查异常 IOException，但是在重写这个方法的时候不能抛出 Exception 异常，因为 Exception 是 IOException 的父类，只能抛出 IOException 的子类异常
     *      参数列表与被重写方法的参数列表必须完全相同
     *      返回类型与被重写方法的返回类型可以不相同，但是必须是父类返回值的派生类（java5 及更早版本返回类型要一样，java7 及更高版本可以不同）。
     * **/
    public static void main(String[] args) {
        Brid brid = new Brid();
        brid.call();
    }
}
