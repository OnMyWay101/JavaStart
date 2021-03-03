package PrintStreamTest;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Date;

public class PrintWriterTest {
    public static void Test()
    {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            FileWriter fw = new FileWriter("D:\\test.txt", true);
            PrintWriter log = new PrintWriter(fw);
            while ((s = br.readLine()) != null)
            {
                if(s.equalsIgnoreCase("exit"))
                {
                    break;
                }
                System.out.println(s.toUpperCase());
                log.println("----");
                log.println(s.toUpperCase());
                log.flush();
            }
            log.println("===" + new Date() + "===");
            log.flush();
            log.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
