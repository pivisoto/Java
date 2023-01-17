public class PetShop {
    public static void main(String[] args){
        Animal a = new Animal("fofo");
        Cachorro c = new Cachorro("toto");
        Gato g = new Gato("bichano");

        System.out.println("animal: " + a);
        a.fazBarulho();
        System.out.println("gato: " + g);
        g.fazBarulho();
        System.out.println("cachorro: " + c);
        c.fazBarulho();

        Animal[] agenda = new Animal[8];

        for (int i=0; i<4; i++) {
            agenda[i] = new Gato("gato" + i);
        }
        for (int i=4; i<8; i++){
            agenda[i] = new Cachorro("dog" + i);
        }
        for (int i=0; i<8; i++){
            System.out.println(agenda[i]);
        }
    }
}