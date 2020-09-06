package com.easycoding.java.senior.generics;

import java.util.ArrayList;
import java.util.List;

public class Book<T> {

    private T t;

    public void add(T t){
        this.t  = t;
    }

    public T get(){
        return  t;
    }

    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }

    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }

    public static void main(String[] args) {
        Book<Integer> book  = new Book<>();
        book.add(1000);

        Book<String> stringBook = new Book<>();
        stringBook.add("红楼梦");

        System.out.printf("整型值为 :%d\n\n", book.get());
        System.out.printf("字符串为 :%s\n", stringBook.get());

        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("西游记");
        age.add(20);
        number.add(1800);

        getData(name);
        getData(age);
        getData(number);
        getUperNumber(age);//2
        getUperNumber(number);//3
    }
}
