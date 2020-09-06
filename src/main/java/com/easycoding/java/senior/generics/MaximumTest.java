package com.easycoding.java.senior.generics;

import java.util.ArrayList;
import java.util.List;

public class MaximumTest {
    /**
     * 泛型实现 比较大小
     *          泛型类的声明和非泛型类的声明类似，除了在类名后面添加了类型参数声明部分。
     *          和泛型方法一样，泛型类的类型参数声明部分也包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。因为他们接受一个或多个参数，这些类被称为参数化的类或参数化的类型。
     *
     *类型通配符
     *          类型通配符一般是使用?代替具体的类型参数。例如 List<?> 在逻辑上是List<String>,List<Integer> 等所有List<具体类型实参>的父类
     *          类型通配符上限通过形如List来定义，如此定义就是通配符泛型值接受Number及其下层子类类型
     *          类型通配符下限通过形如 List<? super Number>来定义，表示类型只能接受Number及其三层父类类型，如 Object 类型的实例
     *
     * **/
    public static <T extends  Comparable<T>> T  CompareNumber(T x,T y,T z){
        T max = x;
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)> 0){
            max = z;
        }
        return  max;
    }

    public static void getData(List<?> data){
        System.out.println("data:"+data.get(0));
    }

    public static void getUpdateNumber(List<? extends Number> data){
        System.out.println("data::"+ data.get(0));
    }

    public static void main(String[] args) {
        System.out.println(CompareNumber(3,4,5));

        List<String> stringList  = new ArrayList<>();
        stringList.add("易果生鲜");
        getData(stringList);

        List<Integer> integerList  = new ArrayList<>();
        integerList.add(100);
        getData(integerList);

        List<Number> numberList  = new ArrayList<>();
        numberList.add(365);
        getUpdateNumber(numberList);
    }
}
