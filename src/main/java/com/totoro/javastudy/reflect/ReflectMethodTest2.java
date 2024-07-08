package com.totoro.javastudy.reflect;

import java.lang.reflect.Method;

public class ReflectMethodTest2 {

    public static void main(String[] args) throws Exception {

        Class<?> mangoClazz = Class.forName("com.totoro.javastudy.reflect.ReflectMethodTest2$Mango");
        Object instance = mangoClazz.newInstance();
        Method declaredMethod = mangoClazz.getDeclaredMethod("test", String.class);
        declaredMethod.setAccessible(true);

        Object o = declaredMethod.invoke(instance, "干");
        System.out.println(o);
        System.out.println(declaredMethod.getName());
        System.out.println(declaredMethod.getReturnType());

    }

    static class Mango{

        private String test(String s){
            System.out.println("喜欢吃芒果");
            return s;
        }

    }


}
