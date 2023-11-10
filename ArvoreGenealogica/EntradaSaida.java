import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Scanner;

public class EntradaSaida {
    Scanner entrada;            
    PrintStream saidaPadrao = System.out;   

    public EntradaSaida() {
        try {
            BufferedReader streamEntrada = new BufferedReader(new FileReader("entradatribo.txt"));
            entrada = new Scanner(streamEntrada);  
            PrintStream streamSaida = new PrintStream(new File("saidatribo.txt"), Charset.forName("UTF-8"));
            System.setOut(streamSaida);             
        } catch (Exception e) {
            System.out.println(e);
        }
        Locale.setDefault(Locale.ENGLISH); 
        entrada.useLocale(Locale.ENGLISH);
    }

    public Scanner getEntrada() {
        return entrada;
    }
}
