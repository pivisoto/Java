public class Personagem {
    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    
    public Personagem(int sn,int fm, int ener){
        if(sn >= 0 && sn <= 10){
            this.sono = sn;
        }
        if(fm >= 0 && fm <= 10){
            this.fome = fm;
        }
        if(ener >= 0 && ener <= 10){
            this.energia = ener;
        }
    }
    public Personagem(String nome, int energia, int fome,int sono){
        this(energia,fome,sono);
        this.nome = nome;
    }
    void jogar(){
        if(energia >= 2){
        System.out.println(nome + " cacando");
        exibirValores();
        }
        else{
            System.out.println(nome + " sem energia para cacar ");
            exibirValores();
        }
        fome = Math.min(fome + 1,10);
        sono = Math.min(sono + 1,10);

        if(fome>=1){
            System.out.println(nome + " comendo ");
            exibirValores();
            energia = Math.min(energia + 1,10);
            fome -= 1;
        }
        else{
            System.out.println(nome + " sem fome");
            exibirValores();
        }
        if(sono >= 1){
            System.out.println(nome + " dormindo");
            exibirValores();
            sono -= 1;
            energia = energia + 1 <10? energia + 1 : 10;
        }
        else{
            System.out.println(nome + " sem sono ");
            exibirValores();
        }
    }
    void exibirValores(){
        System.out.printf("energia = %s , fome = %s , sono = %s ",energia,fome,sono );
    }    
}