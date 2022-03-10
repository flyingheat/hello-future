package com.jingrui.collection_test;

import com.jingrui.beans.Animal;
import com.jingrui.beans.Cat;
import com.jingrui.beans.Dog;

import java.util.ArrayList;

public class ArratListDemo06 {

    public static void main(String[] args) {

        //创建集合实例，该集合只能存放动物类型实例
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog());
        animals.add(new Cat());

        //遍历集合
        for (Animal animal : animals) {

            animal.eat();

        }

    }


}
