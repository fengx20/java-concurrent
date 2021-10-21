package com.fengx.concurrent_01;

/**
 * @author: Fengx
 * @date: 2021-10-21
 * @description: synchronized
 * synchronized保证了代码块在任意时刻最多只有一个线程能执行
 **/
public class Test1 {

    public static void main(String[] args) throws Exception {
        AddTread add = new AddTread();
        DecThread dec = new DecThread();
        add.start();
        dec.start();
        // 串行执行
        add.join();
        dec.join();
        System.out.println(Counter.count);
    }

    static class Counter {
        public static final Object lock = new Object();
        public static int count = 0;
    }

    static class AddTread extends Thread {
        public void run() {
            for (int i = 0; i < 10000; i++) {
                // 加锁
                synchronized (Counter.lock) {
                    Counter.count += 1;
                }// 释放锁
            }
        }
    }

    static class DecThread extends Thread {
        public void run() {
            for (int i = 0; i < 10000; i++) {
                synchronized (Counter.lock) {
                    Counter.count -= 1;
                }
            }
        }
    }
}
