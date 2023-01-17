public class TesteCalculadora {
    public static void main (String args[]){
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        int a = 25;
        double a2 = 100;
        String sA = "16";
        byte a4 = 6;
        int a5 = 10;
        byte b1 = 1;
        String s2 = "2";
        double b2 = 4;
        String s1 = "10";
        System.out.println(calculadora.raiz(a));
        System.out.println(calculadora.raiz(a2));
        System.out.println(calculadora.raiz(sA));
        System.out.println(calculadora.potencia(a4 , b1));
        System.out.println(calculadora.potencia(s1 , s2));
        System.out.println(calculadora.potencia(a5 , b2));
    }
}
