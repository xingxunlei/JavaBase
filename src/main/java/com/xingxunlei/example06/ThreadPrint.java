package com.xingxunlei.example06;

public class ThreadPrint {

    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                pong();
            }
        };
        System.out.println("begin!!!");
        t.run();
        System.out.println("end!!!");
        System.out.println("ping");
    }

    static void pong() {
        System.out.println("pong");
    }
}
