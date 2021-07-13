package com.itheima.demo02.Recursion;

/**
 * @author heng.peng
 * @date 2021/7/12 - 15:47
 * 练习：
 *      使用递归计算阶乘
 *      n的阶乘：n! = n * (n-1) *...* 3 * 2 * 1
 *      5的阶乘：5! = 5 * (5-1) * (5-2) * (5-3) * (5-4)
 */
public class Demo03Recursion {
    public static void main(String[] args) {
        int sum = jc(5);
        System.out.println(sum);
    }

    /*
        定义方法使用递归计算阶乘
        5的阶乘：5! = 5 * (5-1) * (5-2) * (5-3) * (5-4) = 5*4*3*2*1
        递归的结束条件
            获取到1的时候结束
        递归的目的
            获取下一个被乘的数字（n-1）
     */
    public static int jc(int n){
        if(n==1){
            return 1;
        }

        return n*jc(n-1);
    }
}
