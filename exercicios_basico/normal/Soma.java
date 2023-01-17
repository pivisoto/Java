import javax.swing.JOptionPane;

public class Soma{
public static void main(String args[]){
double n1, n2, soma;

n1 = Double.parseDouble(JOptionPane.showInputDialog("Numero 1: "));
n2 = Double.parseDouble(JOptionPane.showInputDialog("Numero 2: "));

soma = n1 + n2;

JOptionPane.showMessageDialog(null, "Soma total dos numeros: " + String.format("%.2f", soma));
    }
}