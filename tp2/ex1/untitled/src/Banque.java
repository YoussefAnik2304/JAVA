
public class Banque {
    private int NCompte;
    private  float  Solde ;
    private String CIN;
    Banque(int NCompte,float Solde, String CIN){
        this.CIN=CIN;
        this.Solde=Solde;
        this.NCompte=NCompte;
    }
    public void deposer(float somme ){
        this.Solde+=somme;
        System.out.println("vous avez deposer " + somme + "votre solde actuel est : " + this.getSolde());
    }
    public void retire (float somme ) {
        if (this.Solde > somme) {
            this.Solde -= somme;
            System.out.println("vous avez deposer " + somme + "votre solde actuel est : " + this.getSolde());
        } else {
            System.out.println("votre solde n'est pas suffisant ");
        }
    }
    public float avoirSolde(){
        return this.Solde;
    }
    public String avoirInf(){
        String info="Numero de Compte : " + NCompte + "\n CIN : " + CIN + "\n Solde : " + Solde;
        return info;
    }

    public int getNCompte() {
        return NCompte;
    }

    public void setNCompte(int NCompte) {
        this.NCompte = NCompte;
    }

    public float getSolde() {
        return Solde;
    }

    public void setSolde(float solde) {
        Solde = solde;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }
}
