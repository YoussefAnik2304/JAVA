import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du motif triangulaire : ");
        int taille = scanner.nextInt();

        for (int i = 1; i <= taille; i++) {
            // Affiche des espaces pour l'alignement
            for (int j = 1; j <= taille - i; j++) {
                System.out.print(" ");
            }

            // Affiche des étoiles pour former le motif triangulaire
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Passe à la ligne suivante
            System.out.println();
        }
    }
}
