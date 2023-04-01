// import java.util.Scanner;
// import java.util.Random;
// import java.util.Date;

// public class TesteVetores {
//     static void geraVetor(int[] v){
//     Random random = new Random();
//     for (int i=0; i<v.length; i++)
//         v[i] = random.nextInt(100);
//     }
//     static void bubbleSort(int[] v){
//         for (int i=1; i<v.length; i++) {
//             for (int j=0; j<v.length - 1; j++){
//                 if (v[j] > v[j+1]){
//                     int temp = v [j];
//                     v[j] = v [j+1];
//                     v [j+1] = temp;
//                 }
//             }
//         }
//     }

//     static void exibeVetor (String msg, int[] v){
//         System.out.println("\n"+ msg);
//         for (int i=0; i<v.length; i++)
//             System.out.print(v[i] + " ");
//         System.out.println();
//     }
//     public static void main (String[] args){
//         Scanner ler = new Scanner(System.in);
//         int n;
//         int[] v;
//         do{
//             System.out.println("digite o tamanho do vetor\n");
//             n = ler.nextInt();
//             if(n > 0){
//                 v = new int[n];
//                 geraVetor(v);
//                 exibeVetor("vetor gerado randomicamente", v);
//                 long inicio = new Date().getTime();
//                 bubbleSort(v);
//                 long fim = new Date().getTime();
//                 exibeVetor("vetor ordenado pelo bubble",v);
//                 System.out.println("\ntempo do bublle: " + (fim - inicio) + " milisegundos\n");
//             }
//         }while(n > 0);
//         ler.close();
//     }
// }



// https://dontpad.com/ed_maua

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class TesteVetores {

    static void geraVetor (int[] v) {
        Random random = new Random();
        for (int i=0; i < v.length; i++)
            v[i] = random.nextInt(10*v.length);
    }
    static void exibeVetor (String msg, int[] v) {
        System.out.println("\n" +  msg);
        for (int i=0; i < v.length; i++) 
            System.out.print(v[i] + " ");
        System.out.println();
    }
    static void bubbleSort (int[] v) {
        for (int i=1; i<v.length; i++) {
            for (int j=0; j < v.length-i; j++  ) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }
    static int[] buscaSimples (int x, int[] v){
        int[] result = new int[2];
        result[1] = 0; //contador 
        for (int i=0; i<v.length; i++){
            result[1]++;
            if(x == v[i]){
                result[0] =i;
                return result;
            }
        }result[0] = -1;
        return result;
    }
    static int[] buscaBinaria (int x, int[] v){
        int ini = 0, fim = v.length - 1;
        int[] result = new int[2];
        result[1] = 0; //contador
        while(ini <= fim){
            result[1]++;
            int meio = (ini + fim) /2;
            if(x == v[meio]){
                result[0] = meio;
                return result;
            }
            if(x > v[meio])
                ini = meio + 1;
            else
                fim = meio - 1;
        }
        result[0] = -1;
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] v;
        do {
            System.out.print("\ndigite o tamanho do vetor: ");
            n = scanner.nextInt();
            if (n>0) {
                v = new int[n];
                geraVetor (v);
                exibeVetor ("vetor gerado randomicamente", v);
                System.out.print("\n digite o valor para busca: ");
                int x = scanner.nextInt();
                int[] result = buscaSimples(x, v);
                if (result[0] == -1) 
                    System.out.println(x + " não encontrado pela busca simples");
                else
                    System.out.println(x + " valor foi encontrado com a busca simples na posição" + result[0]);
                System.out.println("foram realizadas" + result[1] + "iterações");
                long inicio = new Date().getTime();
                bubbleSort(v);
                long fim = new Date().getTime();
                exibeVetor("vetor ordenado pelo bubble", v);
                System.out.println("\ntempo do bubble: " +  (fim-inicio) +  " milissegundos");
                result = buscaBinaria(x, v);
                if(result[0] == -1)
                    System.out.println(x + " não encontrado pela busca binaria");
                else
                    System.out.println(x + " valor foi encontrado com a busca binaria na posicao " + result[0]);
                System.out.println("foram realizadas" + result[1] + "iterações");
            }
        } while (n>0);
        scanner.close();
    }
}