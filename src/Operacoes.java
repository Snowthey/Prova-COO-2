public class Operacoes {

    long torreHanoi(int n) {
        if (n == 1) {
            return 1;
        }
        return 1 + 2 * torreHanoi(n - 1);
    }

    long calcularNumeroOperacoes(int n) {
        return torreHanoi(n);
    }
}
