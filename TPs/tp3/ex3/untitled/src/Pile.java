public class Pile {
    private final static int taille = 10;
    private Object[] pile;
    private int pos;

    public Pile() {
        pile = new Object[taille];
        pos = 0;
    }

    public void empiler(Object obj) throws PilePleine {
        if (pos < taille) {
            pile[pos++] = obj;

        } else {
            throw new PilePleine("La pile est pleine.");
        }
    }

    public Object depiler() throws PileVide {
        if (pos > 0) {
            pos--;
            return pile[pos];
        } else {
            throw new PileVide("La pile est vide.");
        }
    }

    public static void main(String[] args) {
        Pile pile = new Pile();
        try {
            for (int i = 0; i < taille + 1; i++) {
                pile.empiler(i);
            }
        } catch (PilePleine e) {
            System.out.println(e.getMessage());
        }

        try {
            for (int i = 0; i < taille + 1; i++) {
                System.out.println(pile.depiler());
            }
        } catch (PileVide e) {
            System.out.println(e.getMessage());
        }
    }
}

class PilePleine extends ArrayIndexOutOfBoundsException {
    public PilePleine(String message) {
        super(message);
    }
}

class PileVide extends ArrayIndexOutOfBoundsException {
    public PileVide(String message) {
        super(message);
    }
}
