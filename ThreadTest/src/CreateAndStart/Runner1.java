package CreateAndStart;

public class Runner1 implements Runnable{
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            System.out.println("Runner1 : " + i);
        }
    }
}
