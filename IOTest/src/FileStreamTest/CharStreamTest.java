package FileStreamTest;

import jdk.jfr.Category;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamTest {
    public static void ReaderTest() {
        FileReader fr = null;
        int c = 0;
        try {
            fr = new FileReader("F:\\test.txt");
            int num = 0;
            while((c = fr.read()) != -1)
            {
                System.out.println((char) c);
                num ++;
            }
            //Todo:为什么这里读取的字符个数是12个，字节个数也是12个；不应该字符是2字节，应该就是6个吗？
            //还是说因为UTF-8字符对应字节是可变的(验证：Yes)；
            System.out.println("共读取文件" + num + "个字符");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("找不到指定文件");
        }
        catch (IOException e)
        {
            System.out.println("文件读取失败");
        }
    }

    public static void WriterTest() {
        FileReader r = null;
        FileWriter w = null;
        int c = 0;

        //打开文件
        try {
            r = new FileReader("F:\\test.txt");
            w = new FileWriter("F:\\test1.txt");

            while ((c = r.read()) != -1)
            {
                w.write(c);
            }
            r.close();
            w.flush();
            w.close();
            System.out.println("文件拷贝成功");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("没有找到相关文件");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            System.out.println("文件读取错误");
        }
    }
}