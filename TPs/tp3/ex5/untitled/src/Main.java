public class Main {
    public static void main(String[] args) {

        Compte compte = new Compte("John", "Doe", 1000, "1234");

        try {
            compte.retrait(500, "1000");
            System.out.println("Solde après retrait : " + compte.solde);
            compte.retrait(600, "5678"); // CodeIncorrect
        } catch (CodeIncorrect e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (retraitInterdit e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}