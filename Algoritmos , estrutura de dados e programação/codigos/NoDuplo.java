public class NoDuplo extends No {
    private NoDuplo anterior;
    public NoDuplo(int info){
        super(info);
        super.setProximo(this);
        this.anterior = this;
    }
    public NoDuplo getAnterior(){
        return this.anterior;
    }
    public void setAnterior(NoDuplo anterior){
        this.anterior = anterior;
    }
    @Override
    public String toString(){
        return "=|" + super.getInfo() + "|=";
    }
}
