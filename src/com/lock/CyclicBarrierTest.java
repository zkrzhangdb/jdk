package com.lock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
//与 CountDownLatch 相反， 数量增加 等到 增加到6 才执行  CyclicBarrier中定义的线程
public class CyclicBarrierTest {
        public  static  void main(String[] args) throws BrokenBarrierException, InterruptedException {
            CyclicBarrier cyclicBarrier  = new CyclicBarrier(6,()->System.out.println("召唤神龙"));
            for (int i = 0; i <6 ; i++) {
                new Thread(()->{
                    System.out.println(Thread.currentThread().getName()+"收集");
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                },String.valueOf(i)).start();

            }

        }
}
