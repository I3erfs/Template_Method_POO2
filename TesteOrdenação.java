import java.util.Arrays;
import java.util.Comparator;

class ComparaUltimaLetra implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        // Extrai o último caractere de cada string
        char ultimaLetraS1 = s1.charAt(s1.length() - 1);
        char ultimaLetraS2 = s2.charAt(s2.length() - 1);
        
        // Compara os dois caracteres e retorna o resultado
        return Character.compare(ultimaLetraS1, ultimaLetraS2);
    }
}

public class TesteOrdenacao {
    public static void main(String[] args) {
        String[] palavras = {"java", "proxy", "singleton", "interface", "factory"};
        
        System.out.println("Array original:");
        System.out.println(Arrays.toString(palavras));

        Arrays.sort(palavras, new ComparaUltimaLetra());
        
        System.out.println("\nArray ordenado pela última letra:");
        System.out.println(Arrays.toString(palavras));
    }
}
