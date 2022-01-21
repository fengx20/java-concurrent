package com.fengx.concurrency;

/**
 * @author: Fengx
 * @date: 2021-12-09
 * @description:
 **/
public class CurrentExample3_2 {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();
        Thread.sleep(1000);
        // 中断t线程
        t.interrupt();
        // 等待t线程结束
        t.join();
        System.out.println("end");
    }

    static class MyThread extends Thread {
        public void run() {
            Thread hello = new HelloThread();
            // 启动hello线程
            hello.start();
            try {
                // 等待hello线程结束
                hello.join();
            } catch (InterruptedException e) {
                System.out.println("interrupted!");
            }
            // 去掉这一行代码，可以发现hello线程仍然会继续运行，且JVM不会退出
            hello.interrupt();
        }
    }

    static class HelloThread extends Thread {
        public void run() {
            int n = 0;
            while (!isInterrupted()) {
                n++;
                System.out.println(n + " hello!");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }


}


