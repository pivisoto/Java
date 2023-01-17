import javax.swing.JOptionPane;

public class Comissao {
    public static void main(String arcs[]) {
        //declararvariaveis
        int quantidadePecas;
        double valorUnitarioPeca, comissao;
        //entrada de dados = leitura = pede para o usuario
        quantidadePecas = Integer.parseInt(JOptionPane.showInputDialog
        ("quantas pecas voce vendeu?"));
        valorUnitarioPeca = Double.parseDouble(JOptionPane.showInputDialog("digite o valor unitario da peca"));
        //processamento
        comissao = 5.0/100 * quantidadePecas * valorUnitarioPeca;
        //saída = exibir os resultados obtidos
        JOptionPane.showMessageDialog(null,comissao + "R$");
    }
}