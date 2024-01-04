public class Produit {
    protected String Designation;
    protected float PrixUnitaire;
    protected float Quantite;
    protected char Nature ;
    Produit(String Designation,float PrixUnitaire,float Quantite,char Nature){
        this.Designation=Designation;
        this.PrixUnitaire=PrixUnitaire;
        this.Quantite=Quantite;
        this.Nature=Nature;
    }

    public char getNature() {
        return Nature;
    }

    public float getQuantite() {
        return Quantite;
    }

    public float getPrixUnitaire() {
        return PrixUnitaire;
    }

    public String getDesignation() {
        return Designation;
    }
    public void display() {
        System.out.println("Designation: " + Designation);
        System.out.println("Quantite: " + Quantite);
        System.out.println("Price: " + PrixUnitaire);
        System.out.println("Nature: " + Nature);
    }
}
