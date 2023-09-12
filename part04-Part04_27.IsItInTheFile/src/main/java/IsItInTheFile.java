
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ask user for the name of file to be read
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        //ask user for string they are looking for in file
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        // Create an array list to store file contents
        ArrayList<String> list = new ArrayList<>();
        //The program then reads the file and adds it to array list.
        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();
                list.add(row);
            }
        } catch (Exception e) {
        
            //If reading the file fails (the reading ends in an error) the program should print the message "Reading the file " + file + " failed.".
            System.out.println("Reading the file " + file + " failed.");
        }

        //searches for the desired string in Array list.
        //If the string is found, the program should print "Found!". If not, the program should print "Not found."
        if (list.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }     
    }
}
