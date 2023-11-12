import java.util.ArrayList;

public class Arvore {
    private Nodo root;
    private int terrasPrimGuerreiro;
    private int geracoes;

    public Arvore(Nodo n){
        n.setGeracao(1);
        this.root = n;
        this.terrasPrimGuerreiro = root.getTerra();
        this.geracoes = 0;
    }

    public void setGeracoes(int geracoes) {
        this.geracoes = geracoes;
    }

    public int getGeracoes() {
        return geracoes;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Nodo getRoot() {
        return root;
    }

     public void raizToString(){
        root.nodoToString();
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
            novoFilho.setGeracao(atual.getGeracao() + 1);
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

    public void dividirTerrasRecursivo(Nodo n) {
        if (n != null) {
            int quantidadeFilhos = n.getListaFilhos().size();
    
            if (quantidadeFilhos > 0) {
                int terraPai = n.getTerra();
                int terraPorFilho = terraPai / quantidadeFilhos;
    
                for (Nodo filho : n.getListaFilhos()) {
                    int novaTerraFilho = terraPorFilho + filho.getTerra();
                    filho.setTerra(novaTerraFilho);

                    dividirTerrasRecursivo(filho);
                }
            }
        }
    }

    public void apresentaTodos(Nodo raiz){
        for(Nodo n:raiz.getListaFilhos()){
            n.nodoToString();
            apresentaTodos(n);
        }
    }

    public ArrayList<Nodo> ultimaGeracao(Nodo raiz) {
        ArrayList<Nodo> listaApoio = new ArrayList<Nodo>();
        ultimaGeracaoRecursivo(raiz, listaApoio);
        return listaApoio;
    }

    private void ultimaGeracaoRecursivo(Nodo nodo, ArrayList<Nodo> listaApoio) {
        if (nodo.getListaFilhos().isEmpty() && nodo.getGeracao() == getGeracoes()) {
            listaApoio.add(nodo);
        }

        for (Nodo filho : nodo.getListaFilhos()) {
            ultimaGeracaoRecursivo(filho, listaApoio);
        }
    }

    public Nodo maiorQuantidade(ArrayList<Nodo> lista){
        int maiorValor = 0;
        Nodo procurado = null;
        for(Nodo n:lista){
            if(n.getTerra() > maiorValor){
                procurado = n;
                maiorValor = n.getTerra();
            }
        }
        return procurado;
    }

    public int calculaGeracoes(Nodo raiz) {
        if (raiz == null) {
            return 0;
        }

        int geracoesVar = 0;

        for (Nodo filho : raiz.getListaFilhos()) {
            int geracoesFilho = calculaGeracoes(filho);
            geracoesVar = Math.max(geracoesVar, geracoesFilho);
        }
        return geracoesVar + 1;
    }
}


