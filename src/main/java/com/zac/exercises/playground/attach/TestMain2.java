package com.zac.exercises.playground.attach;

/**
 * Created by zac-tse on 9/24/16.
 */
public class TestMain2 {
    public static void main(String[] args) throws InterruptedException {
        while(true){
            Thread.sleep(2000);
            new Thread(new WaitThread()).start();
        }
    }

    static class WaitThread implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello");
        }
    }
}