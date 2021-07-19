package com.itheima.demo06.Predicate;

import java.util.function.Predicate;

/**
 * @author heng.peng
 * @date 2021/7/18 - 22:41
 * java.util.function.Predicate<T>接口
 * 作用：对某种数据类型的数据进行判断，返回一个boolean值
 *
 * Predicate接口中包含一个抽象方法：
 *      boolean test(T t)：用来对指定数据类型的数据进行判断的方法
 *          结果：
 *              符合条件，返回true
 *              不符合条件，返回false
 */
public class Demo01Predicate {
    /*
        定义一个方法
        参数传递一个String类型的字符串
        传递一个Predicate接口，泛型使用String
        使用Predicate中的方法test对字符串进行判断，并把判断结果返回
     */
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        // 定义一个字符串
        String s = "abcdef";

        boolean b = checkString(s, str -> str.length() > 5);
        System.out.println(b);
    }
}
