// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static long puissance (long x , int n){
        if(n==0){
            if(x>=0) {
                return 1;
            } else {
                return -1;
            }
        }
        else if(n>0){
            if(x==0){
                return 0;
            }
            else {
                for(int i=1;i<n;i++){
                    x*=x;
                }
                return x;
            }
        }
        else return -1;
    }
    public static void main(String[] args) {
        System.out.println(puissance(4,2));
    }
}