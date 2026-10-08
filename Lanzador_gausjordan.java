public class Lanzador_gausjordan {
    public static void main(String[] args) {
        // 1. Definir la matriz aumentada
        double[][] matriz = defmatrizz.defmatriz();

        // 2. Aplicar el método de Gauss-Jordan
        double[] soluciones = GaussJordan.gaussJordan(matriz);

        // 3. Imprimir resultados finales
        System.out.println("Soluciones del sistema (Gauss-Jordan):");
        for (int i = 0; i < soluciones.length; i++) {
            System.out.println("x" + (i + 1) + " = " + soluciones[i]);
        }
    }
}
