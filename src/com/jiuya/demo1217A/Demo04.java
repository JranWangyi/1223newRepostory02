package com.jiuya.demo1217A;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo04 {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Condition c1 = lock.newCondition();
        Condition c2 = lock.newCondition();

        new Thread(){
            @Override
            public void run() {
                for(int i = 1 ; i<=52 ; i++){
                    lock.lock();
                    c2.signal();
                    System.out.println(i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(i%2 == 0){
                        try {
                            c1.await();
                            lock.unlock();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0 ; i< 26 ; i++){
                    lock.lock();
                    c1.signal();
                    System.out.println((char)('A'+i));
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        c2.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.unlock();
                }
            }
        }.start();
    }
}
