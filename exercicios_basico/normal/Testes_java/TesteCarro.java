public class TesteCarro {
    public static void main(String[] args){
        String cor1 = "polo senta na marcha";
        String aro1 = "18";
        String cor2 = "ds3 motel";
        String aro2 = "17";
        Carro volkswagen = new Carro(aro1,cor1);
        Carro citroen = new Carro(aro2,cor2);
        volkswagen.getAro_e_Cor();
        citroen.getAro_e_Cor();
    }
}
