import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;


class TrafCompt extends JComponent
{
    private static final long serialVersionUID = 1L;

    public void paint(Graphics tr)
    {

        tr.setColor(Color.BLACK);
        tr.drawRect(10, 10, 50, 120);

        tr.setColor(Color.RED);
        tr.fillOval(20, 15, 30, 30);
        tr.setColor(Color.YELLOW);
        tr.fillOval(20, 55, 30, 30);
        tr.setColor(Color.GREEN);
        tr.fillOval(20, 95, 30, 30);

    }
}


public class Ex9 {


    public static void main(String[] args) {


        JFrame win = new JFrame();

        win.setSize(400, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        win.add(new TrafCompt());

        win.setVisible(true);

    }

}