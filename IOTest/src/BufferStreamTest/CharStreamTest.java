package BufferStreamTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharStreamTest {
    public static void Test()
    {
        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\test.txt"));
            BufferedReader br = new BufferedReader(new FileReader("F:\\test.txt"));

            String s = null;
            for (int i = 1; i < 100; i++) {
                s = String.valueOf(Math.random());//生成随机数字符串
                bw.write(s);
                bw.newLine();
            }
            bw.flush();
            while ((s = br.readLine()) != null)
            {
                System.out.println(s);
            }
            bw.close();
            br.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
