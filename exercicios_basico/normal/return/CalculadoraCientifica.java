import java.lang.Math;
public class CalculadoraCientifica {
    public double raiz (int a) {
        return Math.sqrt(a);
    }
    public double raiz (double a){
        return Math.sqrt(a);
    }
    public double raiz (String a){
        Double dA = Double.parseDouble(a);
        return Math.sqrt(dA);
    }
    public double potencia (byte a , byte b){
        return Math.pow(a , b);
    }
    public double potencia (String s1 , String s2){
        Double s3 = Double.parseDouble(s1);
        Double s4 = Double.parseDouble(s2);
        return Math.pow(s3 , s4);
    }
    public double potencia (int a , double b){
         return Math.pow(a , b);
    }
}
