package com.easycoding.java.oop.polymorphism.person;

public abstract class Person {

    abstract void eat();
    abstract void sleep();
    abstract void walk();

    void dead() {
        System.out.println("人类需要经历慢慢老去");
    }
}
