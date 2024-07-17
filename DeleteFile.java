import java.io.*;

class DeleteFile
{
    public static void main(String arg[])
    {
        File fobj = new File("PPA.txt");
        fobj.delete();
    }
}