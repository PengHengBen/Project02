package com.itheima.demo02.Date;

import java.util.Date;

/**
 * @author heng.peng
 * @date 2021/6/18 - 10:38
 */
public class Demo02Date {
    public static void main(String[] args) {
        demo03();
    }

    /*
        Date类的成员方法
        long getTime() 把日期转换为毫秒 相当于System.currentTimeMillis()
            返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
     */
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time); // 1623984628550
    }

    /*
        Date类的空参数构造方法：
            Date(long date)：传递毫秒值，把毫秒转换为Date日期
     */
    private static void demo02() {
        Date d1 = new Date(0L);
        System.out.println(d1); // Thu Jan 01 08:00:00 CST 1970
        Date d2 = new Date(158111111111L);
        System.out.println(d2); // Sun Jan 05 07:45:11 CST 1975
    }

    /*
        Date类的空参数构造方法：
            Date() 获取的就是当前系统的日期和时间
     */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date); // Fri Jun 18 10:40:47 CST 2021
    }
}
