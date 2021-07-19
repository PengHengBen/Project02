package com.itheima.demo02.Lambda;

/**
 * @author heng.peng
 * @date 2021/7/18 - 20:39
 */
@FunctionalInterface
public interface MessageBuilder {
    // 定义一个拼接消息的抽象方法，返回拼接后的消息
    public abstract String builderMessage();
}
