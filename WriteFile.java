import java.io.*;

class writeFile
{
    public static void main(String arg[])
    {
        try
        {
            String Data = "Marvellous Infosystems";
            byte Arr[] = Data.getBytes();

            FileOutputStream fobj = new FileOutputStream("PPA.txt");
            fobj.write(Arr);
        }
        catch(Exception obj)
        {}
    }
}