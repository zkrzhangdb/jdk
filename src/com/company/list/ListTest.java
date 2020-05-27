package com.company.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListTest {


    public static void main(String[] args) throws InterruptedException {
//        List<String> stringList = new ArrayList<>();
//        List<String> stringList = new Vector<>();
        List<String> stringList = Collections.synchronizedList(new ArrayList<>());
//         List<String> stringListt = new CopyOnWriteArrayList<>();
        for (int i = 0; i <30 ; i++) {
            new Thread(()->{
                stringList.add("a");
                System.out.println(stringList);
            }).start();
        }
    }
}
