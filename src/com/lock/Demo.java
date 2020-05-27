package com.lock;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo {

        public  static  void main(String[] args){


            Demo demo =new Demo();
            demo.test1();


            AtomicInteger atomicInteger = new AtomicInteger(1);

            atomicInteger.decrementAndGet();



            }


    public  String  test1(){

        for (;;) {
            System.out.println("00");
            return "1" ;
        }

    }

}
