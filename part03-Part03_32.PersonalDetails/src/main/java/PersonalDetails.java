
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenLongestName = -1;
        String longestName = "";
        int sum = 0;
        int count = 0;

        while (true) {
            String phrase = scanner.nextLine();

            if (phrase.equals("")) {
                break;
            }
            String[] array = phrase.split(",");

            if (array[0].length() > lenLongestName ) {
                lenLongestName = array[0].length();
                longestName = array[0];
            }
            sum += Integer.valueOf(array[1]);
            count ++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));
    }
}
