
import java.nio.file.Paths;
import java.util.Scanner;
//import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompts the user for a filename, 
        System.out.print("File? ");
        String file = scanner.nextLine();

        // prompts the user for the upper and lower bounds for the accepted range of numbers. 
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;
        //read the numbers contained in file
        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            // the program reads the numbers contained in the file (each number is on its own line) and only accounts for the numbers which are inside the given range.
            while (scanFile.hasNextLine()) {
                int num = Integer.valueOf(scanFile.nextLine());
                if (lowerBound <= num && num <= upperBound) {
                    // Traverse through each line in file if number is in bound, increase the count
                    count ++ ;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        // the program should print the number of numbers that were inside the given range.
        System.out.println("Numbers: " + count);
    }

}
