package com.lock;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

//火箭发射  所有的步骤都完成 才能执行最后一步 ，
public class CountDownLatchTest {
        public  static  void main(String[] args) throws  Exception {
            //定义总量6 设置status 的状态为6
             CountDownLatch  countDownLatc = new CountDownLatch(6);
            for (int i = 0; i <6 ; i++) {
                Thread thread = new Thread(new Runnable() {
                    public void run() {
                        try {
                            Thread.currentThread().sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(""+Thread.currentThread().getName()+"完成");
//                        if(false){
                        //  每执行一次线程 ，释放锁 ， status的值减 1
                           countDownLatc.countDown();
//                        }

                    }
                },String.valueOf(i));
                thread.start();
                // new Thread(()->{
                //     System.out.println(""+Thread.currentThread().getName()+"完成");
                //     countDownLatc.countDown();
                // },String.valueOf(i)).start();
            }
            //等待CountDownLatch到0才继续往下执行
            //加入等待队列
            countDownLatc.await();
            System.out.println("发射");
        }


}
