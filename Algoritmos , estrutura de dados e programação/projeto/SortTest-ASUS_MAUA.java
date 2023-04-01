import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class SortTest {
    public static void main(String[] args) {
        ArrayList<Long> a = new ArrayList<>();
        int tamanho_vetor = 80000;  
        int numero_testes = 100 ; 
        for(int i = 0; i<numero_testes; i++){
            int[] v = new int[tamanho_vetor];
            SortAlgorithms.geraVetor(v);
            // SortAlgorithms.exibeVetor(v);
            Instant start = Instant.now();
            v = SortAlgorithms.insertionSort(v);
            //v = SortAlgorithms.selectionSort(v);
            //v = SortAlgorithms.bubbleSort(v);
            // SortAlgorithms.exibeVetor(v);
            Duration duracao = Duration.between(start, Instant.now());
            a.add(duracao.toMillis()); 
            System.out.print(i + " ");
        }
        int soma = 0;
        for(int p = 0; p<a.size(); p++){
            soma += a.get(p);
        }
        System.out.println("\nA média do tempo que o algoritmo leva para ordenar a lista é: " + soma/a.size() + " milisegundos");
    }
}
  