import javax.swing.JOptionPane;
public class LeituraDeNumero {
    public static void main(String args[])  {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("colocar numero"));
        if (numero >= 1) {
            JOptionPane.showMessageDialog(null,"este numero eh positivo");
        }
        else {
            if (numero == 0) {
                JOptionPane.showMessageDialog(null,"este numero eh neutro");
            }
            else {
                if (numero <=-1) {
                    JOptionPane.showMessageDialog(null,"este numero eh negativo");
                }                
            }
        }
    }
}