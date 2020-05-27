package com.company.beans.beancontext;

import org.junit.Test;

public class BeanContextTest {
    @Test
    //测试多重继承
    public  void   test(){
        A a= new C();
        a.addA();
        B b= new C();
        a.addA();
        b.addB();
    }

     @Test
     public  void   test1(){

     }
}
interface  A{
    public  void addA();

}

interface  B extends  A {
    public  void addB();

}

class C implements  B{


    @Override
    public void addA() {
        System.out.println("from interface A");

    }

    @Override
    public void addB() {
        System.out.println("from interface B");

    }
}