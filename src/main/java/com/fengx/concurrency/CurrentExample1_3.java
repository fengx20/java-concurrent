package com.fengx.concurrency;

/**
 * @author: Fengx
 * @date: 2021-12-09
 * @description:
 **/
public class CurrentExample1_3 {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        // 启动新线程
        thread.start();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("启动新线程2！");
        }
    }
}
