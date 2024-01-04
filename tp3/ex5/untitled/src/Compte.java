public class Compte {
    protected String nom;
    protected String prenom;
    protected int solde;
    protected String motDePass;

    public Compte(String nom, String prenom, int solde, String motDePass) {
        this.nom = nom;
        this.prenom = prenom;
        this.solde = solde;
        this.motDePass = motDePass;
    }
    public void depot(int somme){
        solde+=somme;
    }
    public void retrait (int somme ,String pass)throws CodeIncorrect,retraitInterdit{
        if(!motDePass.equals(pass)){
            if(solde>somme){
                solde-=somme;
            }
            else throw new retraitInterdit("solde insuffisant pour faire ce retrait votre solde est :"+solde);
        }
        else throw new CodeIncorrect("mot de pass incorrect ",pass);
    }

}
class CodeIncorrect extends Exception{
    CodeIncorrect(String message ,String pass_incorrect){
        super(message+pass_incorrect);
    }
}
class retraitInterdit extends Exception{
    retraitInterdit(String message  ){
        super(message );
    }
}
class CompteAvecDecouvert extends Compte {
    private int decouvertAutorise;

    public CompteAvecDecouvert(String unNom, String unPrenom, int s, String unMot, int decouvert) {
        super(unNom, unPrenom, s, unMot);
        decouvertAutorise = decouvert;
    }

    @Override
    public void retrait(int somme, String unMot) throws CodeIncorrect, retraitInterdit {
        if (!motDePass.equals(unMot)) {
            throw new CodeIncorrect("Code incorrect",unMot);
        }

        if ((somme > solde) && (somme<decouvertAutorise))
            throw new retraitInterdit("Retrait non autorisé (dépassement du découvert autorisé)");

        solde -= somme;
    }
}
