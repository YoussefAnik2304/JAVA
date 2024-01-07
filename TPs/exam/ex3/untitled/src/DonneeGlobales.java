import java.util.HashMap;
import java.util.Map;

public class DonneeGlobales {
    HashMap<NumeroTelephone,DonneeAbonnement> donneG;

    public DonneeGlobales(){
        this.donneG=new HashMap<>();
    }
    public void nouveauNumero(NumeroTelephone num){
        if(donneG!=null) {
            if (donneG.containsKey(num)) {
                System.out.println("already exists : " + num.getNumber());
            }
        }
    }

    public HashMap<NumeroTelephone, DonneeAbonnement> getDonneG() {
        return donneG;
    }

    public void setDonneG(HashMap<NumeroTelephone, DonneeAbonnement> donneG) {
        this.donneG = donneG;
    }

    public void nouveauAppel(NumeroTelephone num , int appel){
        if(donneG.containsKey(num)){
            DonneeAbonnement d=donneG.get(num);
            d.setNbAppels(d.getNbAppels()+1);
            d.setDureeAppels(d.getDureeAppels()+appel);
            donneG.put(num,d);
        }
    }
    public int nombreMoyenDeSMS(){
        int nbr_sms=0;
        int nbr_tel=0;
        for (Map.Entry<NumeroTelephone, DonneeAbonnement> entry : donneG.entrySet()) {
            nbr_tel++;
            DonneeAbonnement donneeAbonnement = entry.getValue();
            nbr_sms += donneeAbonnement.getNbrSms();
        }

        return nbr_tel == 0 ? 0 : nbr_sms / nbr_tel;
    }
}
