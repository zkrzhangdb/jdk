package com.company.atomic;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceTest {
     public  static  void  main(String[] args){
         AtomicReference atomicReference = new AtomicReference(5) ;
         atomicReference.compareAndSet(5,11);
         System.out.println(atomicReference.get());

         }
}
