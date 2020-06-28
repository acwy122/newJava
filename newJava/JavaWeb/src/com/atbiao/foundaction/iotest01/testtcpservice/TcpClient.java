package com.atbiao.foundaction.iotest01.testtcpservice;
import java.io.*;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        //使用socket创建客户端，传入服务器地址和端口号
        Socket socket = new Socket("127.0.0.1", 8011);
        boolean isRunning=true;
        while (isRunning){
            System.out.println("请输入你的用户名");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String username = br.readLine();
            System.out.println("请输入你的密码");
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String upwd = br1.readLine();
            new Send(socket).send(username, upwd);
            new Receive(socket).receive();
        }


        socket.close();
    }


    /**
     * 2
     * 发送
     */
    static class Send {
        Socket socket;
        DataOutputStream dos;

        public Send(Socket socket) {
            this.socket = socket;
            try {
                dos = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void send(String username, String upwd) {
            try {
                dos.writeUTF("username=" + username + "&upwd=" + upwd);
                dos.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 接收
     */
    static class Receive {
        Socket socket;
        DataInputStream dis;

        public Receive(Socket socket) {
            this.socket = socket;
            try {
                if (socket != null) {
                    InputStream inputStream = socket.getInputStream();
                    if(inputStream!=null){
                        dis = new DataInputStream(inputStream);
                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void receive() {
            String str;
            try {
                str = dis.readUTF();
                System.out.println(str);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

