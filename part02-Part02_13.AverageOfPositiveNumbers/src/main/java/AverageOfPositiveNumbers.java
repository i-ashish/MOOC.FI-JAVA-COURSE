
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveNumCount = 0;
        int positiveNumSum = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number > 0) {
                positiveNumCount += 1;
                positiveNumSum += number;
                continue;
            }
        }

        if (positiveNumCount <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double positiveNumAverage = positiveNumSum * 1.0 / positiveNumCount;
            System.out.println(positiveNumAverage);
        }
        
    }
}
