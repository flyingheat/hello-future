package com.jingrui.collection_test;

import java.util.HashSet;

import java.util.Iterator;
import java.util.Set;

public class SetDemo04 {

    public static void main(String[] args) {

        //集合实例
       Set set = new HashSet();

       set.add(100);
        set.add(true);
        set.add(new Object());
        set.add("hello");
        set.add(new Object());

        System.out.println(set.size());

        //遍历数据
        Iterator iterator = set.iterator();

        while(iterator.hasNext()){

            Object next = iterator.next();

            System.out.println(next);

        }


    }




}
