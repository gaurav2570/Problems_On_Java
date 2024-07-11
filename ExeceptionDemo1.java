import java.util.*;

class ExectionDemo1
{
    public static void main(String args[])
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