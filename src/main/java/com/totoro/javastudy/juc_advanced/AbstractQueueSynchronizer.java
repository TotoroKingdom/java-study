package com.totoro.javastudy.juc_advanced;


/**
 * 队列同步器
 */
public class AbstractQueueSynchronizer {

    private transient volatile Node node;

    private transient volatile Node tail;

    private volatile int state;

    //每个处于等待状态的线程都可以是一个节点
    static final class Node{
        //共享锁节点
        static final Node SHARED = new Node();

        //排他锁（独占锁）节点
        static final Node EXCLUSIVE = null;

        /**
         * 等待状态
         */
        //唯一一个大于0的状态，表示已失效，可能是由于超时或者中断，此节点被取消
        static final int CANCELLED = 1;

        //此节点后面的节点被挂起
        static final int SIGNAL = -1;

        //在条件队列中的节点是这个状态
        static final int CONDITION = -2;

        //传播，一般用于共享锁
        static final int PROPAGATE = -3;

        //等待状态值
        volatile int waitStatus;

        //双向链表前节点
        volatile Node prev;
        //后节点
        volatile Node next;
        //每一个线程都可以被封装进一个节点进入到等待队列
        volatile Thread thread;

        //在等待队列中表示模式，条件队列中作为下一个节点的指针。
        Node nextWaiter;

        final boolean isShared(){
            return nextWaiter == SHARED;
        }

        final Node predecessor() throws NullPointerException{
            Node p = prev;
            if (p == null){
                throw new NullPointerException();
            }else {
                return p;
            }
        }

        Node (){

        }

        Node(Thread thread, Node node){
            this.nextWaiter = node;
            this.thread = thread;
        }

        Node(Thread thread, int waitStatus){
            this.waitStatus = waitStatus;
            this.thread = thread;
        }
    }
}
