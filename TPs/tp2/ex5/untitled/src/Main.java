public class Main {
    public static void main(String[] args) {
        Personne personne =new Personne("youssef",0);
        Personne.Compte compte =personne.new Compte(1,2000);
        System.out.println(compte.getInf());
        System.out.println(personne.getNom());
    }
}