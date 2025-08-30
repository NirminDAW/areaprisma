import javax.swing.JOptionPane;

public class AreaPrisma {

    public static void main(String[] args) {
        float baseTriangulo = leerValor("Ingrese la longitud de la base del triángulo equilátero:");
        float alturaPrisma = leerValor("Ingrese la altura del prisma:");

        float hTriangulo = alturaTriangulo(baseTriangulo);
        float areaBase = areaBase(baseTriangulo, hTriangulo);
        float perimetro = perimetro(baseTriangulo);
        float areaLateral = areaLateral(perimetro, alturaPrisma);
        float areaTotal = areaTotal(areaBase, areaLateral);

        imprimirValor("El área total del prisma es: " + areaTotal);
    }

    public static float leerValor(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        while (!esNumero(input)) {
            input = JOptionPane.showInputDialog("Entrada inválida. " + mensaje);
        }
        return Float.parseFloat(input);
    }

    public static void imprimirValor(String valor) {
        JOptionPane.showMessageDialog(null, valor);
    }

    public static boolean esNumero(String valor) {
        try {
            Float.parseFloat(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static float alturaTriangulo(float baseTriangulo) {
        return (float) (Math.sqrt(3) / 2 * baseTriangulo);
    }

    public static float areaBase(float baseTriangulo, float alturaTriangulo) {
        return 2 * (baseTriangulo * alturaTriangulo) / 2; // Área de dos triángulos
    }

    public static float perimetro(float baseTriangulo) {
        return 3 * baseTriangulo; // Perímetro de un triángulo equilátero
    }

    public static float areaLateral(float perimetro, float alturaPrisma) {
        return perimetro * alturaPrisma; // Área lateral
    }

    public static float areaTotal(float areaBase, float areaLateral) {
        return areaBase + areaLateral; // Área total
    }
}