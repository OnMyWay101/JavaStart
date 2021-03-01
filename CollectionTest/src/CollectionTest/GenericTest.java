package CollectionTest;

import java.util.*;

public class GenericTest {
    public static  void Test()
    {
        List<String> c = new ArrayList<String>();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        for (int i = 0; i < c.size(); i++) {
            String s = c.get(i);
            System.out.println(s);
        }

        List<String> c2 = new ArrayList<String>();
        c2.add("aaa");
        c2.add("bbb");
        c2.add("ccc");
        for (Iterator<String> it = c2.iterator() ; it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
    }

    public static void Test2()
    {
        Map<String, Integer> m1 = new HashMap<String, Integer>();
        m1.put("one", 1);
        m1.put("two", 2);
        m1.put("three", 3);

        System.out.println(m1.size());
        System.out.println(m1.containsKey("one"));

        if(m1.containsKey("two"))
        {
            int i = m1.get("two");
            System.out.println(i);
        }
    }
}
