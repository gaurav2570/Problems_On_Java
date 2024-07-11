import java.util.*;

class ExectionDemo1X
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the second number : ");
        int iNo2 = sobj.nextInt();
        int iAns = 0;
        try
        {
            System.out.println("Inside try block");
            iAns = iNo1/iNo2;
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Inside catch block");
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch(Exception obj)
        {
            System.out.println("Array Index Out Of Bounds Exception");
        }
        finally
        {
            System.out.println("Inside finally block");
        }
        System.out.println("Divison is : "+iAns);
    }
}