package CollectionTest;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    public  static  void Test()
    {
        Map m1 = new HashMap();
        Map m2 = new TreeMap();

        //自动打包，解包（jdk1.5之后的版本支持）
        m1.put("one", 1);
        m1.put("two", 2);
        m1.put("three", 3);

        //自动打包：int->Integer
        m2.put("A", 1);
        m2.put("B", 2);
        System.out.println(m1.size());
        System.out.println(m1.containsKey("one"));
        System.out.println(m2.containsValue(1));

        if(m1.containsKey("two"))
        {
            //自动解包：Integer->int
            int i = ((Integer)m1.get("two"));
            System.out.println(i);
        }

        Map m3 = new HashMap(m1);
        m3.putAll(m2);
        System.out.println(m3);
    }
}
