package com.company.annotation;

import java.lang.reflect.Field;

public class Test {



          public  static  void  main(String[] args){
              Class<?> clazz = Apple.class;
              Field[] fields = clazz.getDeclaredFields();
              for (Field field: fields
                   ) {
                  //判断是不是 CustomAnnotation
                  if(field.isAnnotationPresent(CustomAnnotation.class)){
                      //获取注解的具体的内容
                      CustomAnnotation customAnnotation = field.getAnnotation(CustomAnnotation.class);
                      System.out.println(field.getName()+"注解的具体的数值：" + customAnnotation.value());
                  }

              }

          }






}
