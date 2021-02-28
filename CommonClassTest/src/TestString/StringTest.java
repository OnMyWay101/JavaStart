package TestString;

public class StringTest {
        /**
         * 1.测试String类型的创建；
         * 2.测试String的字面值的使用；
         */
        public  static void Test1()
        {
            String s1 = "hello";
            String s2 = "world";
            String s3 = "hello";
            System.out.println(s1 == s3);
            s1 = new String("hello");
            s3 = new String("hello");
            System.out.println(s1.equals(s3));
            System.out.println(s1 == s2);
            char[] cs = {'s', 'u', 'n', ' ' , 'j' ,'a', 'v', 'a'};
            String s4 = new String(cs);
            String s5 = new String(cs, 4, 4);
            System.out.println(s4);
            System.out.println(s5);
        }

        /**
         *
         */
        public  static void Test2()
        {
            String s1 = new String("  wangcj is a handsome boy!   ");
            char c1 = s1.charAt(5);
            System.out.println("char at 5: " + c1);
            System.out.println("length:" + s1.length());
            System.out.println("index of 'cj':" + s1.indexOf("cj"));
            System.out.println("replace 'cj' with 'x':" + s1.replace("cj", "x"));
            System.out.println("startWith 'wang':" + s1.startsWith("wang"));
            System.out.println("toUpperCase:" + s1.toUpperCase());
            System.out.println("trim:" + s1.trim());
            String[] ss = s1.split("");
            for(String s:ss)
            {
                System.out.print("--" + s);
            }
        }
}
