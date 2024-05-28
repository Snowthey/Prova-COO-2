public class Main {
    public static void main(String[] args) {
        Operacoes operacoes = new Operacoes();

        int[] numDiscos = new int[98];
        long[] numOperacoes = new long[98];

        for (int i = 0; i < 98; i++) {
            numDiscos[i] = i + 3;
            numOperacoes[i] = operacoes.calcularNumeroOperacoes(numDiscos[i]);
            System.out.println("Número de operações para " + numDiscos[i] + " discos: " + numOperacoes[i]);
        }

        Grafico.plotarGrafico(numDiscos, numOperacoes);
    }
}
