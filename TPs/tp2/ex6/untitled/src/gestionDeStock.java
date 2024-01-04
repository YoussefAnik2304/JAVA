import java.util.LinkedList;

class gestionDeStock {
    private LinkedList<Produit> listeProduits = new LinkedList<>();

    public void ajouter(Produit produit) {
        listeProduits.add(produit);
    }

    public void supprimerProduit(Produit produit) {
        listeProduits.remove(produit);
    }

    public Produit trouverProduit(String Designation) {
        for (Produit produit : listeProduits) {
            if (produit.Designation.equals(Designation)) {
                return produit;
            }
        }
        return null;
    }

    public double calculerValeurTotale() {
        double valeurTotale = 0;
        for (Produit produit : listeProduits) {
            valeurTotale += produit.PrixUnitaire * produit.Quantite;
        }
        return valeurTotale;
    }

    public void lister() {
        for (Produit produit : listeProduits) {
            produit.display();
            if (produit.Nature == 'L' && produit instanceof Logiciel) {
                Logiciel logiciel = (Logiciel) produit;
                System.out.println("Éditeur: " + logiciel.getEditeur());
                System.out.println("Année d'Édition: " + logiciel.getAnneeEdition());
            }
            System.out.println();
        }
    }
}
