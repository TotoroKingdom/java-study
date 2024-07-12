package com.totoro.javastudy.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author totoro
 * @date 2024年07月12日 16:56
 * @description
 */

public class ServerSocketChannelTest {
    public static void main(String[] args) {

        try(ServerSocketChannel serverChannel = ServerSocketChannel.open()){

            InetSocketAddress address = new InetSocketAddress(8080);
            serverChannel.bind(address);

            SocketChannel socket = serverChannel.accept();

            System.out.println("客户端已经连接，IP地址为：" + socket.getRemoteAddress());

            ByteBuffer buffer = ByteBuffer.allocate(128);
            socket.read(buffer);
            buffer.flip();
            System.out.println("接收到客户端数据："+new String(buffer.array(),0, buffer.remaining()));

            socket.write(ByteBuffer.wrap("已经收到".getBytes()));

            socket.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
