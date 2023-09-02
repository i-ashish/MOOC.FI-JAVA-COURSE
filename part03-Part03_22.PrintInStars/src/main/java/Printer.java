
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int number : array) {
            int index = 0;
            while (index < number) {
                System.out.print("*");
                index++;
            }
            System.out.println("");
        }
    }
}
