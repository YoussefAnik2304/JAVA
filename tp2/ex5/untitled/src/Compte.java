public class Compte {
    private int NCompte ;
    private float Solde;
    Compte(int NCompte,float Solde){
        this.NCompte=NCompte;
        this.Solde=Solde;
    }
    public String getInf(){
        String infos="NCompte : "+ NCompte + "\nSolde : " +Solde;
        return infos;
    }

}
}
