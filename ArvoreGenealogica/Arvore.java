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

    public boolean addFilhoRec(Nodo atual, String pai, String filho, int terras){
        if(atual == null){
            return false;
        }

        if(atual.getNome().equals(pai)){
            Nodo novoFilho = new Nodo(filho, terras);
            novoFilho.setPai(atual);
            atual.getListaFilhos().add(novoFilho);
            return true;
        }

        for (Nodo filhos : atual.getListaFilhos()){
            if (addFilhoRec(filhos, pai, filho, terras)){
                return true;
            }
        }
        return false;
    }

    public Nodo retornaNodo(Nodo atual, String nome){
        if(atual == null){
            return null;
        }

        if(atual.getNome().equals(nome)){
            return atual;
        }

        for(Nodo comp : atual.getListaFilhos()){
            Nodo nodoEncontrado = retornaNodo(comp, nome);
            if(nodoEncontrado != null){
                return nodoEncontrado;
            }
        }
        
        return null;
    }
}
