package StatusControlTest;

public class TestYield {
    public static void Test()
    {
        MyThread3 t1 = new MyThread3("11111");
        MyThread3 t2 = new MyThread3("22222");
        t1.start();
        t2.start();
    }
}
