package com.company.list;

import java.util.*;

public class SetTest {


    public static void main(String[] args) throws InterruptedException {
//         Set<String> stringSet = new HashSet<>();
        Set<String> stringSet = Collections.synchronizedSet(new HashSet<>());
//        Set<String> stringSet = new CopyOnWriteArrayList<>();
         for (int i = 0; i <30 ; i++) {
            new Thread(()->{
                stringSet.add("a");
                System.out.println(stringSet);
            }).start();
        }
    }
}
