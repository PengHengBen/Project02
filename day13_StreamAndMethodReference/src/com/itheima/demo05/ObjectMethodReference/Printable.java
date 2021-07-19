package com.itheima.demo05.ObjectMethodReference;

/**
 * @author heng.peng
 * @date 2021/7/19 - 22:57
 * 定义一个打印的函数式接口
 */
@FunctionalInterface
public interface Printable {
    // 定义字符串的抽象方法
    void print(String s);
}
