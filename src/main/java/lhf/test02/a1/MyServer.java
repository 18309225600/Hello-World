package lhf.test02.a1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * server端
 */
public class MyServer {
    public static final int port = 4567;
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        while(true){
            //接收到请求，停止阻塞   每一个请求来都分配一个单独线程与之交互
            final Socket accept = serverSocket.accept();
            new Thread(new Runnable() {
                public void run() {
                    try {
                        OutputStream out = accept.getOutputStream();
                        InputStream in = accept.getInputStream();

                        //io读写 。。。
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }


    }

}
