import javax.swing.JOptionPane;
public class UsarCalculadora {
    public static void main(String[]args){
        Calculadora mini = new Calculadora();
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("1- soma\n2-subtracao\n3-multiplicaçao\n4-divisao" ));
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro numero " ));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("insira o segundo numero " ));
        String string1 = JOptionPane.showInputDialog("insira um numero(string) ");
        String string2 = JOptionPane.showInputDialog("insira outro numero(string) ");
        int resultado;
        //o return n printa o resultado sendo assim é necessario a criação de uma variavel para demonstrar o valor calculado no momento de demonstrar no terminal no caso uso do int resultado;.
        //
        if (opcao == 1){
            resultado = mini.soma(numero1,numero2);
        }
        else if (opcao == 2){
            resultado = mini.subtracao(numero1,numero2);
        }
        else if (opcao == 3){
            resultado = mini.multiplicacao(numero1, numero2);
        }
        else{
            resultado = mini.divisao(numero1,numero2);
        }
        JOptionPane.showMessageDialog(null,"Resultado " + resultado);
    }   
}
