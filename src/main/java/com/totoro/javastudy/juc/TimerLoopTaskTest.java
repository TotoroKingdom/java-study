package com.totoro.javastudy.juc;

public class TimerLoopTaskTest {

    public static void main(String[] args) {

        new TimerLoopTask(() -> {
            System.out.println("我是定时任务！");
        },3000).start();

    }

    static class TimerLoopTask{
        Runnable task;
        long loopTime;

        public TimerLoopTask(Runnable runnable, long loopTime){
            this.task = runnable;
            this.loopTime = loopTime;
        }

        public void start(){
            new Thread(() ->{
                try{
                    while (true){
                        Thread.sleep(loopTime);
                        task.run();
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }).start();
        }

    }
}
