import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class TesteConexao {
    public static void main(String[] args) {
        try {
            Connection conexao = DriverManager.getConnection(
                    // essa é a conhecida string de conexão
                    "jdbc:mysql://localhost:3306/teste", "root", "mysqlimt");
            if (conexao != null) {
                System.out.println("Conexão estabelecida com sucesso!");
                String nome = JOptionPane.showInputDialog("Qual o nome?");
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade?"));
                // o comando a ser executado é uma simples string
                // os símbolos ? reservam o lugar de valores a serem especificados
                String sql = "INSERT INTO tb_pessoa (nome, idade) VALUES (?, ?)";
                // uma estrutura que representa o comando é "preparada". Assim, ele pode ser
                // executado diversas vezes com dados diferentes
                PreparedStatement ps = conexao.prepareStatement(sql);
                // configuramos os valores a serem inseridos
                ps.setString(1, nome);
                ps.setInt(2, idade);
                // executamos o comando
                ps.execute();
                // fechamos a conexão para que o MySQL Server possa liberar recursos
                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                sql = ("UPDATE tb_pessoa SET idade = ? Where nome = ?");
                nome = JOptionPane.showInputDialog("qual o nome?");
                idade = Integer.parseInt(JOptionPane.showInputDialog("qual a idade?"));
                PreparedStatement ps2 = conexao.prepareStatement(sql);
                ps2.setInt(1, idade);
                ps2.setString(2,nome);
                ps2.execute();
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
                conexao.close();
            } else {
                System.out.println("Conexão não estabelecida!");
            }
        } catch (Exception e) {
            System.out.println("Exceção: " + e.getMessage());
        }
    }
}