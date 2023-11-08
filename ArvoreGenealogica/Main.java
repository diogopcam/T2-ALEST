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

            // Exemplo: 103787

            System.out.println("Funcionou: "+quantTerras);

            //Segunda linha: define a raíz e inicia a árvore
            
            // Exemplo: Thorgestax Deldriralex 4626
            //          PAI        FILHO       TERRAS CONQUISTADAS

            String paiFilhoTerras = entradaSaida.getEntrada().nextLine();
            String[] divide = paiFilhoTerras.split(" ");
            String raiz = divide[0];
            String filho = divide[1];
            int terras = Integer.parseInt(divide[2]);
            Arvore arvore = new Arvore(new Nodo(raiz, quantTerras));
            // Aqui inicializei a árvore com as informações dadas pela segunda linha do pergaminho.

            System.out.println(raiz);
            System.out.println(filho);
            System.out.println(terras + 100);
            // Quebra das linhas em elementos individuais funcionando!

            arvore.getRoot().nodoToString();
            // Definição da raíz da árvore funcionando também!

            // A partir da terceira linha podemos fazer um laço de repetição para inserir os filhos e definir a quantidade 
            // de terras até o Scanner encontrar uma linha em branco
            //    


        }
    }
}

