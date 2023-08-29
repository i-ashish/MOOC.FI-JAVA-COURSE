

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    public static void printFromNumberToOne(int number) {
        int end = 1;
        while (number >= end) {
            System.out.println(number);
            number--;
        }
    }

}
