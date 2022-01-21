package com.fengx.concurrency;

/**
 * @author: Fengx
 * @date: 2021-12-09
 * @description:
 **/
public class CurrentExample1_2 {

    public static void main(String[] args) {
        Thread thread = new MyThread();
        // 启动新线程
        thread.start();
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("启动新线程1！");
        }
    }
}
