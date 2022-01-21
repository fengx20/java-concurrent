package com.fengx.concurrency;

/**
 * @author: Fengx
 * @date: 2021-12-09
 * @description: 创建新线程
 **/
public class CurrentExample1_1 {

    public static void main(String[] args) {
        Thread thread = new Thread();
        // 启动新线程
        thread.start();
    }
}
