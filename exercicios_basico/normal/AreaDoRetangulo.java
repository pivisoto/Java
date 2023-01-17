import javax.swing.JOptionPane;

public class AreaDoRetangulo {
    public static void main(String arcs[]) {
        double base;
        double altura;
        double resultado;
        base = Double.parseDouble(JOptionPane.showInputDialog("base do retangulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("altura do retangulo"));
        resultado = base*altura;
        JOptionPane.showMessageDialog(null, "area do retangulo eh " + resultado);
    }
}