package com.totoro.javastudy.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectFieldTest {

    public static void main(String[] args) throws Exception {

        Class<?> bbClazz = Class.forName("com.totoro.javastudy.reflect.ReflectFieldTest$BlueBerry");
        Object instance = bbClazz.newInstance();
        Method method = bbClazz.getMethod("test");

        try{
            Field numberField = bbClazz.getDeclaredField("number");
            numberField.set(instance, 100);
            Field weightField = bbClazz.getDeclaredField("weight");
            weightField.setAccessible(true);
            weightField.set(instance,200);
            Field colorField = bbClazz.getDeclaredField("color");
            colorField.setAccessible(true);
            colorField.set(instance,"绿色");
            //强行修改color的值 通过反射修改final
            Field colorField1 = bbClazz.getDeclaredField("color");

            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(colorField1, colorField1.getModifiers()&~Modifier.FINAL);

            colorField1.setAccessible(true);
            colorField1.set(instance, "绿色");

        } catch (Exception e){
            e.printStackTrace();
        }


        method.invoke(instance);

    }

    static class BlueBerry{
        int number;
        private Integer weight;

//        private final String color = "蓝色";

        /**
         * 注意上面为何把 color 的赋值为 new String(“蓝色”),
         * 这是为了不让 Java 编译器内联 color 到 test() 方法中，
         * 而使 test() 的方法体为 return “蓝色”，造成 test() 永远输出 ”蓝色” 。
         */
        private final String color = new String("蓝色");

        public void test(){
            System.out.println("number = "+this.number);
            System.out.println("weight = "+this.weight);
            System.out.println("color = "+this.color);
        }
    }
}
