package TestString;

public class StringBufferTest {
    public static void main(String[] args) {
        Test1();
        //FindSubStringTime();
    }

    private  static void Test1()
    {
        String s = "Microsoft";
        char[] a = {'a', 'b', 'c', 'd'};
        StringBuffer sb1 = new StringBuffer(s);
        System.out.println("the length of sb1:" + sb1.length());

        sb1.append('/').append("IBM").append('/').append("Sun");

        System.out.println(sb1);
        StringBuffer sb2 = new StringBuffer("数字：");
        for (int i = 0; i <= 9; i++)
        {
            sb2.append(i);
        }

        System.out.println(sb2);
        sb2.delete(8, sb2.length()).insert(0, a);
        System.out.println(sb2);
        System.out.println(sb2.reverse());
    }

    /**
     * 查找一个子字符串在字符串中出现的次数
     */
    private  static void FindSubStringTime()
    {
        String s = "sun java sun java sun java sun java";
        String find = "java";

        int count = 0;
        while(s.indexOf(find) != -1)
        {
            s = s.substring(s.indexOf(find) + find.length());
            count++;
        }
        System.out.println("times:" + count);
    }
}
