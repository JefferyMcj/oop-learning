package com.easycoding.java.oop.polymorphism.person;

public class PersonMain {

    public static void main(String[] args) {
        show(new Father());
        show (new Son());
    }

    public static  void show(Person p){
        Person person  = new Father("老王",60,178,120);
        person.eat();

        Father father = new Father("老王",60,178,120);
        father.eat("老王");
        father.attribute();

        Father f  =  new Son();
        f.eat();
        f.breeding();

        Son son  = new Son();
        son.dead();//调用父类的方法
    }
}
