
package com.company.annotation;
public class Apple {

    @CustomAnnotation("张三")
    @SuppressWarnings("unused")
    private   String  name;

    @SuppressWarnings("unused")
    @CustomAnnotation("北京朝阳")
    private   String address ;

}
