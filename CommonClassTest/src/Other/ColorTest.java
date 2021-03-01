package Other;

public class ColorTest {
    public enum color
    {
        red,
        green,
        blue
    }

    public static void Test1()
    {
        color m = color.blue;
        switch (m)
        {
            case red:
                System.out.println(color.red);
                break;
            case green:
                System.out.println(color.green);
                break;
            default:
                System.out.println("default:" + color.blue);
        }
    }
}
