package Other;

public class MathTest {

    /**
     * 测试一些基本的Math方法的使用
     */
    public  static  void Test1()
    {
        double a = Math.random();
        double b = Math.random();
        System.out.println(a);
        System.out.println(b);

        System.out.println(Math.sqrt(a*a + b*b));
        System.out.println(Math.pow(a, 8));
        System.out.println(Math.round(b));
        System.out.println(Math.log(Math.pow(Math.E, 8)));

        double d = 60.0;
        double r = Math.PI / 4;
        System.out.println(Math.toRadians(d));
        System.out.println(Math.toDegrees(r));
    }
}
