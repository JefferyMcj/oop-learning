package com.easycoding.java.senior.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        /**
         * 迭代器操作
         * **/
        ArrayList<String> list  = new ArrayList<>();
        list.addAll(Arrays.asList("google","baidu","biying"));
        Iterator<String> it = list.iterator();
        //迭代器 it 逐个返回集合中所有元素最简单的方法是使用 while 循环
        while (it.hasNext()){
            System.out.println(it.next());
        }


        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Iterator<Integer> iterator = integerArrayList.iterator();
        while (iterator.hasNext()){
            Integer i  =  iterator.next();
            if(i > 5){
                iterator.remove();
            }
        }
        System.out.println(integerArrayList);
    }
}
