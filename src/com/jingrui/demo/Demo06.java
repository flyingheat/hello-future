package com.jingrui.demo;

public class Demo06 {

    public static void main(String[] args) {

        //自动装箱
        Integer i = 10;

        Integer i2 = new Integer(100);
        Integer i3 = new Integer("120");

        //创建一个字符串类型实例
        String string = new String("1000");

        //将字符串类型转换为整数类型
        int i4 = Integer.parseInt(string);

        //创建一个double数据类型
        Double aDouble = new Double("3.14");

        System.out.println(aDouble);

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);



    }

}
