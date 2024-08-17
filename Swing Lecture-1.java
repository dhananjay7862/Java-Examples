import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class win extends JFrame implements ActionListener
{
    JLabel l1;
    ImageIcon ii1,ii2;
    JButton b1,b2;
    FlowLayout flow;
    public win()
    {
        setTitle("My First Swing Application");
        setSize(800, 600);
        flow=new FlowLayout();
        setLayout(flow);
        ii1=new ImageIcon("dks1.png");
        ii2=new ImageIcon("dks2.png");
        l1=new JLabel(ii1);
        b1=new JButton("First Style");
        b2=new JButton("Second Style");
        add(l1);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            l1.setIcon(ii1);
        else if(e.getSource()==b2)
            l1.setIcon(ii2);
    }
}
public class Main {
    public static void main(String[] args) {
       new win();
    }
}
