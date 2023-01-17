import javax.swing.JOptionPane;

public class NomeSobrenome{
    public static void main(String args[]){
      String nomeCompleto = JOptionPane.showInputDialog("insira seu nome");
      String resultado = String.format("Ola %s , seu sobrenome eh %s"+ nomeCompleto);
      JOptionPane.showMessageDialog(null,resultado);
    }
}