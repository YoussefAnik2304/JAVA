import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Création d'un tableau (ArrayList) d'objets de type Cercle
        ArrayList<Cercle> liste = new ArrayList<>();
        liste.add(new Cercle(3, 5, 2.5));
        liste.add(new Cercle(1, 8, 1.8));
        liste.add(new Cercle(7, 3, 3.2));

        // Tri suivant les valeurs croissantes de leur rayon
        Collections.sort(liste);
        System.out.println("Tri suivant les valeurs croissantes de leur rayon:");
        for (Cercle cercle : liste) {
            cercle.affiche();
        }

        // Tri suivant les valeurs croissantes de leur abscisse
        Collections.sort(liste, Cercle.sortByAbscisse());
        System.out.println("\nTri suivant les valeurs croissantes de leur abscisse:");
        for (Cercle cercle : liste) {
            cercle.affiche();
        }

        // Création d'un ensemble ordonné de Cercle de type SortedSet
        SortedSet<Cercle> setCercle = new TreeSet<>(Cercle.sortByAbscisse());
        setCercle.addAll(liste);
        System.out.println("\nSortedSet suivant les valeurs croissantes de leur abscisse:");
        for (Cercle cercle : setCercle) {
            cercle.affiche();
        }
    }
}
