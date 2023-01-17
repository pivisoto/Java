import javax.swing.JOptionPane;
public class TresValoresReais {
    public static void main(String arcs[]) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("coloque o primeiro numero"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("coloque o segundo numero"));
        double numero3 = Double.parseDouble(JOptionPane.showInputDialog("coloque o terceiro numero"));
        if ((numero1 > numero3) && (numero1 > numero2)) {
            JOptionPane.showMessageDialog(null,"o primeiro numero inserido possui o maior valor");

        }
        else {
            if ((numero2 > numero1) && (numero2 > numero3)) {
                JOptionPane.showMessageDialog(null,"o segundo numero inserio possui o maior valor");

            }
            else {
                if ((numero3 > numero1) && (numero3 > numero2)) {
                    JOptionPane.showMessageDialog(null,"o terceiro numero inserido possui o maior valor");

                }
            }
        }
    }
}