public class Arvore {
    private Nodo root;
    private Nodo filho;

    public Arvore(){
        this.root = null;
    }
    //construtor da arvore, com a raiz nula

    public Arvore(Nodo n){
        this.root = n;
        filho = null;
    }
    //outro constutor que já define uma raíz

    public boolean isEmpty() {
        return root == null;
    }
    //verifica se a raíz é nula

    // public void insertNodo (Node n, String nome){
    //     root = insertRec(root, nome);
    // }
    // //insere um nodo raíz

    // private Node insertRec(Node root, String nome) {
    //     if (root == null) {
    //         root = new Node (nome);
    //         return root;
    //     }

    //     if (Nodo prev.getNome().equals( Nodo root.getPai())) {
    //         Nodo next = Nodo (nome);
    //     } else if (data > root.data) {
    //         root.right = insertRec(root.right, data);
    //     }

    //     return root;
    // }

    public Nodo getRoot() {
        return root;
    }
}