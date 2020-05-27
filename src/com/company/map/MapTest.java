package com.company.map;

import com.company.util.SqStack;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {
    public  static  void  main(String[] args){

        Map<String,String> map = new HashMap<String, String>()  ;
        map.put("4324","123");

        Map<String,String> map1 = new ConcurrentHashMap<>();

        map1.put("4324","123");



//        System.out.println("2432".hashCode());
//        System.out.println(Integer.toBinaryString("4324".hashCode()));
//        SqStack test = new SqStack(32);
//        test.bin(15);
//        test.display();

//        System.out.println("end");
//        System.out.println(49>>>16);

//        h >>> 16

         }

         @Test
        public  void  test(){
//             (n - 1) & hash;

             System.out.println(29&15);








         }
}
