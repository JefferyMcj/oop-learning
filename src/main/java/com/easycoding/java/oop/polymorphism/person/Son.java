package com.easycoding.java.oop.polymorphism.person;

public class Son extends Father {
    //继承父类  重写方法
    @Override
    void eat() {
        System.out.println("儿子也在吃饭");
    }

    @Override
    public void breeding() {
        System.out.println("儿子也需要繁殖后台...");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
