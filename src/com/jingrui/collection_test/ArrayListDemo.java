package com.jingrui.collection_test;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add(1000);
        arrayList.add(true);
        arrayList.add(new Object());
        arrayList.add("hello world");

        //forEach遍历集合for(集合存放的数据类型 便利每一项的引用 : 集合实例)
        for(Object obj : arrayList){

            System.out.println(obj);

        }




    }


}
