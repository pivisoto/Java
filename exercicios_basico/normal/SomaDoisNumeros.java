import javax.swing.JOptionPane;

public class SomaDoisNumeros {
    public static void main (String arcs[]) {
        // declaração de variáveis
        double primeiroValor;
        double segundoValor;
        double resultado;

        //leitura (entrada) dos valores
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro numero"));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog("digite o segundo numero"));
        //processamento
        resultado = primeiroValor + segundoValor;
        //saída
        JOptionPane.showMessageDialog(null, "soma =" + resultado);
    } 
}