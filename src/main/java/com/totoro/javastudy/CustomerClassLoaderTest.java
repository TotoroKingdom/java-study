package com.totoro.javastudy;

public class CustomerClassLoaderTest {

    public String text;

    public void test(String s){
        System.out.println(text + "测试自定义类加载器" + s);
    }
}
