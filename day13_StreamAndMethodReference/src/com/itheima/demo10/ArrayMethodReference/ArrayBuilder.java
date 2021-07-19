package com.itheima.demo10.ArrayMethodReference;

/**
 * @author heng.peng
 * @date 2021/7/20 - 0:22
 * 定义一个创建数组的函数式接口
 */
@FunctionalInterface
public interface ArrayBuilder {
    // 定义一个创建int类型数组的方法，参数传递数组的长度，返回创建好的int类型数组
    int[] builderArray(int length);
}
