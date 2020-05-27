package com.company;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    @SuppressWarnings(value = "unused")
    private  int a ;

    public static void main(String[] args) throws InterruptedException {
        List<String> stringList = new ArrayList<>();
//        List<String> stringList = new Vector<>();
//        List<String> stringList = Collections.synchronizedList(new ArrayList<>());
//         List<String> stringList = new CopyOnWriteArrayList<>();



        for (int i = 0; i <30 ; i++) {
             new Thread(()->{
                 stringList.add("a");
                 System.out.println(stringList);
             }).start();
        }
    }
}
