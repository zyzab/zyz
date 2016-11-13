package com.zyz.thread;

/**
 * Created by da on 16/11/13.
 */
public class MyThread {

    public static void main(String[] args){
        System.out.println("MyThread start ...");

        Thread interruptThread = new InterruptThread();
        interruptThread.start();
        interruptThread.interrupt();
    }


}
