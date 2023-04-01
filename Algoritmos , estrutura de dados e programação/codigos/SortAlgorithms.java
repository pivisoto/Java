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
    static void bubbleSort (int[] lista) {
        for (int i=1; i<lista.length; i++) {
            for (int j=0; j < lista.length-i; j++  ) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }
    // public static int[] selectionSort(int[] lista){
    //     int maxNumber = 0;
    //     for(int i=0; i<lista.length; i++){

    //     }
    // }
}
