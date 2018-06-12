package com.xingxunlei.example04.army;

/**
 * @author xingmin
 */
public class KeyPersonThread extends Thread {

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+"开始干扰战斗！");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"左右开弓，干扰战斗...");
        }
        System.out.println(Thread.currentThread().getName()+"制止了战斗！");
    }
}
