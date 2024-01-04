import java.util.Scanner;

public class SommeEntiers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre d'entiers à saisir: ");
        int n = scanner.nextInt();
        int somme = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Entrez un entier: ");
            String input = scanner.next();
            try {
                int entier = Integer.parseInt(input);
                somme += entier;
            } catch (NumberFormatException e) {
                System.out.println("Erreur : Format invalide, veuillez entrer un entier.\n"+e.getMessage());
            }
        }

        System.out.println("Somme des entiers : " + somme);
    }
}
