package com.totoro.javastudy.reflect;

public class NewInstanceTest {


    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        Class<Student> clazz = Student.class;
        Student student = clazz.newInstance();
        student.test();

        //newInstance只适用无参构造
        Class<Teacher> teacherClass = Teacher.class;
        Teacher teacher = teacherClass.newInstance();
        teacher.test();
    }

    static class Student{
        public void test(){
            System.out.println("喜欢喝可乐");
        }
    }

    static class Teacher{

        public Teacher(String test){

        }

        public void test(){
            System.out.println("喜欢喝雪碧");
        }
    }
}


