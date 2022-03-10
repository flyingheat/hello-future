package com.jingrui.collection_test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo01 {

    public static void main(String[] args) {

        //通过多态来创建集合实例
   Collection collection = new ArrayList();

        //往集合中添加元素的方法collection.add(100);
        collection.add(100);//自动装箱
        collection.add(3.14);//自动装箱
        collection.add(100.5f);//自动装箱
        collection.add(true);//自动装箱
        collection.add(new Object());
        collection.add("hello world");

        //获取当前集合的长度
        int size = collection.size();

        System.out.println("当前集合的长度为" + size);

        //清空集合中的元素
        collection.clear();
        System.out.println("当前集合的长度为" + size);


        //如何遍历集合中的元素
        Iterator iterator = collection.iterator();//获取迭代器对象

        //遍历集合
        /*
          iterator.hasNext()判断容器是否存在下一个元素，如果存在返回true，
           同时对应的指正向下前进一步，如果不存在就返回false
         */
        while(iterator.hasNext()){

        //获取元素中数据
            Object object = iterator.next();

            System.out.println(object);


        }






    }




}
