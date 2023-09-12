
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //prompts the user for a filename
        System.out.println("File:");
        String file = scan.nextLine();

        ArrayList<String> gameRecords = readRecordsFromFile(file);

        //array list to store team objects
        ArrayList<Team> teams = new ArrayList<>();

        
        for (String row : gameRecords) {
            
            String[] parts = row.split(",");
            
            String name1 = parts[0];
            String name2 = parts[1];
            int score1 = Integer.valueOf(parts[2]);
            int score2 = Integer.valueOf(parts[3]);
            
            if (teams.size() == 0) {
                Team object1 = new Team(name1);
                teams.add(object1);
                object1.played(score1>score2);

                Team object2 = new Team(name1);
                teams.add(object2);
                object2.played(score2>score1);
            }

            for (Team team : teams ) {
                if (!name1.equals(team.getName())) {
                    Team object = new Team(name1);
                    teams.add(object);
                    object.played(score1>score2);
                } else {
                    team.played(score1>score2);
                }
                
                if (!name2.equals(team.getName())){
                    Team objects = new Team(name1);
                    teams.add(objects);
                    objects.played(score2>score1);
                } else {
                    team.played(score2>score1);
                }
            }      
        }

        //prints the data specified in the following parts for that team.
        System.out.println("Name:");
        String name = scan.nextLine();
        
        for (Team items : teams) {
            if (name.equals(items.getName())) {    
                System.out.println(items);            
            } 
        }
    }
        
        
    
    
    public static ArrayList<String> readRecordsFromFile(String file) {
        
        ArrayList<String> gamesData = new ArrayList<>();
        
        //reads the match statistics from the file. 
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                gamesData.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return gamesData;
    }
}


//who won if statement 1 or 2
//if 1 won
    //if 1 object exists
        //update score1
        //update playes for 2
        //update loss for 2
    //else
        //create object and update score1
        //update playes for 2
        //update loss for 2
// else if 2 won
    // if 2 object exists?
        //update score
    //else
        //create object and update score