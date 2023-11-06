import static org.junit.jupiter.api.DynamicTest.stream;

import org.junit.platform.engine.support.hierarchical.Node;

public class Main{
    public static void main(String args[]){
        Arvore arvore = new Arvore();
        Arvore arvoreDois = new Arvore();
        
        Nodo raiz = new Nodo("Raiz da arvore", 200);
        arvore.insertRoot(raiz);

        Nodo raizArvoreDois = new Nodo("Raiz da arvore dois", 500);
        arvoreDois.insertRoot(raizArvoreDois);


        int quantTerras = raiz.getTerra();

        Nodo filhoUm = new Nodo("Sou o primeiro filho", quantTerras/3);
        Nodo filhoDois = new Nodo("Sou o segundo filho", quantTerras/3);
        Nodo filhoTres = new Nodo("Sou o terceiro filho", quantTerras/3);
        //quantidade de terras do pai dividido pelo numero de filhos (definir quantas terras cada filho terá)
        //o primeiro filho recebe a quantidade total de terras

        raiz.addFilho(filhoUm);
        raiz.addFilho(filhoDois);
        raiz.addFilho(filhoTres);

        raiz.filhosToString();

        int quantTerrasArvoreDois = arvoreDois.getRoot().getTerra();
        Nodo filhoUmArv2 = new Nodo("Sou o primeiro filho da segunda arvore", quantTerrasArvoreDois/3);
        Nodo filhoDoisArv2 = new Nodo("Sou o segundo filho da segunda arvore", quantTerrasArvoreDois/3);
        Nodo filhoTresArv3 = new Nodo("Sou o terceiro filho da segunda arvore", quantTerrasArvoreDois/3);

        raizArvoreDois.addFilho(filhoUmArv2);
        raizArvoreDois.addFilho(filhoDoisArv2);
        raizArvoreDois.addFilho(filhoTresArv3);

        raizArvoreDois.filhosToString();
    }
}