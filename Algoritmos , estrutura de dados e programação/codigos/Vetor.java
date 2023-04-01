import java.util.Scanner;
import java.util.Random;
public class Vetor{
    //preenchimento do vetor em numero random
    static void geraVetor (int[] v){
        Random r = new Random();
        for (int i = 0; i <v.length; i++){
            v[i] = r.nextInt(v.length);
        }
    }
    //exibe o vetor na tela
    static void exibeVetor(int v[]){
        for (int i = 0; i < v.length;i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    static void bubbleSort(int v[]){
	for (int i = 1; i < v.length; i++){
	     for (int j = 0; j < v.length - i; j++){
	        if(v[j] > v[j +1]){
	 	        int temp = v[j];
		        v[j] = v [j +1];
		        v[j + 1] = temp;
            }
        }
    }
}
    public static void main(String[] args){
        int n;
        Scanner ler = new Scanner(System.in);
        System.out.println("digite o tamanho do vetor: ");
        n = ler.nextInt();
        int[] v = new int[n];
        geraVetor(v);
        exibeVetor(v);
        bubbleSort(v);     
        ler.close();
    }
}