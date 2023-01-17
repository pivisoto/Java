public class TestePonto {
    public static void main(String args[]){
        Ponto ponto_Vazio = new Ponto();
        Ponto ponto_String = new Ponto("1","2");
        Ponto ponto_ponto = new Ponto(ponto_Vazio);
        ponto_Vazio.setX(1);
        ponto_Vazio.setY(2);
        System.out.println(ponto_Vazio);
        ponto_Vazio.desloca(1, 2);
        System.out.println(ponto_Vazio);
        ponto_Vazio.toString();
        System.out.println(ponto_Vazio);
        ponto_String.setX("1");
        ponto_String.setY("2");
        System.out.println(ponto_String);
        ponto_String.desloca("1", "2");
        System.out.println(ponto_String);
        System.out.println(ponto_ponto);
    }
}
