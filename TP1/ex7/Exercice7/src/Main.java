// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static boolean is_primary(int n ){
        for (int i=2;i<n/2;i++)
            if(n%i==0)return false ;
        return true ;
    }
    public static void main(String[] args) {
        System.out.println(is_primary(12));

    }
}