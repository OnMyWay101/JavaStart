package CollectionTest;

import java.util.Collections;
import java.util.LinkedList;

public class ListTest {

    /**
     * 测试LinkedList的基本接口
     */
    public static void Test()
    {
        LinkedList l1 = new LinkedList();
        for (int i = 0; i <= 5; i++) {
            l1.add("a" + i);
        }
        System.out.println(l1);
        l1.add(3, "a100");
        System.out.println(l1);
        l1.set(6, "a200");
        System.out.println(l1);

        System.out.println((String)l1.get(2) + "  ");
        System.out.println(l1.indexOf("a3"));

        l1.remove(1);
        System.out.println(l1);
    }

    /**
     * 排序方法测试
     */
    public static  void SortTest()
    {
        LinkedList l1 = new LinkedList();
        for (int i = 0; i <= 9; i++) {
            l1.add("a" + i);
        }
        System.out.println(l1);

        Collections.shuffle(l1);//乱序
        System.out.println(l1);

        Collections.reverse(l1);//逆序
        System.out.println(l1);

        Collections.sort(l1);//排序
        System.out.println(l1);

        System.out.println(Collections.binarySearch(l1, "a5"));
    }

    /**
     * Comparable接口测试
     */
    public static void ComparableTest()
    {
        LinkedList l1 = new LinkedList();
        String fName = "f";
        String sName = "s";
        for (int i = 0; i < 5; i++) {
            l1.add(new Name(fName, sName));
            fName = fName + 1;
            sName = sName + 1;
        }
        System.out.println(l1);

        Collections.shuffle(l1);
        System.out.println(l1);

        Collections.sort(l1);
        System.out.println(l1);
    }
}
