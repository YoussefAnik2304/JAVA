public class EntNat {
    private int entier;
    EntNat(int n ) throws ErrConst{
            if(n>0)
                entier=n;
            else throw new ErrConst("la valeur donnee au constuctor est negative : ",n);
    }

    public int getEntier() {
        return entier;
    }

    public void setEntier(int entier) throws ErrModif {
        if(entier>0)
            this.entier = entier;
        else throw new ErrModif("la nouvelle valeur est negative ",entier);
    }
    public void decremente() throws ErrModif{
        if(entier>0)
            entier--;
        else throw new ErrModif("l'entier de la classe est null ", entier);
    }
    public static void decrmente(EntNat n)throws ErrModif{
        n.decremente();
    }

}
class ErrNat extends Exception{
    int negative ;
    ErrNat(String message,int n){
        super(message+n);
        negative=n;
    }
}
class ErrConst extends ErrNat{
    ErrConst(String message,int n){
        super(message, n);
    }
}
class ErrModif extends ErrNat{
    ErrModif(String message,int n){
        super(message, n);
    }
}
