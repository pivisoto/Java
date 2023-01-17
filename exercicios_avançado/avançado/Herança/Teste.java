public class Teste {
    public static void main (String [] args){
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("Gil", "22=234");
        Aluno aluno3 = new Aluno(21 , "Ana" , "22-023");
        Aluno aluno4 = new Aluno("22-567");

        System.out.println("aluno 1: " + aluno1.getNome() + aluno1.getIdade() + "\n" aluno1.getRa());
    }
}