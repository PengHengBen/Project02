package com.itheima.demo09.ConstructorMethodReference;

/**
 * @author heng.peng
 * @date 2021/7/20 - 0:11
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
