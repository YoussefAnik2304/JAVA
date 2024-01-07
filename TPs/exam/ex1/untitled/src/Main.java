public class Main {
    public static void main(String[] args) {
           Personne x =new Etudiant();
           Etudiant y =new Etudiant();
           Personne z =new Personne();
           //Etudiant t=new Personne();
           x.appel(y);
           x.afficher(y);
           y.appel(x);
           y.afficher(x);
           x.appel(z);
           x.afficher(z);
           z.appel(x);
           z.appel(y);

    }
}