class ClassDemo1
{
    public static void main(String Args [])
    {
        System.out.println("Inside main");

        Marvellous mobj1 = new Marvellous();
        Marvellous mobj2 = new Marvellous(11,21);

        Gaurav gobj1 = new Gaurav();

        System.out.println("Value of i : "+gobj1.i);
        System.out.println("Value of j : "+gobj1.j);

        System.out.println(mobj2.i);
        System.out.println(mobj2.j);

        mobj2.Fun();
    }
}
class Marvellous
{
    public int i;
    public int j;

    public Marvellous()
    {
        System.out.println("Inside default constructor");
        this.i = 0;
        this.j = 0;
    }
    public Marvellous(int a, int b)
    {
        System.out.println("Inside parametrised constructor");
        this.i = a;
        this.j = b;
    }
    public void Fun()
    {
        System.out.println("Inside Fun method");
    }
}
class Gaurav
{
    public int i = 20;
    public int j = 50;
}