package com.jingrui.demo;

public class Demo04 {

    public static void main(String[] args) {

        Demo04 demo04 = new Demo04();

        int i = 100;

        Integer i2 = 1000;
        int i3 = i2;

        float f = 3.14f;
        Float f2 = 2.14f;

        demo04.getObject(f);

    }

    public void getObject(Object object){

        System.out.println(object);

    }


}
