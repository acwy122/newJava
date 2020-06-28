package com.atbiao.foundaction.iotest01.testtcpservice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8011);
        boolean isRunning=true;
        //数据输入流
        while (isRunning) {
            //阻塞式连接  连接以后才执行后面的操作
            Socket accept = serverSocket.accept();
            System.out.println("一个客户端建立了连接");
            new Thread(new Channel(accept)).start();
        }

    }


    static class Channel implements Runnable {
        Socket socket;
        DataInputStream dis = null;
        DataOutputStream dos;

        public Channel(Socket socket) {
            this.socket = socket;
            try {
                dis = new DataInputStream(socket.getInputStream());
                dos = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        //@Override
         public void run() {
            String username = "";
            String upwd = "";
            String[] userInfo = receive().split("&");
            for (String user : userInfo) {
                String[] split = user.split("=");
                if (split[0].equals("username")) {
                    System.out.println("用户名为:" + split[1]);
                    username = split[1];
                } else if (split[0].equals("upwd")) {
                    System.out.println("密码为:" + split[1]);
                    upwd = split[1];
                }
            }
            if (username.equals("admin") && upwd.equals("123456")) {
                send("登录成功，欢迎回来");
            } else {
                send("登录失败，请重新登录");
            }
            close();
        }

        /**
         * 释放资源
         */
        public void close() {
            try {
                if (dos != null) {
                    dos.close();
                }
                if (dis != null) {
                    dis.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        /**
         * 发送数据
         *
         * @param
         */
        public void send(String msg) {
            try {
                dos.writeUTF(msg);
                dos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * 接收数据
         *
         * @return
         */
        public String receive() {
            try {
                return dis.readUTF();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
    }
}
