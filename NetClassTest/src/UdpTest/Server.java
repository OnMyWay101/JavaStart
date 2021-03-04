package UdpTest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void Test()
    {
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);

        try {
            DatagramSocket ds = new DatagramSocket(5678);
            System.out.println("Server start:");
            while (true)
            {
                ds.receive(dp);
                //
                System.out.println(new String(buf, 0, dp.getLength()));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
