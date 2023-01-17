public class Impressora {
    public void exibir(float x){
        System.out.println(x);
    }
    public void exibir (float x , float y){
        System.out.println(x + "," + y);
    }
    public void exibir (float x , String y){
        System.out.println(x + "," + y);
    }
    public void exibir(String x , float y){
        System.out.println(x + "," + y);
    }
    public void exibir(String x , String y , String z){
        System.out.println(x + "," + y + "," + z);
    }
    public void exibir(int x,int y , String z){
        System.out.println(x + "," + y + "," + z);
    }
    //parte 2
    public void potencia_int(int x , int y){
        int elevado = (int)Math.pow(x,y);
        System.out.printf("valor de %s elevado a %s é = %s\n",x,y,elevado);
    }
    public void potencia_float(float x , float y){
        float elevado = (float)Math.pow(x,y);
        System.out.printf("valor de %s elevado a %s é = %s\n",x,y,elevado);
    }
    public void radiciacao_int(int x){
        int x_raiz = (int)Math.sqrt(x);
        System.out.printf("valor da raiz quadrada de %s é = %s\n",x,x_raiz);
    }
    public void radiciacao_float(float x){
        float x_raiz = (float)Math.sqrt(x);
        System.out.printf("valor da raiz de %s é = %s\n",x,x_raiz);
    }
    public void radiciacao_double(double x){
        double x_raiz = (double)Math.sqrt(x);
        System.out.printf("valor da raiz de %s é = %s\n",x,x_raiz);
    }
    public double radiciacao_String(String x){
        double x_double = Double.parseDouble(x);
        double x_raiz = Math.sqrt(x_double);
        System.out.printf("valor da raiz de %s é = %s\n",x,x_raiz);
        return x_raiz;
    }
    public byte radiciacao_byte(byte x){
        byte x_raiz = (byte)Math.sqrt(x);
        System.out.printf("valor da raiz de %s é = %s\n",x,x_raiz);
        return x;
    }
    //math pow e sqrt so podem se usadas em double a menos que exista a utilização do  parenteses e identificação do parametro antes dentor de um paranteses;
}
