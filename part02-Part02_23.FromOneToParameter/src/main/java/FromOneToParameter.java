

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {
        int start = 1;

        while (start <= number) {
            System.out.println(start);
            start++ ;

        }
    }

}
