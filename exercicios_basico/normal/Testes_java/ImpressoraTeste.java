public class ImpressoraTeste {
    public static void main(String args[]){
        Impressora seiLa = new Impressora();
        float f1= 101.10f;
        float f2= 23.23f;
        String s1 = "10";
        String s2 = "2";
        String s3 = "33";
        int i1 = 20;
        int i2 = 40;
        seiLa.exibir(f1);
        seiLa.exibir(f1,f2);
        seiLa.exibir(s1,f1);
        seiLa.exibir(s1, s2, s3);
        seiLa.exibir(i1, i2 , s1);
    }
}
