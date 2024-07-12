package com.totoro.javastudy.nio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author totoro
 * @date 2024年07月12日 16:44
 * @description
 */

public class ClientSocketTest {
    public static void main(String[] args) {

        try(Socket socket = new Socket("localhost",8080)){

            Scanner scanner = new Scanner(System.in);
            System.out.println("成功连接服务器");

            OutputStream stream = socket.getOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(stream);
            System.out.println("请输入要发送给服务端的内容：");
            String msg = scanner.nextLine();
            writer.write(msg+"\n");
            writer.flush();
            System.out.println("数据成功发送：" + msg );
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("收到服务器返回的消息："+reader.readLine());

        }catch (Exception e){
            System.out.println("连接服务器失败");
            e.printStackTrace();
        }finally {
            System.out.println("客户端断开连接");
        }

    }
}
