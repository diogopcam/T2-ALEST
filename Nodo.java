import java.util.ArrayList;
public class Nodo {
    private String nome;
    private Nodo pai;
    private int terra;
    private ArrayList<Nodo> listaFilhos;

    //Construtor
    public Nodo(String nome, int terra){
        this.nome = nome;
        this.terra = terra;
        this.pai = null;
        listaFilhos = new ArrayList<>();
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

    public static void dividirTerras(Nodo n) {

        if(n.getListaFilhos() != null){

            int i = n.getListaFilhos().size();
            if (i != 0){
                int terra01 = n.getTerra();
                int darTerra = terra01 / i;
                ArrayList<Nodo> filhos = n.getListaFilhos();
                for (int j = 0; j < i; j++) {
                    Nodo n2 = filhos.get(j);
                    n2.setTerra(darTerra + n2.getTerra());
                }
            }
        }
    }
    public void nodoToString(){
        System.out.println("Nome do nodo: "+getNome());
        System.out.println("Quantidade de terras: "+getTerra());
        if(getPai() != null){
            System.out.println("Pai do nodo: "+getPai().getNome());
        } else {
             System.out.println("Nenhum pai definido pois essa é a raíz da Árvore - "+getNome());
        }
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
