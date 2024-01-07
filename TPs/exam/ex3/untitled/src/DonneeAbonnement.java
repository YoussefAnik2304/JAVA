public class DonneeAbonnement {
    int nbAppels;
    int dureeAppels;
    int nbrSms;

    public DonneeAbonnement(int nbAppels, int dureeAppels, int nbrSms) {
        this.nbAppels = nbAppels;
        this.dureeAppels = dureeAppels;
        this.nbrSms = nbrSms;
    }

    public int getNbAppels() {
        return nbAppels;
    }

    public void setNbAppels(int nbAppels) {
        this.nbAppels = nbAppels;
    }

    public int getDureeAppels() {
        return dureeAppels;
    }

    public void setDureeAppels(int dureeAppels) {
        this.dureeAppels = dureeAppels;
    }

    public int getNbrSms() {
        return nbrSms;
    }

    public void setNbrSms(int nbrSms) {
        this.nbrSms = nbrSms;
    }
}
