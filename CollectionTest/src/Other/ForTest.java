package Other;

import java.util.ArrayList;
import java.util.Collection;

public class ForTest {
    public static void Test1()
    {
        int[] arr = {1,2,3,4,5};
        for(int i:arr)
        {
            System.out.println(i + " ");
        }

        System.out.println();
        Collection c = new ArrayList();
        c.add(new String("aaa"));
        c.add(new String("bbb"));
        c.add(new String("vvv"));
        for(Object o:c)
        {
            System.out.println(o + " ");
        }
    }
}
