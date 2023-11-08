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
            String primeiroGuerreiro = divide[0];
            String filho = divide[1];
            int terras = Integer.parseInt(divide[2]);
            Nodo raiz = new Nodo(primeiroGuerreiro, quantTerras);
            
            Arvore arvore = new Arvore(raiz);
            // Aqui inicializei a árvore com o primeiro nome da linha, que representa a raíz da árvore e a quantidade
            // de terras do primeiro guerreiro

            
            arvore.getRoot().nodoToString();
            // Definição da raíz da árvore funcionando também!

            Nodo primFilho = new Nodo(filho, quantTerras + terras);
            raiz.addFilho(primFilho);
             // Aqui o primeiro filho será definido (precisamos de um método que, de acordo com o aumento do número
            // de filhos, divide o número de terras e atualiza todos os números dos outros filhos)

            // Apresentar os filhos

            // A partir da terceira linha podemos fazer um laço de repetição para inserir os filhos e definir a quantidade 
            // de terras até o Scanner encontrar uma linha em branco
            // 


            //while(entradaSaida.getEntrada().hasNextLine()){
            String linha = entradaSaida.getEntrada().nextLine();
            String[] pft = linha.split(" ");
            String pai = pft[0];
            String filhoDois = pft[1];
            int terra = Integer.parseInt(pft[2]);
            // Identifica quem é o pai (guerreiro raíz)
            if(arvore.addFilhoRec(raiz, pai, filhoDois, terra) == true){
                System.out.println("Primeiro filho adicionado com sucesso!");
            } else {
                System.out.println("Erro!");
            }

            raiz.filhosToString();

        }
    }
}

