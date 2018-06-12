package com.xingxunlei.example04.army;

/**
 * @author xingmin
 */
public class Stage extends Thread{

    @Override
    public void run() {
        System.out.println("欢迎观看隋唐演义");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("大幕徐徐拉开");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("话说隋朝末年，隋军与农民起义军杀得昏天黑地...");
        ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
        ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();

        Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty,"隋军");
        Thread armyOfRevolt = new Thread(armyTaskOfRevolt,"农民起义军");

        armyOfSuiDynasty.start();
        armyOfRevolt.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("正当双方激战正酣，半路杀出了个程咬金...");
        Thread cheng = new KeyPersonThread();
        cheng.setName("程咬金");
        System.out.println("程咬金的理想就是结束战争，使百姓安居乐业！");
        cheng.start();
        try {
            cheng.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        armyTaskOfSuiDynasty.keepRunning = false;
        armyTaskOfRevolt.keepRunning = false;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("战争结束，人民安居乐业，程先生实现了积极的人生梦想，为人民作出了贡献！");
        System.out.println("谢谢观看隋唐演义，再见！");
    }

    public static void main(String[] args) {
        new Stage().start();
    }
}
