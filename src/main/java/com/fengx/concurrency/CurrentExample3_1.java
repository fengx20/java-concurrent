package com.fengx.concurrency;

/**
 * @author: Fengx
 * @date: 2021-12-09
 * @description: 中断线程
 * 假设从网络下载一个100M的文件，如果网速很慢，用户等得不耐烦，就可能在下载过程中点“取消”，这时，程序就需要中断下载线程的执行
 **/
public class CurrentExample3_1 {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();
        // 暂停1毫秒
        Thread.sleep(1);
        // 中断t线程
        t.interrupt();
        // 等待t线程结束
        t.join();
        System.out.println("end");
    }

    static class MyThread extends Thread {
        public void run() {
            int n = 0;
            while (! isInterrupted()) {
                n ++;
                System.out.println(n + " hello!");
            }
        }
    }

}


