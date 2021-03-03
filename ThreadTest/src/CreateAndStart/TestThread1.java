package CreateAndStart;

import javax.print.attribute.standard.RequestingUserName;

public class TestThread1 {
    public static void Test()
    {
        Runner1 r = new Runner1();
        //r.run();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread:----" + i);
        }
    }

    public static void Test2()
    {
        Runner2 r = new Runner2();
        r.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread:----" + i);
        }
    }

}
