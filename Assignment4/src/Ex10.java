import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
//import javax.swing.ImageIcon;






public class Ex10 {


    public static void main(String[] args) {

        JFrame win = new JFrame();
        win.setSize(400, 400);


        JLabel image = new JLabel(new ImageIcon("D:\\"));
        JLabel d = new JLabel("Hello, Dr.fatima");
        d.setOpaque(true);

        Color green1 = new Color(20,200,20);
        d.setBackground(green1);

        win.add(d);


        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);










    }

}
