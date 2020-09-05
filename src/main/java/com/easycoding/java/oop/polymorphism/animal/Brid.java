package com.easycoding.java.oop.polymorphism.animal;

public class Brid extends Animal implements Fly {

    private double weight;
    private String name;

    public Brid(){}
    public Brid(double weight){
        super();
        this.weight = weight;
    }

    @Override
    void call() {
//        super.call();
        super.call();//子类调用父类重写的方法
        System.out.println("鸟儿唱歌");
    }

    @Override
    public void fly(String name) {
        System.out.println("鸟儿会飞飞飞飞");
    }
}
