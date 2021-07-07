package com.itheima.demo06.Lambda;

/**
 * @author heng.peng
 * @date 2021/7/7 - 21:18
 * 给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
 */
public interface Calculator {
    // 定义一个计算两个int整数和的方法并返回结果
    public abstract int calc(int a,int b);
}
