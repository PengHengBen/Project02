package com.itheima.demo02.Recursion;

import java.io.File;

/**
 * @author heng.peng
 * @date 2021/7/12 - 15:55
 * 练习：
 *      递归打印多级目录
 * 需求：
 *      遍历C:\workspaces_idea\Project02\day08_FileAndRecursion文件夹，以及子文件夹
 *      只要.java结尾的文件
 */
public class Demo05Recursion {
    public static void main(String[] args) {
        File file = new File("C:\\workspaces_idea\\Project02\\day08_FileAndRecursion");
        getAllFiles(file);
    }

    /*
        定义一个方法，参数传递File类型的目录
        方法中对目录进行遍历
     */
    public static void getAllFiles(File dir){
        //System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            // 对遍历得到的File对象file进行判断，判断是否是文件夹
            if(file.isDirectory()){
                // file是一个文件夹，则继续遍历这个文件夹
                // 我们发现getAllFiles方法就是传递文件夹，遍历文件夹的方法
                // 所以直接调用getAllFiles方法即可：递归（自己调用自己）
                getAllFiles(file);
            }else {
                // 是一个文件，直接打印即可
                /*
                    C:\workspaces_idea\Project02\day08_FileAndRecursion\src\com\itheima\demo01\File\Demo01File.java
                    只要.java结尾的文件
                    1. 把File对象file，转换为字符串对象
                 */
                //String name = file.getName(); // Demo01File.java
                //String path = file.getPath(); // C:\workspaces_idea\Project02\day08_FileAndRecursion\src\com\itheima\demo01\File\Demo01File.java
                //String s = file.toString(); // C:\workspaces_idea\Project02\day08_FileAndRecursion\src\com\itheima\demo01\File\Demo01File.java

                // 把字符串转换为小写
                //s = s.toLowerCase();

                // 2. 调用String类中的方法endsWith判断字符串是否以.java结尾
                //boolean b = s.endsWith(".java");

                // 3. 如果是以.java结尾的文件，则输出
                /*if(b){
                    System.out.println(file);
                }*/
                if(file.getName().toLowerCase().endsWith(".java")){
                    System.out.println(file);
                }
            }
        }
    }
}
