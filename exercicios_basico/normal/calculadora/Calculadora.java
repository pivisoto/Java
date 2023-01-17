import java.util.Scanner;
public class Calculadora{
  public int soma(int a , int b){
    int resultado = a + b;
    return resultado;
  }
  public int soma (int a , int b , int c){
      return a + b + c;
  }
  public double soma (double a, double b){
      return a + b;
  }
  public double soma (String sA , String sB){
      double dA = Double.parseDouble(sA);
      double dB = Double.parseDouble(sB);
      return dA + dB;
      //sem double dA e sem o double dB - outra opcao - return Double.parseDouble(sA) + Double.parseDouble(sB);
  }
  public double soma (int iA , double dB2 , String sC){
      return iA + dB2 + Double.parseDouble(sC);
  }
  public int subtracao (int a , int b){
    return a - b;
  }
  public int multiplicacao (int a , int b){
    return a * b;
  }
  public int divisao (int a , int b){
    return a / b ;
  }
}
