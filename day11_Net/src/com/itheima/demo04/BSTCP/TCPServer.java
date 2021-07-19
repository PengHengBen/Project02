package com.itheima.demo04.BSTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author heng.peng
 * @date 2021/7/16 - 20:29
 * 创建一个BS版本TCP服务器
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        // 创建一个服务器ServerSocket，和系统要制定的端口号
        ServerSocket server = new ServerSocket(8080);
        // 使用accept方法获取到请求的客户端对象（浏览器）
        Socket socket = server.accept();
        // 使用Socket对象中的方法getInputStream，获取到网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        // 使用网络字节输入流InputStream对象中的方法read读取客户端的请求信息
        /*byte[] bytes = new byte[1024];
        int len = 0;
        while((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }*/

        // 把is网络字节输入流对象转换为字符缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        // 把客户端请求信息的第一行读取出来 GET /day11_Net/web/index.html HTTP/1.1
        String line = br.readLine();
        // 把读取的信息进行切割 /day11_Net/web/index.html
        String[] arr = line.split(" ");
        // 把路径前边的/进行截取，进行截取 day11_Net/web/index.html
        String htmlpath = arr[1].substring(1);

        // 创建一个本地字节输入流,构造方法中绑定要读取的html路径
        FileInputStream fis = new FileInputStream(htmlpath);
        // 使用Socket中的方法getOutputStream获取网络字节输出流OutputStream
        OutputStream os = socket.getOutputStream();

        // 写入HTTP协议响应头，固定写法
        os.write("HTTP/1.1 200 ok\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        // 必须写入空行，否则浏览器不解析
        os.write("\r\n".getBytes());

        // 一读一写复制文件，把服务读取到的html文件回写到客户端
        System.out.println(htmlpath);
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len=fis.read(bytes))!=-1){
            //System.out.println(new String(bytes,0,len));
            os.write(bytes,0,len);
        }

        // 释放资源
        fis.close();
        socket.close();
        server.close();
    }
}
