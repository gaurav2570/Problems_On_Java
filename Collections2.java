import java.util.*;

class Collections2
{
    public static void main(String Args[])
    {
        Hashtable<String,Integer>hobj = new Hashtable<String,Integer>();

        hobj.put("PPA",19500);
        hobj.put("LOGIC",19700);
        hobj.put("ANGLE",19000);
        hobj.put("PAYTHOGAON",20000);

        System.out.println("Hashtable Element : "+hobj);
        System.out.println("Keys are : "+hobj.keys());
        System.out.println("Values are : "+hobj.values());
    }
}