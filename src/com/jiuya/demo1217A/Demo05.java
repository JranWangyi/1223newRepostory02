package com.jiuya.demo1217A;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/**
 * 8个运动员进行百米赛跑,要求:
 * 1.同时起跑
 * 2.所有运动员都到达终点才算比赛结束
 * 3.输出成绩排名
 */
public class Demo05 {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss_sss");
    public static void main(String[] args) throws Exception{
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch endLatch = new CountDownLatch(10);
        //创建线程池
        final ExecutorService es = Executors.newFixedThreadPool(10);
        //制定跑步规则--10个运动员（线程任务）
        for( int i=1; i<=10; i++ ){
            final int No = i;
            Runnable runner = new Runnable() {
                public void run() {
                    try {
                        //如果当前开始计数器为0立即返回。此处警示哨令未发出，所有运动员均处于预备状态（线程阻塞等待）
                        startLatch.await();
                        Thread.sleep((long)(Math.random() * 10000));//0-1的小数乘以10000到千级
                        System.out.println(No + "号运动员抵达终点." + sdf.format(new Date()));

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally{
                        //只要有运动员抵达终点，结束计数器减1
                        endLatch.countDown();
                    }
                }
            };
            es.submit(runner);
			/*Future future = es.submit(runner);
			System.out.println(future.get());*/
        }

        //开始跑步...
        startLatch.countDown();
        System.out.println("预备，开始...");
        //等待所有运动员抵达终点,或者15秒未抵达结束
        endLatch.await(15000, TimeUnit.MILLISECONDS);
        System.out.println("体育课跑步测试结束。");
        //关闭线程池
        es.shutdown();
    }


}
