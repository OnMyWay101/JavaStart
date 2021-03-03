package BufferStreamTest;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ByteStreamTest {
    public static void Test()
    {
        try {
            FileInputStream fis = new FileInputStream("F:\\test.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int b = 0;
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());

            bis.mark(10);//从第10个往外读
            for (int i = 0; (i < 5) && ((b = bis.read()) != -1); i++) {
                System.out.println((char)b + " ");
            }
            System.out.println();
            bis.reset();//回到标记10
            for (int i = 0; (i < 5) && ((b = bis.read()) != -1); i++) {
                System.out.println((char)b + " ");
            }
            bis.close();
            //fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
