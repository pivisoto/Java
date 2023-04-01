import java.util.Scanner;
public class TesteLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println("lista criada");
        System.out.println(lista);
        for (int i = 2; i <= 10; i += 2) {
            lista.insereInicio(i);
        }
        System.out.println("lista depois das insercoes de inicio");
        System.out.println(lista);

        for (int i = 1; i < 10; i += 2) {
            lista.insereFim(i);
        }
        System.out.println("lista depois das insercoes de fim");
        System.out.println(lista);

        if (!lista.isEmpty()) {
            System.out.println(lista.removeInicio() + " foi removido do inicio");
            System.out.println("lista depois da remocao de inicio");
            System.out.println(lista);
        }
        if (!lista.isEmpty()) {
            System.out.println(lista.removeFim() + " foi removido do fim");
            System.out.println("lista depois da remocao de fim");
            System.out.println(lista);
        }
        if(!lista.isEmpty()){
            System.out.println(lista.tamanhoLista() + "esse eh o tamanho da lista");
        }
        if(!lista.isEmpty()){
            Scanner ler = new Scanner(System.in);
            System.out.println("digite a posição");
            int pos = ler.nextInt();
            System.out.println("digite o valor que deve entrar");
            int valor = ler.nextInt();
            lista.inserenaPosicao(pos, valor);
        }
    }

}
