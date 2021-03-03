package StatusControlTest;

import javax.xml.crypto.Data;
import java.util.Date;

public class MyThread extends Thread {
    public void run()
    {
        while(true)
        {
            System.out.println("===" + new Date() + "===");
            try {
                sleep(1000);
            }
            catch (Exception e)
            {
                e.printStackTrace();
                return;
            }
        }
    }
}
