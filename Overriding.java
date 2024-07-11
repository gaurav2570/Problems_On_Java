class Overriding
{
    public static void main(String arg[])
    {
        Base bobj = new Derived();    //Up casting
        //Base bobj = new Base();       //No casting
        //Derived dobj = new Derived(); //No casting
        //Derived dobj = new Base();  //Down casting
        bobj.fun();
        bobj.gun();
        bobj.sun();
        bobj.run();
        //bobj.run(11);
        //bobj.mun();
    }
}
class Base
{
    public void fun()
    {System.out.println("Inside Base fun");}
    public void gun()
    {System.out.println("Inside Base gun");}
    public void sun()
    {System.out.println("Inside Base sun");}
    public void run()
    {System.out.println("Inside Base run");}
}
class Derived extends Base
{
    public void fun()
    {System.out.println("Inside Derived fun");}
    public void sun()
    {System.out.println("Inside Derived sun");}
    public void run(int A)
    {System.out.println("Inside Derived run");}
    public void mun()
    {System.out.println("Inside Derived mun");}
}