package com.itheima.demo03.Lambda;

/**
 * @author heng.peng
 * @date 2021/7/7 - 20:31
 * 创建Runnable接口的实现类，重写run方法，设置线程任务
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" 新线程创建了");
    }
}
