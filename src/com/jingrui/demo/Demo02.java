package com.jingrui.demo;

public class Demo02 {

    public static void main(String[] args) {

        //创建普通内部实例
        A.AClass aClass = new A().new AClass();
        aClass.getMethod();

        //创建静态内部类实例
        A.BClass bClass1 = new A.BClass();

        bClass1.getMethod();

    }



}
