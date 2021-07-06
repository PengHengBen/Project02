package demo02.ThreadPool;

/**
 * @author heng.peng
 * @date 2021/7/6 - 23:45
 * 2. 创建一个类，实现Runnable接口，重写run方法，设置线程任务
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程执行");
    }
}
