package com.fengx.concurrency;

/**
 * @author: Fengx
 * @date: 2021-12-09
 * @description: 线程的状态
 **/
public class CurrentExample2_1 {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> System.out.println("hello"));
        System.out.println("start");
        t.start();
        // main线程在启动t线程后，可以通过t.join()等待t线程结束后再继续运行
        t.join();
        System.out.println("end");
    }
}
