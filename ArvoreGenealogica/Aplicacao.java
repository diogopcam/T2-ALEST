public class Aplicacao{
public static void main(String args[]){
    EntradaSaida entradaSaida = new EntradaSaida();
    //while(entradaSaida.entrada.hasNextLine()){s
        String linha = entradaSaida.entrada.nextLine();
        int primeiroValor = Integer.parseInt(linha);
        //int valorInicial = linha;
        // String nome = camposSeparados[0];
        // int ano = Integer.parseInt(camposSeparados[1]);
        // double preco = Double.parseDouble(camposSeparados[2]);
        // int numeroPecas = Integer.parseInt(camposSeparados[3]);
        System.out.println(primeiroValor);
}
}
