

//nome da classe
public class LivroDeNotas{
    public String nomeDoCurso = "banana";
    public String nomeDoCurso2 = "chinelo";
    //metodo
    public LivroDeNotas(String x ,String y){
        this.nomeDoCurso = x;
        this.nomeDoCurso2 = y;
    }
    public LivroDeNotas(){
    }
    public void exibirMensagem(){
        System.out.printf("Bem-vindo ao livro de notas do curso %s, e ao livro de notas do curso %s ",nomeDoCurso,nomeDoCurso2);
    }
    public void setNomeDoCurso1(String x,String y){
        this.nomeDoCurso = nomeDoCurso;
    }
    public String getNomeDoCurso(){
        return nomeDoCurso;
    }
}