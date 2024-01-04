// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static double calculatePower(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        if (x == 0 && n < 0) {
            // Cas où x est 0 et n est négatif, ce n'est pas défini.
            System.out.println("0^" + n + " n'est pas défini.");
            return Double.NaN; // Utilisation de NaN pour indiquer que le résultat n'est pas défini.
        }

        if (x < 0 && n == 0) {
            // Cas où x est négatif et négatif, ce n'est pas défini.
            System.out.println("X^" + n + " n'est pas défini pour X < 0 et n < 0.");
            return Double.NaN; // Utilisation de NaN pour indiquer que le résultat n'est pas défini.
        }

        double result = 1.0;

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                result *= x;
            }
        } else if (n < 0) {
            for (int i = 0; i < -n; i++) {
                result /= x;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(calculatePower(3,-3));
    }
}