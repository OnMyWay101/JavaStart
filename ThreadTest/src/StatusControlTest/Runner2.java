package StatusControlTest;

public class Runner2 extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().isAlive());
        for (int i = 0; i < 50; i++) {
            System.out.println("SybThread: " + i);
        }
    }
}
