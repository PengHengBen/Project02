package com.itheima.demo06.StaticMethodReference;

/**
 * @author heng.peng
 * @date 2021/7/19 - 23:36
 */
@FunctionalInterface
public interface Calcable {
    // 定义一个抽象方法，传递一个整数，对整数进行绝对值计算并返回
    int calsAbs(int number);
}
