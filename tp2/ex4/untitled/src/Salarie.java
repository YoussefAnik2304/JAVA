import java.util.*;
public class Salarie extends Personne{
    private float Salaire;
    Salarie(String Nom,int Enfant ,float Salaire){
        super(Nom,Enfant);
        this.Salaire=Salaire;
    }
    public String getInf(){
        String infos="Nom : "+ Nom + "\nNombre d'enfants : "+ Enfant + "\nSalaire : "+ Salaire;
        return infos;
    }
    public float getSalaire(){
        return Salaire;
    }
    public float getPrime(){
        float prime ;
        if(Enfant!=0){
            prime=(5*Enfant*Salaire)/100;
        }
        else  prime=(5*Salaire)/100;
        return prime;
    }
}
