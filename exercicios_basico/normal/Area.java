import javax.swing.JOptionPane;

public class Area{
public static void main(String args[]){
double a, r, pi;

r = Double.parseDouble(JOptionPane.showInputDialog("insira o valor do raio"));

pi = Math.PI;
r = r * r;
a = pi * r;

JOptionPane.showMessageDialog(null, "Area do circulo: " + String.format("%.2f", a));
    }
}