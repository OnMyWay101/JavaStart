package StatusControlTest;

public class TestJoin {
    public static void Test()
    {
        MyThread2 t1 = new MyThread2("t1");
        t1.start();
        try{
            for (int i = 0; i < 3; i++) {
                System.out.println("Main thread：before join");
                Thread.sleep(1000);
            }
            t1.join();//t1合并到main中
            for (int i = 0; i < 3; i++) {
                System.out.println("Main thread：after join");
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
