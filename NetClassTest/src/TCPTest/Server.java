package TCPTest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void Test()
    {
        try {
            ServerSocket ss = new ServerSocket(8888);
            while(true)
            {
                Socket s = ss.accept();
                System.out.println("server start!");
                DataInputStream dis = new DataInputStream(s.getInputStream());
                System.out.println(dis.readUTF());
                dis.close();
                s.close();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void Test2()
    {
        try {
            ServerSocket ss = new ServerSocket(8888);
            while(true)
            {
                Socket s = ss.accept();
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                dos.writeUTF("Hello, " + s.getInetAddress() + " Port#" + s.getPort() + " bye-bye!");
                dos.flush();
                dos.close();
                s.close();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * 一个server与client对话的小程序
     */
    public static void Test3()
    {
        try {
            ServerSocket server = new ServerSocket(8888);
            Socket s = server.accept();

            BufferedReader is = new BufferedReader(new InputStreamReader(s.getInputStream()));//输入缓冲流
            BufferedReader sis = new BufferedReader(new InputStreamReader(System.in));//系统输入缓冲流
            PrintStream os = new PrintStream(s.getOutputStream());

            String line = sis.readLine();
            while(!line.equals("bye"))
            {
                os.println(line);
                os.flush();
                System.out.println("Server: " + line);
                System.out.println("Client: " + is.readLine());
                line = sis.readLine();
            }
            is.close();
            os.close();
            s.close();
            server.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
