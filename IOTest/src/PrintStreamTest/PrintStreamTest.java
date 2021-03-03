package PrintStreamTest;

import java.io.*;

public class PrintStreamTest {
    public static void Test()
    {
        PrintStream ps = null;
        try {
            File f = new File("D:\\test.txt");
            if(!f.exists())
            {
                f.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream("D:\\test.txt");
            ps = new PrintStream(fos);
            System.setOut(ps);//更改默认输出位置为ps,System.out默认指向的是控制台

            for (int i = 0; i < 6000; i++) {
                System.out.print(i + " ");
                if((i + 1) % 100 == 0)
                {
                    System.out.println();
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * 调用输出流的方法打印文件的内容到控制台
     */
    public static void Test2()
    {
        PrintStream ps = System.out;
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\test.txt"));
            String s = null;
            while((s = br.readLine()) != null)
            {
                ps.println(s);
            }
            br.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
