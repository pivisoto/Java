import javax.swing.JOptionPane;

public class Password{
    public static void main(String args[]){
        String senha = JOptionPane.showInputDialog("digite sua senha");
        if (senha.length() == 4 ) {
           if (senha.charAt(0) == 'a' || senha.charAt(0) == 'A'){
               boolean contemImpar = false; 
               for (int posicao=1; posicao < senha.length() && !contemImpar; posicao++) {
                   int numero = Integer.parseInt(senha.substring(posicao, posicao+1));
                   if (numero % 2 == 1) {
                       contemImpar = true;                
                   }
               }
                if (contemImpar) { 
                       JOptionPane.showMessageDialog(null , "Bem-Vindo", "senha valida" , 
                       JOptionPane.INFORMATION_MESSAGE) ;
 
                }
                else{ 
                    JOptionPane.showMessageDialog(null, "nao contem impares" , "senha invalida" , JOptionPane.WARNING_MESSAGE) ;   
                }
           }
           else{ 
               JOptionPane.showMessageDialog(null, "primeiro caracter diferente de a", "senha invalida", JOptionPane.WARNING_MESSAGE);
           }
        }
        else{
            JOptionPane.showMessageDialog(null, "tamanho nao e 4", "senha invalida",JOptionPane.WARNING_MESSAGE);
        }
    }
}