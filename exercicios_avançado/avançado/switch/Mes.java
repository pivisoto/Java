import javax.swing.JOptionPane;

public class Mes{
    public static void main(String args[]){
        String strMes;
        int intMes, intDias;
        strMes = JOptionPane.showInputDialog("Digite o mes");
        intMes = Integer.parseInt(strMes);
        switch (intMes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                intDias = 31;
                break;
            ///////////////////
            case 2:
                intDias = 28;
                break;
            ///////////////////
            case 4:
            case 6:
            case 9:
            case 11:
                intDias = 30;
                break;
            //////////////////
            default:
                intDias = 0;
        }
        JOptionPane.showMessageDialog(null, "esse mes tem " + intDias + " dias", "Dias do Mes", JOptionPane.INFORMATION_MESSAGE);
    }
}