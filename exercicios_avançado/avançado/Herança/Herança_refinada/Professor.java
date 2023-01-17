public class Professor extends Pessoa{
    int matricula;
    public void lecionar(){
        System.out.println(getNome() + "lecionando...");
    }
    public Professor(String nome,int idade){
        super(nome,idade);
    }
}
