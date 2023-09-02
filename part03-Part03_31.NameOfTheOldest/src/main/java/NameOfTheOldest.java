
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = -1;
        String nameOldest = "";

        while (true) {
            String phrase = scanner.nextLine();
            if (phrase.equals("")) {
                break;
            }
            String[] array = phrase.split(",");
            if (Integer.valueOf(array[1]) > oldest) {
                oldest = Integer.valueOf(array[1]);
                nameOldest = array[0];
            }
        }
        System.out.println("Name of the oldest: " + nameOldest);

    }
}
