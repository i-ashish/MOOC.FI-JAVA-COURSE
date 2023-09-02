import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String phrase = scanner.nextLine();

            if (!phrase.equals("")) {
                String[] pieces = phrase.split(" ");
              
                for (String piece : pieces) {
                    System.out.println(piece);
                }
            } else {
                break;
            }
    
        }
    }
}
