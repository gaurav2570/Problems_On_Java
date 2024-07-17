import java.awt.*;
import javax.swing.*;
class Gui6
{
    public static void main(String Args[])
    {
        GFrame Gobj = new GFrame();
    }
}
class GFrame
{
    GFrame()
    {
        JFrame f = new JFrame("Gaurav");
        f.setSize(300,300);
        f.setVisible(true);

        JButton b = new JButton("Click");
        b.setBounds(130,100,100,40);
        f.setLayout(null);
        f.add(b);
    }
}