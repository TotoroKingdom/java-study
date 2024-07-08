package com.totoro.javastudy.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Banana(value = "", defaultValue = "cover")
public class ReflectAnnotationTest {

    @Banana(value = "main", defaultValue = "main")
    public static void main(String[] args) {
        Class<ReflectAnnotationTest> clazz = ReflectAnnotationTest.class;
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType());
            System.out.println(annotation instanceof Banana);
            Banana banana = (Banana) annotation;
            System.out.println(banana.value());
            System.out.println(banana.defaultValue());
        }

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            for (Annotation annotation : method.getAnnotations()) {
                System.out.println(annotation.annotationType());
                Banana banana = (Banana) annotation;
                System.out.println(banana.value());
                System.out.println(banana.defaultValue());
            }
        }

    }
}
