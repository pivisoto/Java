class Main {
    public static void main(String[] args){
        int i = 1;
        int ac = 1;
        do{
            ac *= i++;
        }while (i <= 5);
        System.out.println(ac);
        //ac = 1 * 2
        //ac = 2 * 3
        //ac = 6 * 4
        //ac = 24 * 5
    }
}   

