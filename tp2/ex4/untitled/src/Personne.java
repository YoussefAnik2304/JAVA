import java.util.*;
public class Personne {
    protected String Nom;
    protected int Enfant;
    Personne(String Nom , int Enfant){
        this.Enfant=Enfant;
        this.Nom=Nom;
    }
    public String getNom(){
        return this.Nom;
    }
}
