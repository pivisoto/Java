import java.util.Scanner;
public class TestePonto {
    public static void main (String args[]){
        Ponto pontopadrao = new Ponto();
        Ponto pontonovo = new Ponto(10 , 5);
        Scanner leitor = new Scanner(System.in);
        double dX = leitor.nextDouble();
        double dY = leitor.nextDouble();
        pontonovo.desloca(dX, dY);
        //b)
        System.out.println(pontopadrao);
        System.out.println(pontonovo);
        //c)
        System.out.println ("(" + pontonovo.getX() + "," + pontonovo.getY() + ")");
        leitor.close();
        //d)sim , por meio da implementação de um novo metodo seria possivel chamar cada variavel de cada vez exemplo : (double dX) { this.setX(x+dX) } e mesmo vale com a variavel y
    }
}

