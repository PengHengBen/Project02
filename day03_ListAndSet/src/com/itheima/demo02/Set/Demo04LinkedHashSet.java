package com.itheima.demo02.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author heng.peng
 * @date 2021/6/24 - 23:14
 * java.util.LinkedHashSet集合 extends HashSet集合
 * LinkedHashSet集合特点：
 *      底层是一个哈希表（数组+链表/红黑树）+ 链表：多了一条链表（记录元素的存储顺序），保证元素有序
 */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast");
        System.out.println(set);

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("itcast");
        System.out.println(linked);
    }
}
