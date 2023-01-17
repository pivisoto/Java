import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    public static void main(String[] args){
        //criação de um objeto do tipo LivroDeNotas nesse caso livro
        String curso1 = JOptionPane.showInputDialog("insira o nome do curso");
        String curso2 = JOptionPane.showInputDialog("insira o nome do curso");
        //uso dos metodos
        LivroDeNotas livro = new LivroDeNotas(curso1,curso2);
        LivroDeNotas livro2 = new LivroDeNotas();
        livro.exibirMensagem();
        livro2.exibirMensagem();   
    }
}
