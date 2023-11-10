import static org.junit.jupiter.api.DynamicTest.stream;
import org.junit.platform.engine.support.hierarchical.Node;

public class Main{
    public static void main(String args[]){

        EntradaSaida entradaSaida = new EntradaSaida();

        if(entradaSaida.getEntrada() != null){

            String primeiraLinha = entradaSaida.getEntrada().nextLine();
            String[] camposSeparados = primeiraLinha.split(" ");

            int quantTerras = Integer.parseInt(camposSeparados[0]);
            //Essa é a quantidade de guerras do primeiro guerreiro


            String paiFilhoTerras = entradaSaida.getEntrada().nextLine();
            String[] divide = paiFilhoTerras.split(" ");
            String primeiroGuerreiro = divide[0];
            String filho = divide[1];
            int terras = Integer.parseInt(divide[2]);
            Nodo raiz = new Nodo(primeiroGuerreiro, quantTerras);
            Arvore arvore = new Arvore(raiz);
            // Segunda linha (cria o primeiro guerreiro(raíz))

            raiz.nodoToString();

            if(arvore.addFilhoRec(raiz, primeiroGuerreiro, filho, terras)){
                System.out.println("Recursividade funcionando!");
                raiz.filhosToString();
            } else {
                System.out.println("Recursividade não funcionando!");
            }

            String terceiraLinha = entradaSaida.getEntrada().nextLine();
            String[] terceiraLinhaQuebra = terceiraLinha.split(" ");
            String paiT = terceiraLinhaQuebra[0];
            String filhoT = terceiraLinhaQuebra[1];
            int terrasT = Integer.parseInt(terceiraLinhaQuebra[2]);

            if(arvore.addFilhoRec(raiz, paiT, filhoT, terrasT)){
                System.out.println("Recursividade funcionando!");
                //arvore.retornaNodo(raiz, paiT).filhosToString();
            } else {
                System.out.println("Recursividade não funcionando!");
            }

            String quartaLinha = entradaSaida.getEntrada().nextLine();
            String[] quartaLinhaQuebra = quartaLinha.split(" ");
            String paiQ = quartaLinhaQuebra[0];
            String filhoQ = quartaLinhaQuebra[1];
            int terrasQ = Integer.parseInt(quartaLinhaQuebra[2]);

            if(arvore.addFilhoRec(raiz, paiQ, filhoQ, terrasQ)){
                System.out.println("Recursividade funcionando!");
                arvore.retornaNodo(raiz, paiQ).filhosToString();
            } else {
                System.out.println("Recursividade não funcionando!");
            }
    }
}
}

