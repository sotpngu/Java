package Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class GreetingServer extends Thread {

    public ServerSocket serverSocket;

    public GreetingServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    public void run () {
        while (true) {
            try {
                System.out.println("等待远程连接，端口号为： " + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();
                System.out.println("远程主机地址：" + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + "\n bye!");
                server.close();
            } catch (SocketTimeoutException t) {
                t.printStackTrace();
                break;
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("args[0]: " + args);
        int port = Integer.parseInt(args[0]);
        try {
            Thread thread = new GreetingServer(port);
            thread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
