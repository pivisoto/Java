public class Pessoa { 

    private int idade; 

    private String nome; 

 
 

    public Pessoa() {} 

    public Pessoa(String nome) { 

        this.setNome(nome); 

    } 

    public Pessoa(int idade, String nome) { 

        this(nome); 

        this.setIdade(idade); 

    } 

 
 

    public void setIdade(int idade) { 

        this.idade = idade; 

    } 

    public void setNome(String nome) { 

        this.nome = nome; 

    } 

 
 

    public int getIdade() { 

        return this.idade; 

    } 

    public String getNome() { 

        return this.nome; 

    } 

    @Override 

    public String toString () { 

        return "nome: " + this.nome + "\nidade: " + this.idade; 

    } 

} 

 