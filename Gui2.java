import java.awt.*;
class Gui1
{
    public static void main(String Args[])
    {
        MarvellousFrame Mobj = new MarvellousFrame("Calculator");
    }
}
class MarvellousFrame
{
    MarvellousFrame(String Title)
    {
        Frame fobj = new Frame("Title");

        fobj.setSize(600,300);  //wideth & Height
        fobj.setVisible(true);  //Screen var dakhav
    }
}