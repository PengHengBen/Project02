package com.itheima.demo02.Set;

import java.util.HashSet;

/**
 * @author heng.peng
 * @date 2021/6/24 - 22:58
 * HashSet存储自定义类型元素
 *
 * Set集合存储元素唯一：
 *      存储的元素（String,Integer, ... Student, Person ...），必须从写hashCode方法和equals方法
 *
 * 要求：
 *      同名同年龄的人，视为同一个人，只能存储一次
 */
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        // 创建HashSet集合存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("迪丽热巴",18);
        Person p2 = new Person("迪丽热巴",18);
        Person p3 = new Person("迪丽热巴",19);
        System.out.println(p1.hashCode()); // 717356484
        System.out.println(p2.hashCode()); // 1595212853

        System.out.println(p1==p2); // false
        System.out.println(p1.equals(p2)); // false
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
