import java.util.ArrayList;
public class Nodo {
    private String nome;
    private Nodo pai;
    private int terra;
    private int geracao;
    private ArrayList<Nodo> listaFilhos;

    //Construtor
    public Nodo(String nome, int terra){
        this.nome = nome;
        this.terra = terra;
        this.pai = null;
        this.geracao = 0;
        listaFilhos = new ArrayList<>();
    }

    public void setGeracao(int geracao) {
        this.geracao = geracao;
    }
    
    public int getGeracao() {
        return geracao;
    }

    public void setPai(Nodo pai){
        this.pai = pai;
    }

    public Nodo getPai(){
        return this.pai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTerra() {
        return terra;
    }

    public void setTerra (int terra) {
        this.terra = terra;
    }

    public void addFilho(Nodo filho){
        listaFilhos.add(filho);
    }

    public ArrayList<Nodo> getListaFilhos() {
        return listaFilhos;
    }

    public void nodoToString(){
        System.out.println("Nome do nodo: "+getNome());
        System.out.println("Quantidade de terras: "+getTerra());
        if(getPai() != null){
            System.out.println("Pai do nodo: "+getPai().getNome());
        } else {
             System.out.println("Nenhum pai definido pois essa é a raíz da Árvore - "+getNome());
        }
        System.out.println("Geração do Nodo: "+getGeracao());
        System.out.println(" ");
    }

    public void filhosToString(){
        for(Nodo n:this.listaFilhos){
            System.out.println("Nome do nodo: "+n.getNome());
            System.out.println("Pai do nodo: "+n.getPai().getNome());
            System.out.println("Quantidade de terras: "+n.getTerra());
            System.out.println(" ");
        }
    }
}
