import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("write the size :");
        Scanner scanner =new Scanner(System.in);
        int size= scanner.nextInt();
        for (int i=0;i<size;i++){
            for (int j=0;j<i+1;j++)
            System.out.print("*");
            System.out.println();
        }
    }
}