package com.xingxunlei.example04.army;

public class ArmyRunnable implements Runnable{

    /** volatile关键字
     * volatile保证了线程可以正确的读取其他线程写入的值
     * 如果不写成volatile，由于可见性的问题，当前线程有可能不能读到这个值
     * 关于可见性的问题可以参考JMM（Java内存模型），里面讲述了：happens-before原则、可见性
     * 用volatile修饰的变量，线程在每次使用变量的时候，都会读取变量修改后的值
     */
    volatile boolean keepRunning = true;

    @Override
    public void run() {

        String[] symbol = new String[]{".", "..", "...", "....", "....."};
        while (keepRunning) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+"进攻对方"+ symbol[i] +"");

                //yield()当前运行线程释放处理器资源
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName()+"结束了战斗！");
    }
}
