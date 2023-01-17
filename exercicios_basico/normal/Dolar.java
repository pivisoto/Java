import javax.swing.JOptionPane;

public class Dolar {
    public static void main(String arcs[]){          
    //declaração das variaveis
    double dolar;
    double real;
    double resultado;
    //onde o usuario coloca os valores
    dolar = Double.parseDouble(JOptionPane.showInputDialog("digite a cotacao do dolar"));
    real = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do real"));
    resultado = real/dolar;
    //oque aparece na tela como resultado
    JOptionPane.showMessageDialog(null,"conversao" + resultado);
    }
}