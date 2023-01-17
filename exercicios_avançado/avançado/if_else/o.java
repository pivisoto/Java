import java.util.Scanner;

public class o {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        int DDD = ler.nextInt();
        if (DDD == 61){
            System.out.print("Brasilia");
        }
        else if (DDD == 71){
            System.out.print("Salvador");
        }
        else if (DDD == 11){
            System.out.print("Sao Paulo");
        }
        else if (DDD == 21){
            System.out.print("Rio de Janeiro");
        }
        else if (DDD == 32){
            System.out.print("Juiz de Fora");
        }
        else if (DDD == 19){
            System.out.print("Campinas");
        }
        else if (DDD == 27){
            System.out.print("Vitoria");
        }
        else if (DDD == 31){
            System.out.print("Belo Horizonte");
        }
        else{
            System.out.print("DDD nao cadastrado");
        }
        ler.close();
    }    
}
