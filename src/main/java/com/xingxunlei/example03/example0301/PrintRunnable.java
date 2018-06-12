package com.xingxunlei.example03.example0301;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintRunnable implements Runnable {
    private AtomicInteger index = new AtomicInteger(1);

    private int max;

    public PrintRunnable(int max) {
        super();
        this.max = max;
    }

    @Override
    public void run() {
        print();
    }

    private void print() {
        while (index.get() <= max) {
            System.out.println(Thread.currentThread().getName() + ":" + index.getAndIncrement());
        }
    }
}
