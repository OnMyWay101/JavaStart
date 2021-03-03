package StatusControlTest;

public class TestInterrupt {
    public static void Test()
    {
        MyThread mt = new MyThread();
        mt.start();
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e)
        {
            mt.interrupt();
        }
    }
}
