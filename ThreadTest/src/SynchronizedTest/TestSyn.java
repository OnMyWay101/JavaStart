package SynchronizedTest;

public class TestSyn implements Runnable {
    Timer timer = new Timer();
    public static void Test()
    {
        TestSyn test = new TestSyn();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }


    public void run()
    {
        timer.add(Thread.currentThread().getName());
    }
}
