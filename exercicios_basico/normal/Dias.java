import javax.swing.JOptionPane;

public class Dias{
    public static void main(String arcs[]){
        int dias;
        int meses;
        int anos;
        int resultado;
        anos = Integer.parseInt(JOptionPane.showInputDialog("coloque sua idade"));
        meses = anos*12;
        dias = meses*30;
        resultado = dias;
        JOptionPane.showMessageDialog(null, "numero de dias que voce viveu " + resultado);
    }
}