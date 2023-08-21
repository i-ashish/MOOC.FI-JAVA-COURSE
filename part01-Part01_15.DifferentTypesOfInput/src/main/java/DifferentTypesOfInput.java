
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String my_string = scan.nextLine();
        System.out.println("Give an integer:");
        Integer my_Integer = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double my_double = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean my_bool = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + my_string);
        System.out.println("You gave the integer " + my_Integer);
        System.out.println("You gave the double " + my_double);
        System.out.println("You gave the boolean " + my_bool);

    }
}
