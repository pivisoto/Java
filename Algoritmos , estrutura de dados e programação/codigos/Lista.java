public class Lista {
    private No primeiro;

    // por clareza
    public Lista() {
        setPrimeiro(null);
    }

    public boolean isEmpty() {
        return this.primeiro == null;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getPrimeiro() {
        return this.primeiro;
    }

    public void insereInicio(int info) {
        No novo = new No(info);
        if (!this.isEmpty()) {
            novo.setProximo(primeiro);
        }
        this.primeiro = novo;
    }

    @Override
    public String toString() {
        String msg = "Lista: ";
        if (this.isEmpty()) {
            msg = msg + "esta vazia";
        } else {
            No aux = this.primeiro;
            while (aux != null) {
                msg = msg + aux;
                aux = aux.getProximo();
            }
            msg = msg + "//";
        }
        return msg;
    }

    public void insereFim(int info) {
        No novo = new No(info);
        if (this.isEmpty()) {
            this.primeiro = novo;
        } else {
            No aux = this.primeiro;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(novo);

        }
    }

    public int removeInicio() {
        int temp = this.primeiro.getInfo();
        this.primeiro = this.primeiro.getProximo();
        return temp;
    }
    public int removeFim(){
        if(this.primeiro.getProximo() == null){
            int temp = this.primeiro.getInfo();
            this.primeiro = null;
            return temp;
        }
        else{
            No aux = this.primeiro;
            while(aux.getProximo().getProximo() != null){
            aux = aux.getProximo();

            }
            int temp = aux.getProximo().getInfo();
            aux.setProximo(null);
            return temp;
        }
        }
    /*public int removePosicao(){
        int pos = getPrimeiro().getInfo();
        if(pos == 1){
            //return this.removeInicio();
        }
        else{
            No aux = this.primeiro;
            int cont = getPrimeiro().getInfo();
            while(aux.getProximo() != null && cont < pos){
                aux = aux.getProximo();
                cont++;
            }
            int temp = aux.getProximo().getInfo();
            aux.setProximo(aux.getProximo().getProximo());

            }
    }
    */
    public int tamanhoLista() {
        int tamanho = 0;
        No aux = this.primeiro;
        while (aux != null){
            tamanho++;
            aux.getProximo();
        }
        return tamanho;
    }
    public void inserenaPosicao(int a , int b) {
        No novo = new No(b);
        No aux = this.primeiro;
        int pos = 0;
        while (pos != a){
            pos++;
            aux.getProximo();
        } 
        No prox = aux.getProximo();
        aux.setProximo(novo); 
        novo.setProximo(prox);
        System.out.println(novo);
    }
    
}

//Lista() é o construtor, que define o primeiro nó como nulo.
//isEmpty() verifica se a lista está vazia ou não.
//setPrimeiro(No primeiro) define o primeiro nó da lista.
//getPrimeiro() retorna o primeiro nó da lista.
//insereInicio(int info) insere um novo nó com a info fornecida no início da lista.
//toString() retorna uma representação em string da lista.
//insereFim(int info) insere um novo nó com a info fornecida no final da lista.
//removeInicio() remove o primeiro nó da lista e retorna sua info.
//removeFim() remove o último nó da lista e retorna sua info.