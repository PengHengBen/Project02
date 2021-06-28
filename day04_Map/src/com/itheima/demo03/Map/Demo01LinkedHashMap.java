package com.itheima.demo03.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author heng.peng
 * @date 2021/6/28 - 20:35
 * java.util.LinkedHashMap<K,V> extends HashMap<K,V>
 * 底层原理：
 * 哈希表 + 链表（记录元素的顺序）
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");
        System.out.println(map); // key不允许重复，无序 {a=d, b=b, c=c}

        LinkedHashMap<String, String> linked = new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("c","c");
        linked.put("b","b");
        linked.put("a","d");
        System.out.println(linked); // key不允许重复，有序 {a=d, c=c, b=b}
    }
}
