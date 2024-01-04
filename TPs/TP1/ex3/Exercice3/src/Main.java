import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("write the first number in the series ");
        int number =scanner.nextInt();
        System.out.println(number);
        for (int i=1;i<12;i++){
            System.out.println(number=number*3);
        }
    }
}