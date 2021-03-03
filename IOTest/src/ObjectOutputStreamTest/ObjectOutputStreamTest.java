package ObjectOutputStreamTest;

import java.io.*;

public class ObjectOutputStreamTest {
    public static void Test()
    {
        T t = new T();
        t.k = 8;
        try{
            FileOutputStream fos = new FileOutputStream("D:\\test.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(t);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("D:\\test.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            T tReaded = (T)ois.readObject();
            System.out.println(tReaded.i + " " + tReaded.j + " " + tReaded.d + " " + tReaded.k);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}

class T implements Serializable{
    int i = 0;
    int j = 9;
    double d = 2.3;
    int k = 0;
}
