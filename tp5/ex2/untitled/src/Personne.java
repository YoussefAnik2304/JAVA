import java.io.Serializable;

public class Personne implements Serializable {
    private String nom;
    private String prenom;
    private transient String cin; // Le champ CIN est marqué comme transitoire

    public Personne(String nom, String prenom, String cin) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", CIN: " + cin;
    }
}