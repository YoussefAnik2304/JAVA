public class Main {
    public static void main(String[] args) {

        try{
            EntNat t=new EntNat(3);
            System.out.println(t.getEntier());
            t.setEntier(2);
            System.out.println(t.getEntier());
            t.decremente();
            System.out.println(t.getEntier());
            t.decremente();
            System.out.println(t.getEntier());
            t.decremente();
            System.out.println(t.getEntier());
            t.decremente();
            System.out.println(t.getEntier());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}