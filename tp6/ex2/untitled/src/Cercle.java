import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Cercle implements Comparable<Cercle> {
    private int x, y;
    private double rayon;

    public Cercle(int x, int y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public void affiche() {
        System.out.println("Coordonnees : " + x + ", rayon : " + rayon);
    }

    public double getRayon() {
        return rayon;
    }

    public int getX() {
        return x;
    }

    @Override
    public int compareTo(Cercle other) {
        // Comparaison basée sur les valeurs croissantes de leur rayon
        return Double.compare(this.rayon, other.rayon);
    }

    // Méthode utilitaire pour trier suivant les valeurs croissantes de leur abscisse
    public static Comparator<Cercle> sortByAbscisse() {
        return Comparator.comparingInt(Cercle::getX);
    }
}