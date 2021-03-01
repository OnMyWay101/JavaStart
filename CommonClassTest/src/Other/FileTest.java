package Other;
import javax.swing.text.AsyncBoxView;
import java.io.File;
import java.io.IOException;

public class FileTest {

    /**
     * 测试File类的一般接口
     */
    public static void Test1()
    {
        String separator = File.separator;
        System.out.println(separator);
        String filename = "test.txt";
        String directory = "testdir1" + separator + "testdir2";
        File f = new File(directory, filename);
        if(f.exists())
        {
            System.out.println("文件名：" + f.getAbsolutePath());
            System.out.println("文件文件：" + f.length());
        }
        else
        {
            f.getParentFile().mkdirs();
            try {
                f.createNewFile();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    /**
     * 递归列出目录结构
     */
    public static void Test2(String dirPath)
    {
        File f = new File(dirPath);
        System.out.println(f.getName());
        Tree(f, 1);

    }

    /**
     * 递归探索文件名
     * @param f：文件描述符
     * @param level：文件的深度
     */
    private static void Tree(File f, int level)
    {
        String preStr = "";
        for(int i =0;i < level; i++)
        {
            preStr += "    ";
        }
        File[] childs = f.listFiles();
        for(File c: childs)
        {
            System.out.println(preStr + c.getName());
            if(c.isDirectory())
            {
                Tree(c, level + 1);
            }
        }
    }
}
