public class Pessoa{
    private String nome;
    private int idade;
    public String getNome(){
        return nome;
    }
    public void setNome(String novo_nome){
        this.nome = novo_nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int nova_idade){
        this.idade = nova_idade;
    }
    public Pessoa(String nome, int idade){
        System.out.println("Construindo Pessoa....");
        setNome(nome);
        setIdade(idade);
    }
}