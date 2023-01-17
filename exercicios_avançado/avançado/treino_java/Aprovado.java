import javax.swing.JOptionPane;
public class Aprovado{
    public static void main(String args[]){
        double nota = Double.parseDouble(JOptionPane.showInputDialog("digite sua nota"));
        if (nota >= 90){
            JOptionPane.showMessageDialog(null,"aprovado");
        }
        else{
            if (nota >= 80){
                JOptionPane.showMessageDialog(null, "nota igual ou acima 80");
            }
            else{
                if (nota >= 70){
                JOptionPane.showMessageDialog(null, "nota igual ou acima 70");
                }
                else{
                    JOptionPane.showMessageDialog(null,"reprovado");
                }
            }
        }
    }
}