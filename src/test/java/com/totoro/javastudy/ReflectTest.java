package com.totoro.javastudy;

import com.totoro.javastudy.reflect.Phone;

import java.lang.reflect.Field;

public class ReflectTest {

    public static void main(String[] args) throws IllegalAccessException {

        Phone phone = new Phone();
        Object o = phone.test();

        System.out.println(o);

        Class<?> aClass = o.getClass();
        System.out.println(aClass);

        Field[] fields = aClass.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName());

            field.setAccessible(true);
            Object value = field.get(o);
            System.out.println(value.toString());
        }

    }


}
