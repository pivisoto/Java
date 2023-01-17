public class Calculadora {
    public int soma (int a , int b){
        int resultado;
        resultado = a + b;
        return resultado;
    }
    public int soma (int a, int b, int c){
        return a + b + c;
    }
    public int subtracao (int a , int b){
        return a - b;
    }
    public int multiplicacao (int a , int b){
        return a * b;
    }
    public int divisao(int a,int b){
        return a / b; 
    }
//  public void divisao(int a,int b){
//      return a/b  
//  }
// error: metodo void nao pode retornar um valor , para usar o return é necessario definir o tipo da variavel apos o public.
    public float soma(float a , float b){
        return a + b;
    }
    public float subtracao(float a , float b){
        return a - b;
    }
    public float multiplicacao(float a , float b){
        return a * b;
    } 
    public float divisao(float a,float b){
        return a / b;
    }
    public int soma(String x,String y){
        int x_int = Integer.parseInt(x);
        int y_int = Integer.parseInt(y);
        //tornar uma string em um valor inteiro , atenção para usar o return de um valor int use public int nome();
        return x_int + y_int;
    }
    //mesmo parametros porem ordem diferentes o compilador os enxerga como diferentes.
    public int soma (String a, int b) {
        return Integer.parseInt(a) + b;
    }
    public int soma (int a, String b) {
        return a + Integer.parseInt(b);
    }
    //podem existir metodos com nomes iguais graças a sobrecarga de metodos,oque irar diferenciar qual deles sera usado sao os tipos de variaveis ou parametros conhecidos como (int,string,float)
    //não é possivel existir metodos com o mesmo nome e mesmo tipo de variaveis exemplo:
    //public int soma (int a , int b){}
    //public int soma (int x , int y){}
    //isso não é possivel mesmo utilizando nome diferente para as variaveis.
}
