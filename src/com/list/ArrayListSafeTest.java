package com.list;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * ArrayList 线程安全安全问题演示及解决
 */
public class ArrayListSafeTest {

      public  static  void  main(String[] args){
           //线程不安全
//          ArrayListTest.unSafeOperation();
          //线程安全 通过 Collections
          ArrayListSafeTest.toSafeByCollections();
          //通过CopyOnWriteArrayList 实现
          ArrayListSafeTest.toSafeByCopyOnWrite();
          //通过Vector 实现线程安全
          ArrayListSafeTest.toSafeByVector();






           }

            // ArrayList 线程不安全演示
            public  static  void  unSafeOperation(){
                List  list = new ArrayList();
                for (int i = 0; i <30 ; i++) {
                    new Thread(()->{
                        list.add(new Random(10).nextInt());
                        System.out.println(list);
                    },String.valueOf(i)).start();
                }
            }


            public  static  void   toSafeByCollections(){

                List  list =  Collections.synchronizedList(new ArrayList());

                for (int i = 0; i <30 ; i++) {
                    new Thread(()->{
                        list.add(new Random(10).nextInt());
                        System.out.println(list);
                    },String.valueOf(i)).start();
                }

            }


    public  static  void   toSafeByVector(){
        List  list =  new Vector();
        for (int i = 0; i <30 ; i++) {
            new Thread(()->{
                list.add(new Random(10).nextInt());
                System.out.println(list);
            },String.valueOf(i)).start();
        }

    }


    public  static  void   toSafeByCopyOnWrite(){
        List  list =  new CopyOnWriteArrayList();
        for (int i = 0; i <30 ; i++) {
            new Thread(()->{
                list.add(new Random(10).nextInt());
                System.out.println(list);
            },String.valueOf(i)).start();
        }

    }




}
