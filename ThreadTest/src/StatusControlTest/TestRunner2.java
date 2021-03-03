package StatusControlTest;

public class TestRunner2 {
    public static void Test()
    {
        Thread t = new Runner2();
        t.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("MainThread: " + i);
        }
        try {
            Thread.sleep(1000);
            System.out.println(t.isAlive());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
