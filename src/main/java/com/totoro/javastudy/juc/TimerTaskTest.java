package com.totoro.javastudy.juc;

public class TimerTaskTest {

    public static void main(String[] args) {

        new TimerTask(() -> {
            System.out.println("我是定时任务！");
        },3000).start();


    }

    static class TimerTask{

        Runnable task;
        long time;

        public TimerTask(Runnable task, long time) {
            this.task = task;
            this.time = time;
        }

        public void start(){
            new Thread(() ->{
                try{
                    Thread.sleep(time);
                    task.run();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }).start();

        }
    }


}
