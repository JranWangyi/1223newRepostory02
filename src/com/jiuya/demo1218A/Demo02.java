package com.jiuya.demo1218A;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo02 {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t1.func1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t1.func2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }


}

class Thread1 {

    Lock lock = new ReentrantLock();
    Condition c1 = lock.newCondition();
    Condition c2 = lock.newCondition();

    public void func1() throws InterruptedException {
        for (int i = 1; i <= 52; i++) {
            lock.lock();
            c2.signal();
            System.out.print(i);
            if(i%2==0){
                c1.await();
                lock.unlock();
            }
        }
    }

    public void func2() throws InterruptedException {
        for(int i =0 ; i<26 ; i++){
            lock.lock();
            c1.signal();
            System.out.print((char)('A'+i));
            c2.await();
            lock.unlock();
        }
    }
}