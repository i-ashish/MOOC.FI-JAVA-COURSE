
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberCount = 0;
        int numberSum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else {
                numberCount += 1;
                numberSum += number;
                continue;
            }
        }
        System.out.println("Number of numbers: " + numberCount);
        System.out.println("Sum of the numbers: " + numberSum);
    }
}
