import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] bandas = {
            "Metallica", "Queen", "LedZeppelin", "AC/DC", "Nirvana", "The Who", "Rush", "", null, "U2"
        };

        System.out.println("Array Original");
        System.out.println(Arrays.toString(bandas));

        // Clonando os arrays para que cada teste use a versão original desordenada
        String[] bandasPorTamanho = bandas.clone();
        String[] bandasPorUltimaLetra = bandas.clone();

        // Ordenação pelo Tamanho
        Arrays.sort(bandasPorTamanho, new TesteOrdenacao.ComparadorPorTamanho());
        System.out.println("\n Ordenado por Tamanho do Nome ");
        System.out.println(Arrays.toString(bandasPorTamanho));

        // Ordenação pela Última Letra
        Arrays.sort(bandasPorUltimaLetra, new TesteOrdenacao.ComparadorPorUltimaLetra());
        System.out.println("\n Ordenado pela Última Letra ");
        System.out.println(Arrays.toString(bandasPorUltimaLetra));
    }
}
