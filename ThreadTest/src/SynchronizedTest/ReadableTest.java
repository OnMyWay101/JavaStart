package SynchronizedTest;

public class ReadableTest implements Runnable{
    int b = 100;

    private synchronized void func1() throws Exception
    {
        b = 1000;
        Thread.sleep(5000);
        System.out.println("b = " + b);
    }

    private void func2()
    {
        System.out.println(b);
    }

    public void run()
    {
        try {
            func1();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void Test()
    {
        ReadableTest rt = new ReadableTest();
        Thread t = new Thread(rt);
        t.start();
        try{
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        rt.func2();
    }

}
