public class TesteIngresso {
    public static void main(String args[]){
        Vip ingresso1 = new Vip();
        Ingresso ingresso2 = new Ingresso();
        ingresso1.setValor(50.00,100.00);
        ingresso1.setNumero(10);
        ingresso1.setIngresso("vip");
        ingresso2.setValor(100.00);
        ingresso2.setNumero(2);
        ingresso2.setIngresso("camarote inferior");
        ingresso1.getNumero();
        ingresso1.getNumero();
        ingresso1.getIngresso();
        ingresso2.getNumero();
        ingresso2.getNumero();
        ingresso2.getIngresso();
    }
}
