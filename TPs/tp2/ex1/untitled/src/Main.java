public class Main {

    public static void main(String[] args) {

        Banque b=new Banque(1,5000,"AB1200");
        System.out.println(b.avoirInf());
        System.out.println(b.avoirSolde());
        b.deposer(500);
        System.out.println(b.avoirInf());
        System.out.println(b.avoirSolde());
        b.retire(200);
        System.out.println(b.avoirInf());
        System.out.println(b.avoirSolde());
    }
}