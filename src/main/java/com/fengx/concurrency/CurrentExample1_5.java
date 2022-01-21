package com.fengx.concurrency;

/**
 * @author: Fengx
 * @date: 2021-12-09
 * @description:
 **/
public class CurrentExample1_5 {

    public static void main(String[] args) {
        System.out.println("主线程开始...");
        Thread t = new Thread(() -> {
            System.out.println("子线程启动...");
            System.out.println("子线程结束");
        });
        t.start();
        System.out.println("主线程结束");
    }
}
