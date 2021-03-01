package CollectionTest;

//协助测试的类
public class Name implements Comparable{

    String firstName;
    String secondName;

    public Name(String fName, String sName)
    {
        firstName = fName;
        secondName = sName;
    }

    public String toString()
    {
        return firstName + " " + secondName;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof Name)
        {
            Name name = (Name)obj;
            return (firstName.equals(name.firstName)) && (secondName.equals(name.secondName));
        }
        return super.equals(obj);
    }

    //注意：相等的对象应该具有相等的hashcode;
    public int hashCode()
    {
        return firstName.hashCode();
    }

    //实现接口函数
    public int compareTo(Object obj)
    {
        if(obj instanceof Name)
        {
            Name name = (Name)obj;
            int namelength1 = this.firstName.length() + this.secondName.length();
            int namelength2 = name.firstName.length() + name.secondName.length();
            if(namelength1 == namelength2)
            {
                return 0;
            }
            else if(namelength1 < namelength2)
            {
                return -1;
            }
            else//namelength1 > namelength2
            {
                return 1;
            }
        }
        return -1;
        //throw new Exception();//Todo:研究一下此处如何抛出异常
    }
}
