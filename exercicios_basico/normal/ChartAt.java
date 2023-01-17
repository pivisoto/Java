import javax.swing.JOptionPane;
public class ChartAt{
public static void main(String[] args) {
String teste = "Hello, strings";
int position =
Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao desejada"));
String resultado = String.format("O caractere na posicao %d eh o %c." , position , teste.charAt(position));
JOptionPane.showMessageDialog(null, resultado);
    }
}