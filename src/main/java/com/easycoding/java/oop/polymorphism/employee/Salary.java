package com.easycoding.java.oop.polymorphism.employee;

import java.math.BigDecimal;

public class Salary extends Employee {

    private BigDecimal salary;

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public  Salary(){}
    public  Salary(String name, int age, BigDecimal salary){
        super(name,age);
        this.salary = salary;
    }

}
