import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random r=new Random();
        int number =r.nextInt(10);
        Scanner scanner=new Scanner(System.in);
        boolean win=false ;
        while(!win){
            System.out.println("Enter your guess : ");
            int x=scanner.nextInt();
            if(x < number){
                System.out.println("number  is small try again ");
            }
            else if(x > number ){
                System.out.println("numer is big try again ");
            }
            else {
                System.out.println("you win ");
                win =true;
            }
        }
    }
}