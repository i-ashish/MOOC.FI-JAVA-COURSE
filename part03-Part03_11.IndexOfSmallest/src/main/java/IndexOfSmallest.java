
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }
            list.add(number);
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = list.get(0);

        // loop to find smallest number in list
        for (int item : list) {
            if (item < smallest) {
                smallest = item;
            }
        }
        // print smallest number
        System.out.println("Smallest number: " + smallest);

        //iterate through loop to find all the indexes of smallest number
        int index = 0;
        for (int num : list) {
            if (num == smallest) {
                System.out.println("Found at index: " + index);
            }
            index++;
        }
    }
}
