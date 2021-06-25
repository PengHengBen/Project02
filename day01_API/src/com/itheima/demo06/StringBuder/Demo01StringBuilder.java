package com.itheima.demo06.StringBuder;

/**
 * @author heng.peng
 * @date 2021/6/21 - 20:56
 * java.lang.StringBuilder类：字符串缓冲区，可以提供字符串的效率
 * 构造方法：
 *      - public StringBuilder()：构造一个空的StringBuilder容器。
 *      - public StringBuilder(String str)：构造一个StringBuilder容器，并将字符串添加进去。
 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1 = " + bu1);

        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2 = " + bu2);
    }
}
