package FileStreamTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest {
    /**
     * 读取字节流测试
     */
    public static void InputTest()
    {
        //System.out.println("hello ByteStreamTest");
        int b = 0;
        FileInputStream in = null;
        //打开文件
        try
        {
            in = new FileInputStream("F:\\test.txt");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("找不到指定文件");
            System.exit(-1);
        }

        //读取文件
        try {
            long num = 0;
            while((b = in.read()) != -1)
            {
                System.out.println((char)b);
                num++;
            }
            in.close();
            System.out.println();
            System.out.println("共读取了" + num + "个字节");
        }
        catch (IOException e)
        {
            System.out.println("文件读取错误");
            System.exit(-1);
        }
    }

    /**
     * 写入字节流测试
     */
    public static void OutputTest()
    {
        int b = 0;
        FileInputStream in = null;
        FileOutputStream out = null;
        //打开文件
        try {
            in = new FileInputStream("F:\\test.txt");
            out = new FileOutputStream("F:\\test1.txt");//如果目录下面没有相关文件会自动创建
            while((b = in.read()) != -1)
            {
                out.write(b);
            }
            in.close();
//            out.flush();
            out.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("找不到指定文件");
            System.exit(-1);
        }
        catch (IOException ex)
        {
            System.out.println("文件复制错误");
            System.exit(-1);
        }
        System.out.println("复制成功");
    }
}
