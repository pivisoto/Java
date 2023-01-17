import javax.swing.JOptionPane;
public class TresNotas{
    public static void main(String arcs[]){
        double a, b, c, multa, multb, multc, soma, media;
        a = Double.parseDouble(JOptionPane.showInputDialog("insira a nota A"));
        b = Double.parseDouble(JOptionPane.showInputDialog("insira a nota B"));
        c = Double.parseDouble(JOptionPane.showInputDialog("insira a nota C"));
        multa = a * 2;
        multb = b * 3;
        multc = c * 5;
        soma = multa + multb + multc;
        media = soma/10;
        JOptionPane.showMessageDialog(null,"a media ponderada do aluno eh " + String.format("%.2f", media));


    }
}