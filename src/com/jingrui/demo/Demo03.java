package com.jingrui.demo;

import com.jingrui.interface_text.Message;

public class  Demo03 {

    public static void main(String[] args) {

        Demo03 demo03 = new Demo03();
        demo03.getDate02(new Message() {
            @Override
            public void getMessage() {

                System.out.println("获取到消息了02");

            }
        });
        demo03.getDate();

    }

    public Message getDate(){

        //匿名内部类
        return new Message() {
            @Override
            public void getMessage() {

                System.out.println("获取到消息了01");

            }
        };


    }

    public void getDate02(Message message){

        message.getMessage();

    }

}
