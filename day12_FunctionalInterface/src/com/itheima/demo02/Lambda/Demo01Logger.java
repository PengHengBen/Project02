package com.itheima.demo02.Lambda;

import com.sun.jdi.PathSearchingVirtualMachine;

/**
 * @author heng.peng
 * @date 2021/7/18 - 20:28
 * 日志案例
 *
 * 发现一下代码存在的一些性能浪费的问题
 * 调用showLog方法，传递的第二个参数是一个拼接后的字符串
 * 先把字符串拼接好，然后调用showLog方法
 * showLog方法中如果传递的日志等级不是1级
 * 那么就不会输出拼接后的字符串
 * 那么字符串就白拼接了，存在了浪费资源的情况
 */
public class Demo01Logger {
    // 定义一个根据日志的级别，显示日志信息的方法
    public static void showLog(int level, String message){
        // 对日志的等级进行判断，如果是1级别，那么输出日志信息
        if(level==1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        showLog(1,msg1+msg2+msg3);
    }
}
