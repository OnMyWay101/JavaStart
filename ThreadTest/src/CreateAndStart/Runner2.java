package CreateAndStart;

public class Runner2 extends Thread{
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            System.out.println("Runner2 : " + i);
        }
    }
}
