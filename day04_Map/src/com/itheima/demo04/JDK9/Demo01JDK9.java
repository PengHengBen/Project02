package com.itheima.demo04.JDK9;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author heng.peng
 * @date 2021/6/28 - 21:24
 * JDK9的新特性：
 *      List接口，Set接口，Map接口：里边增加了一个静态的方法of，可以给集合一次性添加多个元素
 *      static <E> List<E> of (E... elements)
 *      使用前提：
 *          当集合中存储的元素个数已经确定了，不再改变时使用
 * 注意：
 *      1. of方法只适用月List接口，Set接口，Map接口，不适用于接口的实现类
 *      2. of方法的返回值是一个不能改变的集合，集合不能再使用add，put方法添加元素，否则会抛出异常
 *      3. Set接口和Map接口在调用of方法的时候，不能有重复元素，否则会抛出异常
 */
public class Demo01JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a","b","a","c","d");
        System.out.println(list); // [a, b, a, c, d]
//        list.add("w"); // java.lang.UnsupportedOperationException 不支持操作异常

//        Set<String> set = Set.of("a", "b", "a", "c", "d"); // java.lang.IllegalArgumentException 非法参数异常
        Set<String> set = Set.of("a", "b", "c", "d"); // [d, a, c, b]
        System.out.println(set);
//        set.add("e"); // java.lang.UnsupportedOperationException 不支持操作异常

//        Map<String, Integer> map = Map.of("迪丽热巴", 18, "古力娜扎", 19, "玛尔扎哈", 20,"迪丽热巴",19); // java.lang.IllegalArgumentException 非法参数异常
        Map<String, Integer> map = Map.of("迪丽热巴", 18, "古力娜扎", 19, "玛尔扎哈", 20);
        System.out.println(map); // {迪丽热巴=18, 古力娜扎=19, 玛尔扎哈=20}
        map.put("阿依土鳖",30); // java.lang.UnsupportedOperationException 不支持操作异常
    }
}
