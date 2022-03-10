package com.jingrui.collection_test;

import java.util.ArrayList;
import java.util.List;

public class ListDemo03 {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("hello world");
        list.add(1000);
        list.add(true);
        list.add(true);
        list.add(new Object());

        System.out.println("长度为" + list.size());

        //设置指定位置上的元素
        list.set(0,"hello world");

        //删除指定位置上的元素
        list.remove(0);
        //更具指定的元素删除数据，只会删除第一个
        list.remove(true);

        //

        System.out.println("元素是否存在" + list.contains(true));


        for(int i = 0;i < list.size();i++){

            System.out.println(list.get(i));

        }





    }


}
