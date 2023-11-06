import org.junit.platform.engine.support.hierarchical.Node;

public class Main{
    public static void main(String args[]){
        Arvore arvore = new Arvore();

        System.out.println(arvore.isEmpty());

        Nodo raiz = new Nodo("Raiz", 200);
        Arvore arvoreDois = new Arvore(raiz);

        System.out.println(arvoreDois.isEmpty());

        Nodo raizArvoreDois = arvoreDois.getRoot();
        //raizArvoreDois.nodoToString();

        int quantTerras = raizArvoreDois.getTerra();

        Nodo filhoUm = new Nodo("Sou o primeiro filho", quantTerras/3);
        Nodo filhoDois = new Nodo("Sou o segundo filho", quantTerras/3);
        Nodo filhoTres = new Nodo("Sou o terceiro filho", quantTerras/3);
        //quantidade de terras do pai dividido pelo numero de filhos (definir quantas terras cada filho terá)
        //o primeiro filho recebe a quantidade total de terras

        raizArvoreDois.addFilho(filhoUm);
        raizArvoreDois.addFilho(filhoDois);
        raizArvoreDois.addFilho(filhoTres);

        raizArvoreDois.filhosToString(raizArvoreDois);

        //isEmpty e construtores funcionando.
    }
}