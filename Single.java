class Single
{
    public static void main(String args [])
    {
        Derived dobj = new Derived();
        dobj.fun();
        dobj.gun();
    }
}
class Base
{
    public int A,B;
    public Base()
    {
        System.out.println("Inside Base Constructor");
    }
    public void fun ()
    {
        System.out.println("Base fun");
    }
}
class Derived extends Base
{
    public int X,Y;

    public Derived()
    {
        System.out.println("Inside Derived Constructor");
    }
    public void gun ()
    {
        System.out.println("Derived gun");
    }
}