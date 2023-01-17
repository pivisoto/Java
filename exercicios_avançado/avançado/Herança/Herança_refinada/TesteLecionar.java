public class TesteLecionar {
    public static void main (String[] aStrings){
        String nome1 = "José";
        int idade1 = 18;
        String nome2 = "Claudio";
        int idade2 = 35;
        ProfessorHorista profHorista = new ProfessorHorista(nome1,idade1);
        ProfessorPesquisador profPesq = new ProfessorPesquisador(nome2,idade2);
        profPesq.lecionar();
        profHorista.lecionar();
    }
}
