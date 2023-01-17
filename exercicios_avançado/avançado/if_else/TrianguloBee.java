import java.util.Scanner;

public class TrianguloBee {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        double a = ler.nextDouble();
        double b = ler.nextDouble();
        double c = ler.nextDouble();
        double aa = Math.max(a, Math.max(b, c));
        double bb = 0;
        double cc = 0;
        /////////////
        if (aa == a){
            bb = Math.max(b,c);
            cc = Math.min(b,c);
        }
        if (aa == b) {
            bb = Math.max(a,c);
            cc = Math.min(a,c);
        }
        if (aa == c){
            bb = Math.max(b,a);
            cc = Math.min(b,a);
        }
        if (aa >= (bb + cc)) {
            System.out.print("NAO FORMA TRIANGULO\n");
        }else if (aa * aa > ((bb * bb) + (cc * cc))){
            System.out.print("TRIANGULO OBTUSANGULO\n");
        }
        if (aa * aa == ((bb * bb) + (cc * cc))){
            System.out.print("TRIANGULO RETANGULO\n");        
        }
        if (aa * aa < ((bb * bb) + (cc * cc))){
            System.out.print("TRIANGULO ACUTANGULO\n");
        }
        if ((aa == bb) && (aa == cc)){
            System.out.print("TRIANGULO EQUILATERO\n");
        }
        if(((aa == bb) && (aa != cc)) || ((aa == cc) && (aa != bb)) || ((bb == cc) && (bb != aa))){
            System.out.print("TRIANGULO ISOSCELES\n");
        }
        ler.close();
    }
}
