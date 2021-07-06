package com.itheima.demo06.ThreadSafe;

/**
 * @author heng.peng
 * @date 2021/7/6 - 20:25
 * 实现卖票案例
 */
public class RunnableImpl implements Runnable {
    // 定义一个多线程共享的票源
    private int ticket = 100;

    // 设置线程任务：卖票
    @Override
    public void run() {
        // 使用死循环，让卖票操作重复执行
        while(true){
            // 先判断票是否存在
            if(ticket>0){
                // 票存在，卖票 ticket--;
                System.out.println(Thread.currentThread().getName()+"-->正在卖"+ticket+"张票");
                ticket--;
            }
        }
    }
}
