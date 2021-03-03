package StatusControlTest;

public class Runner1 implements Runnable{
    private boolean flag = true;

    public void run()
    {
        int i =0;
        while(flag)
        {
            System.out.println(" " + i++);
        }
        System.out.println("Runner1 is over");
    }

    public void ShutDown()
    {
        flag = false;
    }
}
