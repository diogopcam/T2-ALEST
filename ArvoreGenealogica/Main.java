import java.util.ArrayList;
public class Main{
    public static void main(String args[]){

        EntradaSaida entradaSaida = new EntradaSaida();

        if(entradaSaida.getEntrada() != null){

            // 12 - 14: Quantidade de terras do primeiro guerreiro, que é a raíz da árvore
            String primeiraLinha = entradaSaida.getEntrada().nextLine();
            String[] camposSeparados = primeiraLinha.split(" ");
            int quantTerras = Integer.parseInt(camposSeparados[0]);

            // 17 - 30: Fora do loop, o primeiro guerreiro (raíz) e seu filho são criados
            String paiFilhoTerras = entradaSaida.getEntrada().nextLine();
            String[] divide = paiFilhoTerras.split(" ");
            String primeiroGuerreiro = divide[0];
            String filho = divide[1];
            int terras = Integer.parseInt(divide[2]);
            Nodo raiz = new Nodo(primeiroGuerreiro, quantTerras);
            Arvore arvore = new Arvore(raiz);
            arvore.addFilhoRec(raiz, primeiroGuerreiro, filho, terras);

            // 34 - 53: Loop de repetição para criação da árvore
            while(entradaSaida.getEntrada().hasNextLine()){
                String linhaRep = entradaSaida.getEntrada().nextLine();
                String[] linhaRepQuebra = linhaRep.split(" ");

                String paiL = linhaRepQuebra[0];

                String filhoL = linhaRepQuebra[1];

                int terrasL = Integer.parseInt(linhaRepQuebra[2]);

                boolean teste = arvore.addFilhoRec(raiz, paiL, filhoL, terrasL);

                if(teste == false){
                    System.out.println("Esse pai não existe!");
                    System.out.println(" ");
                }
            }
            
            arvore.dividirTerrasRecursivo(raiz);
            arvore.raizToString();
            arvore.apresentaTodos(raiz);
            arvore.setGeracoes(arvore.calculaGeracoes(raiz));
    
            ArrayList<Nodo> nodosUltimaGeracao = arvore.ultimaGeracao(raiz);
            Nodo procurado = arvore.maiorQuantidade(nodosUltimaGeracao);

            System.out.println("Nodo com a maior quantidade de terras: ");
            System.out.println("-------------------------------------");
            System.out.println(" ");
            procurado.nodoToString();
            System.out.println("-------------------------------------");
    }
}
}


