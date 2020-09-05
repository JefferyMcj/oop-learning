package com.easycoding.java.oop.polymorphism.employee;

import java.math.BigDecimal;

public abstract class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(){}
    public Employee(String name,int age){
        this.name = name;
        this.age = age;
    }

    void sendSalary(BigDecimal salary){
        System.out.println(name+"发工资了...."+"发了"+salary);
    }
}
