public class Carro {
    private String cor;
    private String aro_Roda;
    public Carro(){}
    public Carro(String x,String y){
        this.aro_Roda = x;
        this.cor = y;
    }
    void getAro_e_Cor(){
        System.out.printf("o aro da roda é %s , e o modelo do carro é %s ", aro_Roda , cor);
    }
}
