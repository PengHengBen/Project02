package com.itheima.getName;

/**
 * @author heng.peng
 * @date 2021/6/30 - 22:34
 * 获取线程的名称：
 *      1. 可以使用Thread类中的方法
 *          String getName() 返回该线程的名称。
 *      2. 可以先获取当前正在执行的线程，使用线程中的方法getName()获取线程的名称
 *          static Thread currentThread() 返回对当前正在执行的线程对象的引用。
 */
// 定义一个Thread类的子类
public class MyThread extends Thread{
    // 重写Thread类中的run方法

    @Override
    public void run() {
        // 获取线程名称
//        String name = getName();
//        System.out.println(name); // Thread-x
//        Thread t = Thread.currentThread();
//        System.out.println(t); // Thread[Thread-0,5,main]
//        String name = t.getName();
//        System.out.println(name);

        // 链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
