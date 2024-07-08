package com.totoro.javastudy.reflect;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassLoaderTest2 extends ClassLoader {

    private static final String url = "src/main/java/com/totoro/javastudy/CustomerClassLoaderTest.class";
    //这个必须放在com下面才能成功
    private static final String fileName = "com.totoro.javastudy.CustomerClassLoaderTest";

    public Class<?> defineClass(String name, byte[] b){
        //调用protected方法，支持载入外部class文件
        return defineClass(name, b, 0, b.length);
    }

    public static void main(String[] args) throws Exception {
        ClassLoaderTest2 classLoader = new ClassLoaderTest2();
        FileInputStream stream = new FileInputStream(url);
        byte[] bytes = new byte[stream.available()];
        stream.read(bytes);
        Class<?> aClass = classLoader.defineClass(fileName, bytes);
        System.out.println(aClass.getName());

        try{
            Object object = aClass.newInstance();
            Method method = aClass.getMethod("test", String.class);
            method.invoke(object, "哥们这瓜保甜吗？");

        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            Object instance = aClass.newInstance();
            Method method = aClass.getMethod("test", String.class);
            Field field = aClass.getField("text");
            field.set(instance, "卖瓜妹");
            method.invoke(instance, "妹妹西瓜保甜吗");
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
