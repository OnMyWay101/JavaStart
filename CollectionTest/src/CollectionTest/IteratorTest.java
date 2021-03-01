package CollectionTest;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

    /**
     * Iterator的使用：；hasNext,next;
     */
    public static void Test()
    {
        Collection c = new HashSet();
        c.add(new Name("f1", "s1"));
        c.add(new Name("f2", "s2"));
        c.add(new Name("f3", "s3"));

        Iterator i = c.iterator();
        while(i.hasNext())
        {
            Name n = (Name)i.next();
            System.out.print(n.firstName + " ");
        }
    }

    public static void RemoveTest()
    {
        Collection c = new HashSet();
        c.add(new Name("fff1", "sss1"));
        c.add(new Name("f2", "s2"));
        c.add(new Name("ffff3", "ssss3"));

        for(Iterator i = c.iterator(); i.hasNext();/*不需要*/)
        {
            Name name = (Name)i.next();
            if(name.firstName.length() < 3)
            {
                i.remove();
                //c.remove(name);//会产生异常

            }
        }
        System.out.println(c);
    }
}
