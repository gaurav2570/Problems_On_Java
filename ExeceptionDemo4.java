import java.util.*;

class ExeceptionDemo4
{
    public static void main(String args[])
    {
        Demo dobj = new Demo();
        try
        {
            System.out.println("Inside try block");
            dobj.Division();
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Inside catch block");
        }
        finally
        {
            System.out.println("Inside finally");
        }
    }
}
class Demo
{
    public void Division() throws ArithmeticException
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the second number : ");
        int iNo2 = sobj.nextInt();

        int iAns = 0;
        iAns = iNo1/iNo2;
        System.out.println("Divison is : "+iAns);
    }
}