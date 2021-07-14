package com.itheima.demo03.ReverseStream;

import java.io.*;

/**
 * @author heng.peng
 * @date 2021/7/14 - 23:23
 * 练习：转换文件编码
 *      将GBK编码的文本文件，转换为UTF-8编码的文本文件。
 *
 * 分析：
 *      1. 创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称GBK
 *      2. 创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称UTF-8
 *      3. 使用InputStreamReader对象中的方法read读取文件
 *      4. 使用OutputStreamWriter对象中的方法write,把读取到的数据写入到文件中
 *      5. 关闭资源
 */
public class Demo04Test {
    public static void main(String[] args) throws IOException {
        // 1. 创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称GBK
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_IO\\gbk.txt"),"GBK");
        // 2. 创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称UTF-8
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10_IO\\gbk-utf-8.txt"),"utf-8");
        // 3. 使用InputStreamReader对象中的方法read读取文件
        int len = 0;
        while((len=isr.read())!=-1){
            // 4. 使用OutputStreamWriter对象中的方法write,把读取到的数据写入到文件中
            osw.write(len);
        }
        // 5. 关闭资源
        osw.close();
        isr.close();
    }
}
