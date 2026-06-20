import java.util.Arrays;
import java.util.Comparator;

//Comparador 1 (Última letra)
class ComparaUltimaLetra implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        char ultimaLetraS1 = s1.charAt(s1.length() - 1);
        char ultimaLetraS2 = s2.charAt(s2.length() - 1);
        return Character.compare(ultimaLetraS1, ultimaLetraS2);
    }
}

// Comparador 2 (Tamanho da palavra)
class ComparaTamanho implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        // Integer.compare é a forma mais segura de comparar dois números inteiros em Java
        return Integer.compare(s1.length(), s2.length());
    }
}

public class TesteOrdenacao {
    public static void main(String[] args) {
        String[] palavras = {"java", "proxy", "singleton", "interface", "factory"};
        
        System.out.println("--- Array original ---");
        System.out.println(Arrays.toString(palavras));
        
        // Testando a ordenação pela última letra
        Arrays.sort(palavras, new ComparaUltimaLetra());
        System.out.println("\n--- Ordenado pela última letra ---");
        System.out.println(Arrays.toString(palavras));

        // Testando a NOVA ordenação por tamanho
        Arrays.sort(palavras, new ComparaTamanho());
        System.out.println("\n--- Ordenado por tamanho (do menor para o maior) ---");
        System.out.println(Arrays.toString(palavras));
    }
}
