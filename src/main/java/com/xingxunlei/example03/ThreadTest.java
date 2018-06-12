package com.xingxunlei.example03;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author xingmin
 */
public class ThreadTest {
    public static void main(String[] args) {
        new Thread(() -> {
                Thread.currentThread().setName("demo-thread-0");
                System.out.println(Thread.currentThread().getName());
        }).start();


        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build();
        ExecutorService singleThreadPool = new ThreadPoolExecutor(1, 1,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(1024), threadFactory, new ThreadPoolExecutor.AbortPolicy());

        singleThreadPool.execute(()-> System.out.println(Thread.currentThread().getName()));
        singleThreadPool.shutdown();

    }
}
