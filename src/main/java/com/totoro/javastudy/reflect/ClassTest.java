package com.totoro.javastudy.reflect;


public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {

        //1、使用class关键字，通过类名获取
        Class<String> clazz = String.class;
        //2、使用Class类静态方法forName()，通过包名.类名获取，注意返回值是Class<?>
        Class<?> clazz2 = Class.forName("java.lang.String");
        //3、通过实例对象获取
        Class<?> clazz3 = new String("cpdd").getClass();

        System.out.println(clazz);
        System.out.println(clazz2);
        System.out.println(clazz3);

        System.out.println(clazz == clazz2);
        System.out.println(clazz2 == clazz3);


    }

}
