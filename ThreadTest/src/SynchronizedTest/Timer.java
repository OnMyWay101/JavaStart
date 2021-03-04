package SynchronizedTest;

public class Timer {
    private int num = 0;

    //第二种锁定对象的方法是这里写：public synchronized void add(String name)
    public void add(String name)
    {
        synchronized (this)//设置互斥锁“标记”
        {
          num++;
          try {
              Thread.sleep(1);
          }
          catch (Exception e)
          {
              e.printStackTrace();
          }
            System.out.println(name + ", 你是第" + num + "个使用timer的线程");
        }
    }
}
