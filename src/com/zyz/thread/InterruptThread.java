package com.zyz.thread;

/**
 * Created by da on 16/11/13.
 */
public class InterruptThread extends Thread {

    @Override
    public void run() {

        while (true){
            if(Thread.currentThread().isInterrupted()){
                System.out.println(Thread.currentThread().getName()+"isInterrupted break ...");
                break;
            }

            try {
                System.out.println(Thread.currentThread().getName()+"sleeping ...");
                Thread.sleep(1000L);
                System.out.println(Thread.currentThread().getName()+"wake up ...");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+"interrupted ...");
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }

        }

    }
}
