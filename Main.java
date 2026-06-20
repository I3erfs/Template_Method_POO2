import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Array com nomes de bandas de rock
        String[] bandas = {
            "Metallica", 
            "Queen", 
            "Aerosmith", 
            "Muse", 
            "Scorpions", 
            "Rush"
        };

        System.out.println("TESTE DE ORDENAÇÃO SEPARADO EM ARQUIVOS");
        System.out.println("Array original:");
        System.out.println(Arrays.toString(bandas));
        
        
        // Ordenação pela última letra
        Arrays.sort(bandas, new ComparaUltimaLetra());
        System.out.println("[1] Ordenado pela ÚLTIMA LETRA:");
        System.out.println(Arrays.toString(bandas));

        System.out.println("\n");

        // Ordenação pelo tamanho
        Arrays.sort(bandas, new ComparaTamanho());
        System.out.println("[2] Ordenado por TAMANHO (Menor para o Maior):");
        System.out.println(Arrays.toString(bandas));
    }
}
