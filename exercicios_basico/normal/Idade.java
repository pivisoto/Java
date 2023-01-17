import javax.swing.JOptionPane;

public class Idade {
    public static void main(String arcs[]){
        double idade;
        double resultado;
        idade = Double.parseDouble(JOptionPane.showInputDialog("coloque sua idade"));
        resultado = idade*365;
        JOptionPane.showMessageDialog(null, "sua idade em dias eh " + resultado);
    }
}