package com.xingxunlei.example03.example0301;

public class MultiThread {

    public static void main(String[] args) {
        getNumByMultiThread(3, 10);
    }

    private static void getNumByMultiThread(int threadNums, int printMaxNum) {
        PrintRunnable printTask = new PrintRunnable(printMaxNum);

        for (int i = 0; i < threadNums; i++) {
            Thread thread = new Thread(printTask);
            thread.setName(String.format("线程%s", i+1));
            thread.start();
        }

    }

}
