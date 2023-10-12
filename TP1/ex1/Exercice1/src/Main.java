import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.printf("The number %d is positive and ", number);
            if (number % 2 == 0)
                System.out.println("even.");
            else
                System.out.println("odd.");
        } else if (number < 0) {
            System.out.printf("The number %d is negative and ", number);
            if (number % 2 == 0)
                System.out.println("even.");
            else
                System.out.println("odd.");
        } else {
            System.out.println("The number you entered is 0.");
        }
    }
}
