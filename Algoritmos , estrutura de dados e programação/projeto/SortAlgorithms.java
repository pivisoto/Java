import java.util.Random;

public class SortAlgorithms {

    public static int[] insertionSort(int[] lista) {
        for(int i = 0; i < lista.length; i++){
            if(i != 0)
                for(int j = i; j >= 0; j--){
                    if(j != 0 && lista[j]<lista[j-1]){
                        int aux = lista[j];
                        lista[j] = lista[j-1];
                        lista[j-1] = aux;
                    } else { 
                        j = 0;
                    }
                }
            }
        return lista;
    }
    public static int[] bubbleSort (int[] lista) {
        for (int i=1; i<lista.length; i++) {
            for (int j=0; j < lista.length-i; j++  ) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
        return lista;
    }
    public static int[] selectionSort(int[] lista){
        int minNumber = 0;
        int minNumberIndex = 0;
        for(int i=0; i<lista.length; i++){
            for(int j = i; j<lista.length; j++){
                if(j == i) {
                    minNumber = lista[j];
                } else if(lista[j] < minNumber) {
                    minNumber = lista[j];
                    minNumberIndex = j;
                }
            }
            if(lista[i] != minNumber){
                int temp = lista[i];
                lista[i] = minNumber;
                lista[minNumberIndex] = temp;
            }
        }
        return lista;
        }
        static void geraVetor (int[] v){
            Random r = new Random();
            //preenchimento do vetor em numero random
            for (int i = 0; i <v.length; i++){
                v[i] = r.nextInt(v.length);
            }
        }
        static void exibeVetor(int v[]){
            //mostra o vetor na tela
            for (int i = 0; i< v.length; i++ ){
                System.out.print(v[i] + " ");
            }
            System.out.println();
        }
}
