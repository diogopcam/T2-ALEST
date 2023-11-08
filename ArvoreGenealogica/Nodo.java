import java.util.ArrayList;
public class Nodo {
    private String nome;
    private int terra;
    private ArrayList<Nodo> listaFilhos;

    //Construtor
    public Nodo(String nome, int terra){
        this.nome = nome;
        this.terra = terra;
        //this.pai = null;
        listaFilhos = new ArrayList<>();
    }

    public Nodo(String nome){
        this.nome = nome;
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

    // public int defineTerrasFilho(){
    //     //quantidade de terras do pai divididas pela quantidade de filhos
    // }

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