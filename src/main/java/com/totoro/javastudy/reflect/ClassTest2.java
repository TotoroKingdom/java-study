package com.totoro.javastudy.reflect;


import java.util.List;

public class ClassTest2 {
    public static void main(String[] args) {

        Class<Integer> iClass = int.class;
        Class<Character> cClass = char.class;
        Class<Integer> integerClass = Integer.class;
        Class<Void> voidClass = void.class;
        Class<List> listClass = List.class;

        System.out.println(iClass);
        System.out.println(cClass);
        System.out.println(integerClass);
        System.out.println(voidClass);
        System.out.println(listClass);

        Class<String[]> clazz = String[].class;
        System.out.println(clazz.getName());  //获取类名称（得到的是包名+类名的完整名称）
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getTypeName());
        System.out.println(clazz.getClassLoader());   //获取它的类加载器
        System.out.println(clazz.cast(new Integer("10")));   //强制类型转换
    }
}
