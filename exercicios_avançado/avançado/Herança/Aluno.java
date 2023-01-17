public class Aluno extends Pessoa {
    //atributos encapsulados
    private String ra;
    //construtores sobrecarregados
    public Aluno(String nome , String ra) {
        super(nome);
        this.setRa(ra);
    }
    public Aluno (int idade, String nome , String ra) {
        super(idade , nome);
        this.setRa(ra);
    }
    public Aluno (String ra){
        this.setRa(ra);
    }
    //modificadores
    public void setRa(String ra){
        this.ra = ra;
    }
    //metodos de acesso
    public String getRa() {
        return this.ra;
    }
}