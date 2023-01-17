import javax.swing.JOptionPane;

public class Ler {
    public static void main(String arcs[]){
    //int é igual a numero inteiro e double numero quebrado
    double primeiroNumero;
    double segundoNumero;
    double terceiroNumero;
    double quartoNumero;
    double quadradoDoPrimeiro;
    double quadradoDoSegundo;
    double quadradoDoTerceiro;
    double quadradoDoQuarto;
    double resultado;
    primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro valor"));
    segundoNumero = Double.parseDouble(JOptionPane.showInputDialog("digite o segundo valor"));
    terceiroNumero = Double.parseDouble(JOptionPane.showInputDialog("digite o terceiro valor"));
    quartoNumero = Double.parseDouble(JOptionPane.showInputDialog("digite o quarto valor"));
    quadradoDoPrimeiro = primeiroNumero*primeiroNumero;
    quadradoDoSegundo = segundoNumero*segundoNumero;
    quadradoDoTerceiro = terceiroNumero*terceiroNumero;
    quadradoDoQuarto = quartoNumero*quartoNumero;
    resultado = quadradoDoPrimeiro + quadradoDoSegundo + quadradoDoTerceiro + quadradoDoQuarto;
    JOptionPane.showMessageDialog(null,"valor " + resultado);
    }
}
