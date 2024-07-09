package com.totoro.javastudy.juc_advanced;

public class VolatileTest1 {

    private static int a = 0;
    private static int b = 0;

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            //指令重排序测试
            new Thread(() ->{
                if (b == 1){
                    if (a == 0){
                        System.out.println("A");
                    }else {
                        System.out.println("B");
                    }
                }
            }).start();

            new Thread(() ->{
                a = 1;
                b = 1;
            }).start();
        }
        /**
         * 在正常情况下，按照我们的正常思维，是不可能输出A的，
         * 因为只要b等于1，那么a肯定也是1才对，因为a是在b之前完成的赋值。
         * 但是，如果进行了重排序，那么就有可能，a和b的赋值发生交换，b先被赋值为1，
         * 而恰巧这个时候，线程1开始判定b是不是1了，这时a还没来得及被赋值为1，可能线程1就已经走到打印那里去了，
         * 所以，是有可能输出A的。
         */

    }

}
