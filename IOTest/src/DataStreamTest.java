import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class DataStreamTest {
    public static void Test()
    {
        //DataInputStream和DataOutPutStream属于处理流，需要分别“套接”在InputStream和OutputStream类型的节点流上面
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);  //套接

        try {
            dos.writeDouble(Math.random());
            dos.writeBoolean(true);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());//读数据只能一个字节一个字节往外读
            System.out.println(bais.available());

            DataInputStream dis = new DataInputStream(bais);
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            dos.close();
            dis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
