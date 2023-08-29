
import java.util.Scanner;

public class AverageOfNumbers {

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
        double average = numberSum * 1.0 / numberCount;
        System.out.println("Average of the numbers: " + average);
    }
}
