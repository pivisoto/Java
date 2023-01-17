

public class Jogo {
    public static void main(String args[]) throws InterruptedException{
        Personagem player1 = new Personagem("player2",10, 0, 0);
        Personagem player2 = new Personagem("player1",2, 6, 4);
        Personagem player3 = new Personagem("player3",2,5,6);
        while (true){
            player1.jogar();
            player2.jogar();
            player3.jogar();      
            System.out.println("\n====================");
            Thread.sleep(2000);
        }
    }
}
