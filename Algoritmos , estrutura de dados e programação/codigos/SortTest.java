import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class SortTest {
    public static void main(String[] args) {
        ArrayList<Long> a = new ArrayList<>();
        int tamanho_vetor = 10;
        int numero_testes = 1;
        for(int i = 0; i<numero_testes; i++){
            int[] v = new int[tamanho_vetor];
            Teste.geraVetor(v);
            Teste.exibeVetor(v);
            Instant start = Instant.now();
            // v = SortAlgorithms.insertionsort(v);
            // v = SortAlgorithms.selectionsort(v);
            SortAlgorithms.bubbleSort(v);
            Duration duracao = Duration.between(start, Instant.now());
            a.add(duracao.toMillis());
            // System.out.print(i);
            Teste.exibeVetor(v);
        }
        int soma = 0;
        for(int p = 0; p<a.size(); p++){
            soma += a.get(p);
        }
        System.out.println("\n" + soma/a.size() + "milisegundos");
    }
}
