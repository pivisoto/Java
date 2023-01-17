import javax.swing.JOptionPane;
public class PlanoCartesiano{
    public static void main(String arcs[]){
        double x1;
        double x2;
        double y1;
        double y2;
        double menosx;
        double menosy;
        double xelevado;
        double yelevado;
        double soma;
        double resultado;
        x1 = Double.parseDouble(JOptionPane.showInputDialog("insira o valor de x1"));
        x2 = Double.parseDouble(JOptionPane.showInputDialog("insira o valor de x2"));
        y1 = Double.parseDouble(JOptionPane.showInputDialog("insira o valor de y1"));
        y2 = Double.parseDouble(JOptionPane.showInputDialog("insira o valor de y2"));
        menosx = x2 - x1; 
        menosy = y2 - y1;
        xelevado = menosx * menosx;
        yelevado = menosy * menosy;
        soma = xelevado + yelevado;
        resultado = Math.sqrt(soma);
        JOptionPane.showMessageDialog(null,  "a distancia entro os dois pontos eh " + String.format("%.2f",resultado));





    }
}