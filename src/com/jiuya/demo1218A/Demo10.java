package com.jiuya.demo1218A;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo10 {


    private static final int SPORT_COUNT = 10;

    private static CountDownLatch startLatch = new CountDownLatch(1);

    private static CountDownLatch readyLatch = new CountDownLatch(SPORT_COUNT);

    public static void main(String[] args) {
    ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("选手" + Thread.currentThread().getName() + "准备完成");
                        startLatch.await();
                        System.out.println("选手" + Thread.currentThread().getName() + "开始跑");
                        Thread.sleep((long) Math.random() * 10000);
                        System.out.println(Thread.currentThread().getName() + "到达终点");
                        readyLatch.countDown();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            service.execute(runnable);
        }
        try {
            Thread.sleep((long) (Math.random() * 10000));
            System.out.println("裁判"+Thread.currentThread().getName()+"即将发布口令");
            startLatch.countDown();
            System.out.println("裁判"+Thread.currentThread().getName()+"已发送口令，正在等待所有选手到达终点");
            readyLatch.await();
            System.out.println("所有选手都到达终点");
            System.out.println("裁判"+Thread.currentThread().getName()+"汇总成绩排名");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }

}
