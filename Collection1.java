import java.util.*;

class Collection1
{
    public static void main(String Args[])
    {
        ArrayList<Float>aobj = new ArrayList<Float>();

        aobj.add(10.0f);
        aobj.add(20.0f);
        aobj.add(30.0f);
        aobj.add(40.0f);

        aobj.clear();

        System.out.println("ArrayList Is : "+aobj);
    }
}