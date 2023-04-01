import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class SortTest {
    public static void main(String[] args) {
        ArrayList<Long> a = new ArrayList<>();
        int tamanho_vetor = 40000;
        int numero_testes = 100;
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
/*
 bubble 
  2.560.000 notebook = 10752406 milissegundos
  1.280.000 notebook = 3440936 milisegundos
  640.000 notebook = 769271 milisegundos
  320.000 notebook = 167227 milissegundos
  160.000 notebook = 40772 milissegundos
  80.000 notebook = 10090 milissegundos
  40.000 notebook = 2534 milissegundos
  
insertion
  2.560.000 notebook = 3440936 milisegundos
  1.280.000 notebook =  510385 milisegundos
  640.000 notebook = 117202 milisegundos
  320.000 notebook = 
  160.000 notebook = 
  80.000 notebook = 
  40.000 notebook = 
  
selection
  2.560.000 notebook = 3876766 milisegundos
  1.280.000 notebook = 1245790 milisegundos
  640.000 notebook = 160766 milisegundos
  320.000 notebook = 44257 milisegundos
  160.000 notebook = 7840 milisegundos
  80.000 notebook = 2044 milisegundos
  40.000 notebook =  518 milisegundos
 */