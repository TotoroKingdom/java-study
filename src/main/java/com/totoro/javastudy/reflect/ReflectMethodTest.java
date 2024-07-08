package com.totoro.javastudy.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectMethodTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class<?> clazz = Class.forName("com.totoro.javastudy.reflect.ReflectMethodTest$Banana");
        Object instance = clazz.newInstance();
        Method method = clazz.getMethod("test");
        method.invoke(instance);

        Class<?> grapeClazz = Class.forName("com.totoro.javastudy.reflect.ReflectMethodTest$Grape");
        Object grapeInstance = grapeClazz.newInstance();
        Method grapeMethod = grapeClazz.getMethod("test", String.class);

        grapeMethod.invoke(grapeInstance, "干");

    }

    static class Banana{
        public void test(){
            System.out.println("喜欢吃香蕉");
        }
    }

    static class Grape{

        public void test(String s){
            System.out.println("喜欢吃葡萄"+s);
        }

    }
}
