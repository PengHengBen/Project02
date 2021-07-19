package com.itheima.demo04.Supplier;

import java.util.function.Supplier;

/**
 * @author heng.peng
 * @date 2021/7/18 - 21:41
 * 练习：求数组元素最大值
 *      使用Supplier接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。
 *      提示：接口的泛型请使用java.lang.Integer类
 */
public class Demo02Test {
    // 定义一个方法，用于获取int类型数组中元素的最大值，方法参数传递Supplier接口，泛型使用Integer
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {100,0,-50,880,93,33,-30};
        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }
}
