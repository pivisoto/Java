import javax.swing.JOptionPane;

public class Antecessor {
    public static void main(String arcs[]){
        double primeiroValor;
        double resultado;
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("digite o numero"));
        resultado = primeiroValor - 1;
        JOptionPane.showMessageDialog(null,"esse eh o antecessor " + resultado);
    }
    
}