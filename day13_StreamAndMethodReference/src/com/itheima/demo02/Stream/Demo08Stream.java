package com.itheima.demo02.Stream;

import java.util.stream.Stream;

/**
 * @author heng.peng
 * @date 2021/7/19 - 21:42
 * Stream流中的常用方法_concat：用于把流组合到一起
 * 如果有两个流，希望合并为一个流，那么可以使用Stream接口的静态方法concat
 * static <T> Stream<T> concat(Stream< ? extends T> a,Stream< ? extends T> b)
 */
public class Demo08Stream {
    public static void main(String[] args) {
        // 创建一个Stream流
        Stream<String> stream1 = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        // 获取一个Stream流
        String[] arr = {"美羊羊","喜羊羊","懒羊羊","灰太狼","红太狼"};
        Stream<String> stream2 = Stream.of(arr);
        // 把以上两个流，组合成一个流
        Stream<String> concat = Stream.concat(stream1, stream2);
        // 遍历concat流
        concat.forEach(name-> System.out.println(name));
    }
}
