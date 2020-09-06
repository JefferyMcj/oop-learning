package com.easycoding.java.senior;

import sun.misc.Queue;
import java.util.*;

public class DataStructure {
    public static void main(String[] args) {
        /**
         * 数据结构
         *      枚举、位集合、向量、栈、字典、哈希表、属性
         * **/
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<String>();
        dayNames.addAll(Arrays.asList("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"));
        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }

        Stack<String> stringStack  = new Stack<>();//  Object peek( )  查看堆栈顶部的对象，但不从堆栈中移除它
        stringStack.push("1-易果生鲜"); //pop:移除堆栈顶部的对象，并作为此函数的值返回该对象
        stringStack.push("2-安鲜达");//push: 把项压入堆栈顶部
        stringStack.push("3-云象供应链");
        stringStack.pop();//先入后出

        for(String item:stringStack){
            System.out.println(item);
//            stringStack.pop();
        }

        stringStack.forEach(item->{
            System.out.println(item);
        });

        Queue<String> queue  = new Queue<>();
        /**
         * Hashtable 线程安全  允许空value 不允许空key
         * 默认长度 11
         * **/
        Hashtable<Integer,String> hashtable  = new Hashtable<>();
        hashtable.putIfAbsent(1,"易果生鲜");
        hashtable.putIfAbsent(2,"安鲜达");
        hashtable.putIfAbsent(3,"云象供应链");
        System.out.println(hashtable);
        hashtable.forEach((k,v)->{
            System.out.println(v);
        });

        /**
         * HashMap  线程不安全 允许空key、空value
         * 默认加载因子长度 16   默认扩容 0.75f
         * **/
        HashMap<Integer,String> hashMap  = new HashMap<>();
        hashMap.put(1,"易果生鲜");
        hashMap.put(2,"安鲜达");
        hashMap.put(3,"云象供应链");
        System.out.println(hashMap);
        HashMap map = new HashMap();
        map.putAll(hashMap);
        System.out.println(map);

        List<String> company  = new ArrayList<>();
        company.addAll(Arrays.asList("易果生鲜","极链科技","杭州数云","诺亚财富"));
        System.out.println(company);

        /**
         * list.stream().mapToDouble求最大、最小、和、平均值
         * **/
        List<Integer> integers = new ArrayList<>();
        integers.addAll(Arrays.asList(100,200,300));
//        Integer sum  = integers.stream().mapToDouble(i->integers.listIterator()).sum();
//        System.out.println();

//        Optional<Date> maxDate = list.stream()
//                .max((p1,p2) -> p1.getDate().compareTo(p2.getDate()))
//                .map(object -> object.getDate());
//        Date date = maxDate.get();
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"诺亚1");
        treeMap.put(2,"诺亚2");
        System.out.println(treeMap.firstEntry());
    }
}
