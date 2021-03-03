package SwitchStreamTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputStreamTest {
    public static void Test()
    {
        //System.in是接收键盘的输入
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = null;

        try
        {
            s = br.readLine();
            while(s != null)
            {
                if(s.equalsIgnoreCase("exit"))
                {
                    break;
                }
                else
                {
                    System.out.println(s.toUpperCase());
                    s = br.readLine();
                }
            }
            br.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
