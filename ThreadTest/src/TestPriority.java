import  CreateAndStart.Runner1;
import CreateAndStart.Runner2;

public class TestPriority {
    public static void Test()
    {
        Thread t1 = new Thread(new Runner1());
        Thread t2 = new Runner2();
        t1.setPriority(Thread.NORM_PRIORITY + 3);
        t1.start();
        t2.start();
    }
}
