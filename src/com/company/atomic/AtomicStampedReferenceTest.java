package com.company.atomic;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReferenceTest {

    @Test
    public  void  test1(){
        AtomicStampedReference atomicStampedReference= new AtomicStampedReference(10,1);
        //参数说明 期待值，更新值，期待版本，更新的版本
        System.out.println(atomicStampedReference.compareAndSet(10,2019,1,atomicStampedReference.getStamp()+1));
        System.out.println(atomicStampedReference.getReference());
        System.out.println(atomicStampedReference.compareAndSet(10,2019,1,atomicStampedReference.getStamp()+1));

        System.out.println(atomicStampedReference.getReference());

    }
}
