package com.itheima.demo09.ConstructorMethodReference;

/**
 * @author heng.peng
 * @date 2021/7/20 - 0:12
 * 定义一个创建Person对象的函数式接口
 */
@FunctionalInterface
public interface PersonBuilder {
    // 定义一个方法，根据传递的姓名，创建Person对象返回
    Person builderPerson(String name);
}
