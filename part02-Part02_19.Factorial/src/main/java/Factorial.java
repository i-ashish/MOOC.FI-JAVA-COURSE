
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());

        int product = 1;

        for (int start=1; start <= number; start++) {
            product = product * start;
        }

        System.out.println("Factorial: " + product );

    }
}
