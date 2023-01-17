public class Ponto {
    // os atributos de um ponto são suas coordenadas
    private double x;
    private double y;
    //construtores
    public Ponto(){}
    //a)
    public Ponto (double x , double y) {
        this.x = x;
        this.y = y;
    }
    //modificadores
    public void setX (double x) { 
    this.x = x; 
    }
    public void setY (double y) { 
    this.y = y; 
    }
    //o método a seguir desloca o ponto nos eixos x e y em dx e dy, respectivamente
    public void desloca (double dX, double dY) {
    this.setX(x + dX);
    this.setY(y + dY);
    }
    //métodos de acesso 
    public double getX() { 
    return this.x; 
    }
    public double getY() { 
    return this.y; 
    }
    //método que cria uma String que representa um ponto
    public String toString() {
    return "(" + this.x + ", " + this.y + ")";
    }
    }