
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i<number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 1;
        while (i <= size) {
            printSpaces(size-i);
            printStars(i);
            i++;
        }

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 1;
        int j = 1;
        while (i <= height) {
            printSpaces(height - i);
            printStars(j);
            i++;
            j += 2;
        }
        treeBase(height);
    }

    public static void treeBase(int height) {
        int i = 1;
        while (i <= 2) {
            printSpaces(height-2);
            printStars(3);
            i++;
        }
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        // printTriangle(1);
        // System.out.println("---");
        // printTriangle(4);
        // System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(9);
    }
}
