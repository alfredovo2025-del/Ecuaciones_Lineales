public class GaussJordan {
    // Método que aplica Gauss-Jordan reutilizando Gauss.eliminacionGaussiana
    public static double[] gaussJordan(double[][] matriz) {
        int n = matriz.length;

        //  Reutilización del módulo Gauss
        Gauss.eliminacionGaussiana(matriz);

        //  Normalización de pivotes y barrido superior
        for (int i = n - 1; i >= 0; i--) {
            double pivote = matriz[i][i];
            for (int k = i; k <= n; k++) {
                matriz[i][k] /= pivote; // Normalizar pivote
            }
            for (int j = i - 1; j >= 0; j--) {
                double factor = matriz[j][i];
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k]; // Barrido superior
                }
            }
        }

        //  Lectura directa de soluciones
        double[] x = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = matriz[i][n];
        }
        return x;
    }
}
