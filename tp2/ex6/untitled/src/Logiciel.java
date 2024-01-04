import java.util.Date;

public class Logiciel extends Produit{
    private String editeur;
    private int AnneeEdition;

    public Logiciel(String Designation, float PrixUnitaire, float Quantite, String editeur, int AnneeEdition) {
        super(Designation, PrixUnitaire, Quantite,'L');
        this.editeur = editeur;
        this.AnneeEdition=AnneeEdition;

    }

    public String getEditeur() {
        return editeur;
    }

    public int getAnneeEdition() {
        return AnneeEdition;
    }
}
