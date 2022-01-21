package com.fengx.concurrency;

/**
 * @author: Fengx
 * @date: 2021-12-09
 * @description:
 **/
public class CurrentExample1_4 {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("启动新线程3!"));
        thread.start(); // 启动新线程
    }
}
