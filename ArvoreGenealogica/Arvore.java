//import java.util.ArrayList;
public class Arvore {
    private Nodo root;
    private int terrasPrimGuerreiro;

    public Arvore(){
        this.root = null;

    }
    //construtor da arvore, com a raiz nula

    public Arvore(Nodo n){
        this.root = n;
        this.terrasPrimGuerreiro = root.getTerra();
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

    public int getTerrasPrimGuerreiro(){
        return this.terrasPrimGuerreiro;
    }


    // public void adicionarFilho(String nomePai, String nomeFilho) {
    //     adicionarFilhoRecursivo(root, nomePai, nomeFilho);
    // }


    public boolean addFilhoRec(Nodo root, String nomePai, String nomeFilho, int terras) {
        if (root == null) {
            return false; // Guerreiro não encontrado
        }
    
        if (root.getNome().equals(nomePai)) {
            Nodo novoFilho = new Nodo(nomeFilho, terras); // Você pode definir a quantidade de terras apropriada aqui
            root.addFilho(novoFilho);
            return true; // Filho adicionado com sucesso
        }
    
        for (Nodo filho : root.getListaFilhos()) {
            if (addFilhoRec(filho, nomePai, nomeFilho, terras)) {
                return true; // Filho encontrado e adicionado
            }
        }
        return false; // Guerreiro não encontrado neste subárvore
    }
}