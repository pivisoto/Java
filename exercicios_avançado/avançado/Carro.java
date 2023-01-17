public class Carro { 

    //atributos = variáveis de instância 

    private int anoFabricacao; 

    private String modelo; 

    private String cor; 

 
 

    //construtores: com sobrecarga 

    public Carro (int anoFabricacao, String modelo, String cor) { 

        this.anoFabricacao = anoFabricacao; 

        this.modelo = modelo; 

        this.cor = cor; 

 
 

    } 

    public Carro (int anoFabricacao, String modelo) { 

        this.anoFabricacao = anoFabricacao; 

        this.modelo = modelo; 

    } 

    public Carro (int anoFabricacao) { 

        this.anoFabricacao = anoFabricacao; 

    } 

    public Carro (String modelo) { 

        this.modelo = modelo; 

    } 

 
 

    public int getAnoFabricacao() { 

        return anoFabricacao; 

    } 

    public String getModelo() { 

        return modelo; 

    } 

 
 

    public String getCor() { 

        return cor; 

    } 

 
 

    public void setAnoFabricacao (int anoFabricacao){ 

        this.anoFabricacao = anoFabricacao; 

    } 

    public void setModelo (String modelo){ 

        this.modelo = modelo; 

    } 

    public void setCor (String cor) { 

        this.cor = cor; 

    } 

} 

 