import java.util.Comparator;

public class TesteOrdenacao {

    public static abstract class ComparadorTemplate implements Comparator<String> {
        @Override
        public final int compare(String p1, String p2) {
            // Passo 1: Tratamento padronizado contra valores nulos
            if (p1 == null && p2 == null) return 0;
            if (p1 == null) return 1;  // Joga strings nulas para o final
            if (p2 == null) return -1;

            return compararDetalhe(p1, p2);
        }

        protected abstract int compararDetalhe(String p1, String p2);
    }

    /**
    *Ordenação baseada na última letra da palavra.
     */
    public static class ComparadorPorUltimaLetra extends ComparadorTemplate {
        @Override
        protected int compararDetalhe(String p1, String p2) {
            // Tratamento para strings vazias ""
            if (p1.isEmpty() && p2.isEmpty()) return 0;
            if (p1.isEmpty()) return -1;
            if (p2.isEmpty()) return 1;

            char ultimaLetra1 = p1.charAt(p1.length() - 1);
            char ultimaLetra2 = p2.charAt(p2.length() - 1);

            return Character.compare(ultimaLetra1, ultimaLetra2);
        }
    }

    /**
     *Ordenação baseada no tamanho (comprimento) da palavra.
     */
    public static class ComparadorPorTamanho extends ComparadorTemplate {
        @Override
        protected int compararDetalhe(String p1, String p2) {
            return Integer.compare(p1.length(), p2.length());
        }
    }
}
