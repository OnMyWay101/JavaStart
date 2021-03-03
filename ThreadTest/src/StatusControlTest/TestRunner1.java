package StatusControlTest;

public class TestRunner1 {
    public static void Test()
    {
        Runner1 r = new Runner1();
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 1000; i++) {
            if(i % 100 == 0 && i > 0)
            {
                System.out.println("in thread main i=" + i);
            }
        }
        System.out.println("Thread main is over ---------------");
        r.ShutDown();
    }
}
