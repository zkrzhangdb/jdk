package com.lock;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
//抢车位 。。。。
public class SemaphoreTest {
     public  static  void  main(String[] args){
         Semaphore    semaphore = new Semaphore(3 ) ;
         for (int i = 0; i < 6; i++) {
                  new Thread(()->{
                      try {
                          semaphore.acquire();
                          System.out.println(Thread.currentThread().getName()+"进来");
                          TimeUnit.SECONDS.sleep(3);
                          System.out.println(Thread.currentThread().getName()+"出去");

                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }finally {
                          semaphore.release();
                      }
                    },String.valueOf(i)).start();
         }

          }

    public static void main1(String[] args) {
        Semaphore semaphore = new Semaphore(3);

        for (int i = 0; i < 7; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                        System.out.println(Thread.currentThread().getName() + " 抢到车位" );
                        Thread.sleep(3000);
                        System.out.println(Thread.currentThread().getName() + "停车3秒后离开 ");

                    } catch (Exception e){
                        e.printStackTrace();
                    } finally {
                        semaphore.release();
                    }
                }
            },String.valueOf(i)).start();
        }
    }
}
