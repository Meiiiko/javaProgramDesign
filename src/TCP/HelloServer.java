package TCP;
import java.net.*;
import java.io.*;
public class HelloServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        Socket client = null;
        PrintStream out = null;
        serverSocket = new ServerSocket(8080);
        System.out.println("服务器运行");
        client = serverSocket.accept();

    }
}
