import javax.swing.JOptionPane;

public class TesteCarro { 

    public static void main (String[] args) { 

        Carro carro1 = new Carro("Fit"); 

        System.out.println("carro 1:\nano:" + carro1.getAnoFabricacao() + "\nmodelo:" + carro1.getModelo() + "\ncor:" + carro1.getColor()); 

 
 

        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do " + carro1.getModelo())); 

        carro1.setAnoFabricacao(ano); 

 
 

        String cor = JOptionPane.showInputDialog("digite a cor do" + carro1.getModelo()); 

        carro1.setCor(cor); 

        System.out.println("carro 1 com as informacoes alteradas:\nano:" + carro1.getAnoFabricacao() + "\nmodelo:" + carro1.getModelo() + "\ncor:" + carro1.getColor()); 

    } 

} 

 