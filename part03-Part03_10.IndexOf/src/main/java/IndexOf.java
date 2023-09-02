
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.print("Search for? ");
        int search = Integer.valueOf(scanner.nextLine());

        searchList(list, search);

        // implement here finding the indices of a number
    }

    public static void searchList(ArrayList<Integer> list, int search) {
        int index = 0;
        for (int number : list) {
            if (number == search) {
                System.out.println(search + " is at index " + index);
            }
            index++ ;
        }
    }
}
