public class Arvore {
    private Nodo root;

    public Arvore(){
        this.root = null;
    }
    //construtor da arvore, com a raiz nula

    public Arvore(Nodo n){
        this.root = n;
    }
    //outro constutor que já define uma raíz

    public boolean isEmpty() {
        return root == null;
    }
    //verifica se a raíz é nula

    public void insertRoot (Nodo n){
        this.root = n;
    }
    //insere um nodo raíz

    public Nodo getRoot() {
        return root;
    }
}