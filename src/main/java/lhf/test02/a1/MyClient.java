package lhf.test02.a1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * client
 */
public class MyClient {
    public static final String addr = "127.0.0.1";
    public static final int port = 4567;
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(addr,port);
        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();
        //。。 io读写
    }
}
