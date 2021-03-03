package SwitchStreamTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamTest {
    public static  void Test()
    {
        try {
            File f = new File("F:\\test.txt");
            if(!f.exists())
            {
                f.createNewFile();
            }
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\test.txt"));
            osw.write("aaa");
            System.out.println(osw.getEncoding());  //获取字符编码
            osw.close();
            //true表示在原文件的基础上追加，如果不加true,则会删除原文件的内容后再写入新内容；“ISO8859_1”是一种字符编码，指定了要写入内容的编码格式
            osw = new OutputStreamWriter(new FileOutputStream("F:\\test.txt", true)
                    , "ISO8859_1");
            osw.write("bbb");
            System.out.println(osw.getEncoding());
            osw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
