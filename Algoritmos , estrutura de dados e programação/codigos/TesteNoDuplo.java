public class TesteNoDuplo {
    public static void main (String args[]){
        NoDuplo no1 = new NoDuplo(10);
        NoDuplo no2 = new NoDuplo(20);

        System.out.println("no1:" + no1);
        System.out.println("no2" + no2);

        no1.setProximo(no2);
        no2.setAnterior(no2);

        System.out.println("prox de no1" + no1);
        System.out.println("anterior de no2" + no2.getAnterior());
    }
}
