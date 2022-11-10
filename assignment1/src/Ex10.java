import javax.swing.JOptionPane;
public class Ex10 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "my name is hal!. What Would you like to do");
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "I am sorry "+name+"I am afraid I can not do that");
    }

}
