package com.easycoding.java.oop.polymorphism.animal;

public class Animal {

    String name;
    String color;
    int age;

    public Animal(){}
    public Animal(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    void run(){
        System.out.println("动物可以跑");
    }

    void call(){
        System.out.println("动物会叫");
//        return  1;
    }
}
