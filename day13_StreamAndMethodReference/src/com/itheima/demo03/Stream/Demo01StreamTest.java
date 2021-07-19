package com.itheima.demo03.Stream;

import java.util.ArrayList;

/**
 * @author heng.peng
 * @date 2021/7/19 - 21:48
 * 练习：集合元素处理（传统方式）
 *      现在有两个ArrayList集合存储队伍当中的多个成员姓名，要求使用传统for循环（或增强for循环）一次进行一下若干操作步骤：
 *      1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
 *      2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中。
 *      3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中。
 *      4. 第二个队伍筛选之后不要前两个人；存储到一个新集合中。
 *      5. 将两个队伍合并为一个队伍；存储到一个新集合中。
 *      6. 根据姓名创建Person对象；存储到一个新集合中。
 *      7. 打印整个队伍的Person对象信息。
 */
public class Demo01StreamTest {
    public static void main(String[] args) {
        // 第一个支队伍
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");
        // 1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : one) {
            if(s.length()==3){
                list1.add(s);
            }
        }
        // 2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中。
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String s = list1.get(i);
            list2.add(s);
        }

        // 第二支队伍
        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");
        // 3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中。
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : two) {
            if(s.startsWith("张")){
                list3.add(s);
            }
        }
        // 4. 第二个队伍筛选之后不要前两个人；存储到一个新集合中。
        ArrayList<String> list4 = new ArrayList<>();
        for (int i = 2; i < list3.size(); i++) {
            list4.add(list3.get(i));
        }

        // 5. 将两个队伍合并为一个队伍；存储到一个新集合中。
        ArrayList<String> list5 = new ArrayList<>();
        /*for (String s : list2) {
            list5.add(s);
        }
        for (String s : list4) {
            list5.add(s);
        }*/
        list5.addAll(list2);
        list5.addAll(list4);
        // 6. 根据姓名创建Person对象；存储到一个新集合中。
        ArrayList<Person> list6 = new ArrayList<>();
        for (String s : list5) {
            list6.add(new Person(s));
        }
        // 7. 打印整个队伍的Person对象信息。
        for (Person person : list6) {
            System.out.println(person);
        }
    }
}
