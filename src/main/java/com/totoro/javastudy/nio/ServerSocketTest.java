package com.totoro.javastudy.nio;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author totoro
 * @date 2024年07月12日 16:24
 * @description
 */

public class ServerSocketTest {

    public static void main(String[] args) {

        try (ServerSocket server = new ServerSocket(8080)) {
            System.out.println("正在等待客户端连接。。。");

            Socket socket = server.accept();

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("接收到客户端数据：");
            System.out.println(reader.readLine());

            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            writer.write("已经收到");
            writer.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
