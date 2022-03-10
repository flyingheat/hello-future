package com.jingrui.collection_test;

import com.jingrui.beans.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_test02 {

    public static void main(String[] args) {

        //创建集合对象
        Collection collection = new ArrayList();


        //添加数据
        collection.add(new Cat());
        collection.add(new Dog());
        collection.add(new Bird());
        collection.add(new Rabbit());

        //获取迭代器对象
        Iterator iterator = collection.iterator();

        //遍历集合
        while(iterator.hasNext()){

           //取出数据
            Object object = iterator.next();

            //判断一下object是否在animal里面
            if(object instanceof Animal){

                Animal animal = (Animal)object;

                 animal.eat();
            }



        }


    }


}


