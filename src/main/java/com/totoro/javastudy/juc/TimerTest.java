package com.totoro.javastudy.juc;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        },1000);

        TimerTest timerTest = new TimerTest();
    }


}
