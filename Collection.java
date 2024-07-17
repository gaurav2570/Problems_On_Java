import java.util.*;

class Collection
{
    public static void main(String Args[])
    {
        LinkedList<Integer>lobj = new LinkedList<Integer>();

        lobj.add(10);
        lobj.add(20);
        lobj.add(30);
        lobj.add(40);
        lobj.addFirst(50);

        System.out.println("linkedList is : "+lobj);

        if(lobj.contains(30))
        {
            System.out.println("Contains 30 in it");
        }
        else
        {
            System.out.println("There is no 30");
        }

        /*Iterator<Integer>iobj = lobj.iterator(); //Itrator method aahe mhanun i chota aahe 
        while(iobj.hasNext());
        {
            System.out.println(iobj.Next());
        }*/
        System.out.println("Index of 30 is : "+lobj.indexOf(30));
    }
}