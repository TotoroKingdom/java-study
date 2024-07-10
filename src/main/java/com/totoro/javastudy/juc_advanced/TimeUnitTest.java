package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.TimeUnit;

public class TimeUnitTest {
    public static void main(String[] args) throws InterruptedException {

        synchronized (TimeUnitTest.class){
            System.out.println("waiting");
            TimeUnit.SECONDS.timedWait(TimeUnitTest.class, 3);
            System.out.println("over");
        }
    }
}
