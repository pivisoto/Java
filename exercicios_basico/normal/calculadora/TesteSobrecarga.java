public class TesteSobrecarga{
    public static void main(String args[]){
        int x = 2 , y = 5 , z = 6;
        double d1 = 0.48 , d2 = 0.21;
        Calculadora calculadora2 = new Calculadora ();
        System.out.println("Soma de dois " + calculadora2.soma(x,y));
        System.out.println("Soma de tres " + calculadora2.soma(x,y,z));
        
        System.out.println("soma " + calculadora2.soma(d1 , d2));

        System.out.println("soma das strings: " + calculadora2.soma("123" , "456.9"));
    }
}