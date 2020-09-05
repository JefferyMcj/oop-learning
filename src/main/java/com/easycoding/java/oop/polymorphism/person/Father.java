package com.easycoding.java.oop.polymorphism.person;

public class Father extends Person implements Breed {
    private String name;
    private int age;
    private double height;
    private double weight;

    public Father(){
    }

    public Father(String name,int age,double height,double weight){
        this.name =name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    //重新抽象类的放啊
    @Override
    void eat() {
        System.out.println("爸比 在吃饭");
    }

    //重载抽象类的方法
    void eat(String name){
        System.out.println(name+ "爸比 吃东西");
    }

    @Override
    void sleep() {
        System.out.println("爸比 在午休");
    }

    @Override
    void walk() {
        System.out.println("爸比 在散步");
    }

    @Override
    public void breeding() {
        System.out.println("爸比 需要繁殖后代....");
    }

    void attribute(){
        System.out.println("姓名:"+name+"  年龄:"+age+"  身高:"+height+"  体重:"+weight);
    }
}
