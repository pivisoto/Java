import javax.swing.JOptionPane;

public class Semana{
    public static void main(String args[]){
        int dia;
        dia = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o numero do dia da semana"));
        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "esse numero eh igual a domingo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "esse numero eh igual a segunda");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "esse numero eh igual terca");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "esse numero eh igual a quinta");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "esse numero eh igual a quintasexta");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "esse numero eh igual a sexta");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "esse numero eh igual a sabado");
                break;
        }
    }
}