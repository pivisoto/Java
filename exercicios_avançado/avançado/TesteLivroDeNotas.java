public class TesteLivroDeNotas{
    public static void main(String args[]){
        LivroDeNotas meuLivro = new LivroDeNotas();

        LivroDeNotas outroLivro;
        outroLivro = new LivroDeNotas();

        meuLivro.exibirMensagem("bem vindo ao meu livro de notas");

        outroLivro.exibirMensagem("bem vindo ao outro livro de notas");

        meuLivro.atribuiNomeDoCurso("Cic");
        System.out.println(meuLivro.acessaNomeDoCurso());
        System.out.println(outroLivro.acessaNomeDoCurso());
    }
}