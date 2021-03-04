package UdpTest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Client {

    public static void main(String[] args) {
        Test();
    }

    private static void Test()
    {
        byte[] buf = (new String("Hello UdpTest")).getBytes();
        try {
            DatagramPacket dp = new DatagramPacket(buf, buf.length, new InetSocketAddress("127.0.0.1", 5678));
            DatagramSocket ds = new DatagramSocket(9999);
            System.out.println("Client send a packet");
            ds.send(dp);
            ds.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
