public class ListaDuplaCircular {
    private NoDuplo primeiro;
    public ListaDuplaCircular(){
        setPrimeiro(null);
    }
    public NoDuplo getPrimeiro(){
        return primeiro;
    }
    public void setPrimeiro(NoDuplo primeiro){
        this.primeiro = primeiro;
    }
    public boolean estaVazia(){
        return primeiro == null;
    }
    public void insereInicio(int info){
        NoDuplo novo = new NoDuplo(info);
        if (estaVazia()){
            primeiro = novo;
        }
        else{
            novo.setProximo(primeiro);
            novo.setAnterior(primeiro.getAnterior());
            //primeiro.getAnterior().setProximo(novo);
            //primeiro.setAnterior(novo);
            novo.getAnterior().setProximo(novo);
            NoDuplo proximo = (NoDuplo)novo.getProximo();
            proximo.setAnterior(novo);
            primeiro = novo;
        }
    }
}
