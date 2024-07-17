import java.awt.*;
class Gui3
{
    public static void main(String Args[])
    {
        MarvellousFrame fobj = new MarvellousFrame("Calculator");
    }
}
class MarvellousFrame
{
    MarvellousFrame(String Title)
    {
        Frame fobj = new Frame("Title");

        fobj.setSize(600,300);  //wideth & Height
        fobj.setVisible(true);  //Screen var Dakhav
    }
}
class Listener implements ActionListener
{
   
}