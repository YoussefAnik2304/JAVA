import java.io.*;
import java.util.ArrayList;
import java.util.List;

// La classe Personne que nous allons sérialiser


public class Main {

    // Fonction pour écrire un objet Personne dans un fichier binaire
    public static void ecrirePersonne(Personne personne, String fichier) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichier))) {
            oos.writeObject(personne);
            System.out.println("Personne écrite avec succès dans le fichier : " + fichier);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Fonction pour lire un objet Personne depuis un fichier binaire
    public static Personne lirePersonne(String fichier) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichier))) {
            Personne personne = (Personne) ois.readObject();
            return personne;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Fonction pour lister les personnes dont le nom commence par "n"
    public static void listerPersonnesParNom(String fichier, char lettre) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichier))) {
            List<Personne> personnes = new ArrayList<>();
            try {
                Personne personne = (Personne) ois.readObject();
                while (personne !=null) {

                    //if (personne.getNom().charAt(0) == lettre) {
                        personnes.add(personne);
                    //}
                    personne=(Personne) ois.readObject();
                }
            } catch (EOFException e) {

            }

            System.out.println("Personnes dont le nom commence par '" + lettre + "':");
            for (Personne personne : personnes) {
                System.out.println(personne);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        Personne personne1 = new Personne("Nom1", "Prénom1", "CIN1");
        Personne personne2 = new Personne("Nom2", "Prénom2", "CIN2");

        // Écrire les personnes dans des fichiers binaires
        ecrirePersonne(personne1, "personne1.bin");
        ecrirePersonne(personne2, "personne2.bin");

        // Lire une personne depuis le fichier binaire
        Personne personneLue = lirePersonne("personne1.bin");
        System.out.println("Personne lue depuis le fichier : " + personneLue);

        // Liste les personnes dont le nom commence par 'N'
        listerPersonnesParNom("personne2.bin", 'N');
    }
}
