package TCPTest;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Test3();
    }

    public static void Test()
    {
        try {
            Socket s = new Socket("127.0.0.1", 8888);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF("hello server ! i am a client!");
            dos.flush();
            dos.close();
            s.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void Test2()
    {
        try {
            Socket s = new Socket("127.0.0.1", 8888);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            System.out.println(dis.readUTF());
            dis.close();
            s.close();
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
            Socket socket = new Socket("127.0.0.1", 8888);
            BufferedReader sis = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream os = new PrintStream(socket.getOutputStream());

            String line = sis.readLine();
            while(!line.equals("bye"))
            {
                os.println(line);
                os.flush();
                System.out.println("Client: " + line);
                System.out.println("Server: " + is.readLine());
                line = sis.readLine();
            }
            os.close();
            is.close();
            socket.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
