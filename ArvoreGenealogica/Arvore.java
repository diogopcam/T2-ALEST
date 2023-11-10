//import java.util.ArrayList;
public class Arvore {
    private Nodo root;
    private int terrasPrimGuerreiro;

    public Arvore(){
        this.root = null;
    }

    public Arvore(Nodo n){
        this.root = n;
        this.terrasPrimGuerreiro = root.getTerra();
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insertRoot (Nodo n){
        this.root = n;
    }

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

        if(atual.getNome().equalsIgnoreCase(pai)){
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

        if(atual.getNome().equalsIgnoreCase(nome)){
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
