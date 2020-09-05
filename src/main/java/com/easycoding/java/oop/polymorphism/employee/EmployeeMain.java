package com.easycoding.java.oop.polymorphism.employee;

import java.math.BigDecimal;
/**
 *  抽象类：
 *      抽象类不能被实例化(初学者很容易犯的错)，如果被实例化，就会报错，编译无法通过。只有抽象类的非抽象子类可以创建对象
 *      抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
 *      构造方法，类方法（用 static 修饰的方法）不能声明为抽象方法。
 *      构造方法，类方法（用 static 修饰的方法）不能声明为抽象方法。
 * **/
public class EmployeeMain {
    public static void main(String[] args) {
//        Employee employee = new Employee();
        Salary salary  = new Salary("小米",22,new BigDecimal(30000.000));
        salary.sendSalary(new BigDecimal(30000.000));
    }
}
