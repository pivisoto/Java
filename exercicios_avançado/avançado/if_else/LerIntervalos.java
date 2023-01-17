import java.util.Scanner;

public class LerIntervalos {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        float valor = ler.nextFloat();
        if(0 <= valor && valor <= 25.00000){
            System.out.println("Intervalo [0,25]");
        }
        else if(25.00001 <= valor && valor <= 50.00000){
            System.out.println("Intervalo (25,50]");
        }
        else if(50.00001 <= valor && valor <= 75.00000){
            System.out.println("Intervalo (50,75]");
        }
        else if(75.00001 <= valor && valor <= 100.00000){
            System.out.println("Intervalo (75,100]");
        }
        else{
            System.out.println("Fora do intervalo");
        }
        ler.close();
    }
}