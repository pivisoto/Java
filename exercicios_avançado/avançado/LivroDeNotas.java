public class LivroDeNotas{
   //variaveis de classe

   //variaveis de objeto + atributos
    private String nomeDoCurso;
   //construtores
    public LivroDeNotas (String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }
   //refazer o construtor padrão
   public LivroDeNotas() {
       this.nomeDoCurso = "CHUPA FEI";
    }
   //metodos especificos
   public void exibirMensagem(String msg){
       System.out.println(msg);
    }
   //getters / setters

   public void atribuiNomeDoCurso(String nomeDoCurso){
       this.nomeDoCurso = nomeDoCurso;
    }
   public String getNomeDoCurso (){
       return nomeDoCurso;
    }
}