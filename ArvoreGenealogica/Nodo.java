import java.util.ArrayList;
public class Nodo {
    private String nome;
    private int terra;
    private Nodo filho;
    private Nodo pai;
    private ArrayList<Nodo> listaFilhos;

    //Construtor
    public Nodo(String nome, int terra){
        this.nome = nome;
        this.terra = terra;
        this.filho = null;
        this.pai = null;
        listaFilhos = new ArrayList<>();
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
        this.filho = filho;
        listaFilhos.add(filho);
    }
    // define o(s) filho(s) de umn nodo

    // public void addPai(Nodo pai){
    //     this.pai = pai;
    // }
    // //define o pai de um nodo

    public Nodo getFilho() {
        return filho;
    }
    // retorna o filho de um nodo

    public void nodoToString(){
        System.out.println("Nome do nodo: "+getNome());
        System.out.println("Quantidade de terras: "+getTerra());
    }

    public void filhosToString(){
        for(Nodo n:this.listaFilhos){
            System.out.println("Nome do nodo: "+n.getNome());
            System.out.println("Quantidade de terras: "+n.getTerra());
            System.out.println(" ");
        }
    }
}