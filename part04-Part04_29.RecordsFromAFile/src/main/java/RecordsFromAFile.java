
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompts the user for the name of the file they want to read.
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        //traverse through the file and print the output in required format
        try (Scanner scan = new Scanner(Paths.get(file))){
            while (scan.hasNextLine()) {
                String row = scan.nextLine();

                String[] parts = row.split(",");
                int age = Integer.valueOf(parts[1]);
                if (age == 1) {
                    System.out.println(parts[0] + ", age: " + age + " year");    
                } else {
                    System.out.println(parts[0] + ", age: " + parts[1] + " years");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }
}
