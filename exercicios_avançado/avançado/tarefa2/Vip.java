public class Vip extends Ingresso{
    private float adicional;

    public void setValor(float adicional){
        this.adicional = adicional;
    }
    public float getValor(){
        return adicional + valor;
    }
    public void setValor(double d, double e) {
    }
}
