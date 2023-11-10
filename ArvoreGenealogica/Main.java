import static org.junit.jupiter.api.DynamicTest.stream;
import org.junit.platform.engine.support.hierarchical.Node;

public class Main{
    public static void main(String args[]){

        EntradaSaida entradaSaida = new EntradaSaida();

        if(entradaSaida.getEntrada() != null){

            // 12 - 14: Quantidade de terras do primeiro guerreiro, que é a raíz da árvore
            String primeiraLinha = entradaSaida.getEntrada().nextLine();
            String[] camposSeparados = primeiraLinha.split(" ");
            int quantTerras = Integer.parseInt(camposSeparados[0]);

            // 17 - 30: Fora do loop, crio o primeiro guerreiro (raíz) e seu filho
            String paiFilhoTerras = entradaSaida.getEntrada().nextLine();
            String[] divide = paiFilhoTerras.split(" ");
            String primeiroGuerreiro = divide[0];
            String filho = divide[1];
            int terras = Integer.parseInt(divide[2]);
            Nodo raiz = new Nodo(primeiroGuerreiro, quantTerras);
            Arvore arvore = new Arvore(raiz);

            // 26 - 31: Linhas de teste para confirmar o funcionamento do método addFilhoRec
            if(arvore.addFilhoRec(raiz, primeiroGuerreiro, filho, terras)){
                System.out.println("Recursividade funcionando!");
                raiz.filhosToString();
            } else {
                System.out.println("Recursividade não funcionando!");
            }

            // 34 - 53: Loop de repetição para criação da árvore
            while(entradaSaida.getEntrada().hasNextLine()){
                String linhaRep = entradaSaida.getEntrada().nextLine();
                String[] linhaRepQuebra = linhaRep.split(" ");

                String paiL = linhaRepQuebra[0];

                String filhoL = linhaRepQuebra[1];

                int terrasL = Integer.parseInt(linhaRepQuebra[2]);

                boolean teste = arvore.addFilhoRec(raiz, paiL, filhoL, terrasL);

                if(teste == true){
                    System.out.println("Recursividade funcionando!");
                    arvore.retornaNodo(raiz, filhoL).nodoToString();
                    System.out.println(" ");
                } else {
                    System.out.println("Recursividade não funcionando ou esse pai não existe!");
                }
            }
    }
}
}


