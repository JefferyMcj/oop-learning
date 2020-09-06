package com.easycoding.java.senior;

import java.util.*;
/**
 * 泛型框架
 *      Java 泛型（generics）是 JDK 5 中引入的一个新特性, 泛型提供了编译时类型安全检测机制，该机制允许程序员在编译时检测到非法的类型。
 *      泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数
 *      Java 1.5之前是没有泛型的，以前从集合中读取每个对象都必须先进行转换，如果不小心存入集合中对象类型是错的，运行过程中转换处理会报错。有了泛型之后编译器会自动帮助转换，使程序更加安全，但是要正确使用泛型才能取得事半功倍的效果
 *
 * **/
public class Generics {
    // 泛型方法 printArray
    public static <E> void printArray(E[] inputArray) {
        // 输出数组元素
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static <E> void print(E[] input) {
        for (E e : input) {
            System.out.printf(" %s", e);
        }
    }

    public static void printSet(Set<?> s) {
        for (Object o : s) {
            System.out.printf(" %s",o);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        HashSet<String> s2 = new HashSet<String>(Arrays.asList("a", "b", "c"));
        printSet(s2);

        HashSet<String> set = new HashSet<String>(Arrays.asList("apple", "banan", "car"));
        printSet(set);

        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("整型数组元素为:");
        printArray(intArray); // 传递一个整型数组

        System.out.println("\n双精度型数组元素为:");
        printArray(doubleArray); // 传递一个双精度型数组

        System.out.println("\n字符型数组元素为:");
        printArray(charArray); // 传递一个字符型数组

        String[] strings = {"1", "2", "3", "4"};
        print(strings);

        List list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
//        for (Iterator i = list.iterator(); i.hasNext(); ) {
//            System.out.println(i);
//        }
    }
}
