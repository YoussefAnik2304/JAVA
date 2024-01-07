public class Main {
    public static void main(String[] args) {

        DonneeGlobales donneeGlobales = new DonneeGlobales();

        NumeroTelephone num1 = new NumeroTelephone(123456789);
        NumeroTelephone num2 = new NumeroTelephone(987654321);

        donneeGlobales.nouveauNumero(num1);
        donneeGlobales.nouveauNumero(num2);

        donneeGlobales.nouveauAppel(num1, 50);
        donneeGlobales.nouveauAppel(num2, 30);
        System.out.println("Nombre moyen de SMS: " + donneeGlobales.nombreMoyenDeSMS());
    }
}