package com.itheima.demo01.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author heng.peng
 * @date 2021/6/22 - 10:34
 * java.util.Collection接口
 *      所有单列集合的最顶层接口，里边定义了所有单列集合共性的方法
 *      任意的单列集合都可以使用Collection接口中的方法
 *
 * 共性的方法：
 *      public boolean add(E e);		向集合中添加元素
 *      public boolean remove(E e);	删除集合中的某个元素
 *      public void clear();			清空集合所有元素
 *      public boolean contains(E e);	判断集合中是否包含某个元素
 *      public boolean isEmpty();		判断集合是否为空
 *      public int size();				获取集合的长度
 *      public Object[] toArray();		将集合转换成一个数组
 */
public class Demo01Collection {
    public static void main(String[] args) {
        // 创建集合对象，可以使用多态
//        Collection<String> coll = new ArrayList<>();
        Collection<String> coll = new HashSet<>();
        System.out.println(coll); // 重写了toString方法 []

        /*
            public boolean add(E e);		向集合中添加元素
            返回值是一个boolean值，一般都返回true，所以可以不用接收
         */
        boolean b1 = coll.add("张三");
        System.out.println("b1:" + b1); // b1:true
        System.out.println("coll:" + coll); // coll:[张三]
        coll.add("李四");
        coll.add("李四"); // 哈希set中只有一个李四，输出结果也只显示一个
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        System.out.println("coll = " + coll); // coll = [张三, 李四, 王五, 赵六, 田七]

        /*
            public boolean remove(E e);	删除集合中的某个元素
            返回值是一个boolean值，集合中存在元素，删除元素，返回true
                                  集合中不存在元素，删除失败，返回false
         */
        boolean b2 = coll.remove("赵六");
        System.out.println("b2 = " + b2); // b2 = true

        boolean b3 = coll.remove("赵四");
        System.out.println("b3 = " + b3); // b3 = false
        System.out.println("coll:" + coll); // coll:[张三, 李四, 王五, 田七]

        /*
            public boolean contains(E e);	判断集合中是否包含某个元素
                包含返回true
                不包含返回false
         */
        boolean b4 = coll.contains("李四"); // b4 = true
        System.out.println("b4 = " + b4);

        boolean b5 = coll.contains("赵四"); // b5 = false
        System.out.println("b5 = " + b5);

        /*
            public boolean isEmpty();		判断集合是否为空
                集合为空，返回true
                集合不为空，返回false
         */
        boolean b6 = coll.isEmpty();
        System.out.println("b6 = " + b6); // false

        // public int size();				获取集合的长度
        int size = coll.size();
        System.out.println("size = " + size); // 4

        // public Object[] toArray();		将集合转换成一个数组
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /*
            public void clear();			清空集合所有元素
                但是不删除集合，集合还存在
         */
        coll.clear();
        System.out.println(coll); // []
        System.out.println(coll.isEmpty()); // true
    }
}
