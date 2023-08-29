
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");

        int sum = 0;
        int numberCount = 0;
        int oddNumCount = 0;
        int evenNumCount = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else {
                sum += number;
                numberCount ++;

                if (number % 2 == 0) {
                    evenNumCount++;
                } else {
                    oddNumCount++;
                }
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberCount);

        double average = 1.0 * sum / numberCount;

        System.out.println("Average: " + average);

        System.out.println("Even: " + evenNumCount);
        System.out.println("Odd: " + oddNumCount);
    }
}
