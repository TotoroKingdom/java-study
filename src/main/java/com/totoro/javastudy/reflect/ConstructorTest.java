package com.totoro.javastudy.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Pear> pearClass = Pear.class;
        Pear pear = pearClass.getConstructor(String.class).newInstance("what are you want from me");
        pear.test();

        Class<Orange> orangeClass = Orange.class;

        try{
            Orange orange = orangeClass.getConstructor(int.class).newInstance(1);
            orange.test();
        } catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 使用getDeclaredConstructor()方法可以找到类中的非public构造方法，
         * 但是在使用之前，我们需要先修改访问权限，在修改访问权限之后，就可以使用非public方法了
         * （这意味着，反射可以无视权限修饰符访问类的内容）
         */
        Constructor<Orange> constructor = orangeClass.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);
        Orange orange = constructor.newInstance(10);
        orange.test();


    }

    static class Pear{
        public Pear(String s){

        }

        public void test(){
            System.out.println("喜欢吃梨");
        }
    }

    static class Orange{
        private Orange(int o){

        }

        public void test(){
            System.out.println("别想吃橘子");
        }
    }
}
