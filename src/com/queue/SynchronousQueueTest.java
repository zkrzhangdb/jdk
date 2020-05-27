package com.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 *
 * A blocking queue其中每个插入操作必须等待另一个线程相应的删除操作，
 * 生产一个 消费一个
 */
public class SynchronousQueueTest {

    public  static  void  main(String[] args) throws  Exception{
        BlockingQueue   blockingQueue = new SynchronousQueue();


        new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName()+"put 1 ");
                blockingQueue.put("1");
                System.out.println(Thread.currentThread().getName()+"put 2 ");
                blockingQueue.put("2");
                System.out.println(Thread.currentThread().getName()+"put 3 ");
                blockingQueue.put("3");
             }catch (Exception e){

            }
          },"AA").start();

         new Thread(()->{
             try {
                 TimeUnit.SECONDS.sleep(3);
                 System.out.println(Thread.currentThread().getName()+blockingQueue.take());
                 TimeUnit.SECONDS.sleep(3);
                 System.out.println(Thread.currentThread().getName()+blockingQueue.take());
                 TimeUnit.SECONDS.sleep(3);
                 System.out.println(Thread.currentThread().getName()+blockingQueue.take());
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }

         },"BB").start();

         }
}
