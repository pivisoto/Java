import javax.swing.JOptionPane;
public class Soma{
    public static void main(String args[]){
        int a = Integer.parseInt(JOptionPane.showInputDialog("insira o valor de a"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("insira o valor de b"));
        int x = a + b;
        JOptionPane.showMessageDialog(null,"x =" + x);
    }
}