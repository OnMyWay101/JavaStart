package CollectionTest;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public  static void  Test()
    {
        //这里注意ArrayList的用法：里面装的对象是object，所以可以是任意类型；
        Collection c = new ArrayList();
        c.add("hello");
        //Todo:这里如果Name使用的不是static类型的就会有报错.why?
        c.add(new Name("f1", "11"));
        c.add(new Integer(100));
        System.out.println(c.size());
        System.out.println(c);
    }

    public  static void  Test2()
    {
        Collection c = new ArrayList();
        c.add("hello");
        c.add(new Name("f1", "11"));
        c.add(new Integer(100));
        c.remove("hello");
        c.remove(new Integer(100));
        System.out.println(c.remove(new Name("f1", "11")));
        System.out.println(c.size());
        System.out.println(c);
    }
}


