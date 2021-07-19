package com.itheima.demo05.Consumer;

import java.util.function.Consumer;

/**
 * @author heng.peng
 * @date 2021/7/18 - 22:17
 * 练习：
 *      字符串数组当中存有多条信息，请按照格式“姓名：XX。性别：XX。”的格式将信息打印出来。
 *      要求将打印姓名的动作作为第一个Consumer接口的Lambda实例，
 *      将打印性别的动作作为第二个Consumer接口的Lambda实例，
 *      将两个Consumer接口按照顺序“拼接”到一起。
 */
public class Demo03Test {
    // 定义一个方法，参数传递String类型的数组和两个Consumer接口，泛型使用String
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2){
        // 遍历数组
        for (String message : arr) {
            // 使用andThen方法连接两个Consumer接口，消费字符串
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        // 定义一个字符串类型的数组
        String[] arr = {"迪丽热巴，女","古力娜扎，女","玛尔扎哈，男"};
        // 调用printInfo方法，传递一个字符串数组，和两个Lambda表达式
        printInfo(arr,(message)->{
            String name = message.split("，")[0];
            System.out.print("姓名："+name);
        },(message)->{
            String gender = message.split("，")[1];
            System.out.println("。性别："+gender+"。");
        });
    }
}
