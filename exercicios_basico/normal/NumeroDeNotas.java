import javax.swing.JOptionPane;
public class NumeroDeNotas{
    public static void main(String args[]){
        int  valor,nota200, nota100, nota50, nota20, nota10, nota2, nota1;
        valor = Integer.parseInt(JOptionPane.showInputDialog("insira a quantidade de dinheiro"));
        nota200 =  valor/200;
        valor = valor - (nota200 * 200);
        nota100 = valor/100;
        valor = valor - (nota100 * 100);
        nota50 = valor/50;
        valor = valor - (nota50 * 50);
        nota20 = valor/20;
        valor = valor - (nota20 * 20);
        nota10 = valor/10;
        valor = valor - (nota10 * 10);
        nota2 = valor/2;
        valor = valor - (nota2 * 2);
        nota1 = valor;
        valor = valor - (nota1 * 1);
        JOptionPane.showMessageDialog(null,"numero de notas em 200: " + nota200 + " numero de notas em 100: " + nota100 + " numero de notas em 50: " + nota50 + " numero de notas em 20: " + nota20 + " numero de notas em 10: " + nota10 + " numero de notas em 2: " + nota2 + " numero de notas em 1: " + nota1);


    }
}