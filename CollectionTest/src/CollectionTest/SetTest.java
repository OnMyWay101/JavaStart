package CollectionTest;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void Test()
    {
        Set s = new HashSet();
        s.add("hello");
        s.add("world");
        s.add(new Name("f1", "s1"));
        s.add(new Integer(100));
        s.add(new Name("f1", "s1"));
        s.add("hello");
        System.out.println(s + "     ");
    }

    /**
     * 求两个集合的交集
     */
    public static void Retain()
    {
        Set s1 = new HashSet();
        Set s2 = new HashSet();
        s1.add("a");
        s1.add("b");
        s1.add("c");

        s2.add("a");
        s2.add("b");
        s2.add("d");

        Set sn = new HashSet(s1 );
        sn.retainAll(s2);
        Set su = new HashSet(s1);
        su.addAll(s2);

        System.out.println("su = " + su);
        System.out.println("sn = " + sn);
    }
}
