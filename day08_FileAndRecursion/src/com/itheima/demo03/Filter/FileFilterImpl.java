package com.itheima.demo03.Filter;

import java.io.File;
import java.io.FileFilter;

/**
 * @author heng.peng
 * @date 2021/7/12 - 16:55
 * 创建过滤器FileFilter的实现类，重写过滤器accept，定义过滤规则
 */
public class FileFilterImpl implements FileFilter{
    @Override
    public boolean accept(File pathname) {
        /*
            过滤的规则：
            在accept方法中，判断File对象是否以.java结尾
            是就返回true
            不是就返回false
         */
        if(pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
