package com.jtest;

import com.ktest.KHello;

public class JHello {
    public void callMe() {
        System.out.println("0921443122");
    }
    public static void main(String[] args) {

        System.out.println("Hello World");
        //呼叫CallMe()
        JHello j =new JHello();
        j.callMe();
        KHello k =new KHello();
        k.callMe();
    }

}
