package com.xingxunlei.example03.example0302;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThread {

    public static void main(String[] args) {
        getNumByMultiThread(3, 10);
    }

    private static void getNumByMultiThread(int threadNum, int printMaxNum) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(threadNum, new NamedThreadFactory());

        for (int i = 0; i < printMaxNum; i++) {
            final int index = i;

            fixedThreadPool.execute(() -> System.out.println(String.format("%s:%s", Thread.currentThread().getName(), index + 1)));

        }

        fixedThreadPool.shutdown();

    }
}