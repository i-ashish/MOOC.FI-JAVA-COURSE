
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while (true) {
            String phrase = scanner.nextLine();

            if (phrase.equals("")) {
                break;
            }
            list.add(phrase);
        }
        int oldest = ageOfOldest(list);
        System.out.println("Age of the oldest: " + oldest);
    }

    public static Integer ageOfOldest(ArrayList<String> list) {
        int oldeset = 0;
        for (String items : list) {
            String[] array = items.split(",");
            
            if (Integer.valueOf(array[1]) > oldeset) {
                oldeset = Integer.valueOf(array[1]);
            }
        }
        return oldeset;
    }
    
}