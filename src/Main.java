import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int userChoice = 0;
            while (userChoice != 5) {
                System.out.println("FC BARCELONA STATISTICS");
                System.out.println("1. Team Summary");
                System.out.println("5. Exit");
                System.out.println("Enter your choice!:");
                userChoice = Integer.parseInt(inputReader.readLine());

                if (userChoice == 1) {
                    try {
                        String outfieldPlayersCSV = "src/FC_Barcelona_2024-2025_Manual_Data_Entry-Outfield_Players.csv";
                        String goalkeepersCSV = "src/FC_Barcelona_2024-2025_Manual_Data_Entry-Goalkeepers.csv";
            
                        List<OutfieldPlayer> outfieldPlayers = CSVReader.readOutfieldPlayers(outfieldPlayersCSV);
                        List<Goalkeeper> goalkeepers = CSVReader.readGoalkeepers(goalkeepersCSV);
            
                        System.out.println("------------------------------");
                        System.out.println("**OUTFIELD PLAYERS**");
                        System.out.println("------------------------------");
                        for (int i = 0; i < outfieldPlayers.size(); i++) {
                            OutfieldPlayer p = outfieldPlayers.get(i);
                            System.out.println(p);
                            System.out.println("");
                        }
            
                        System.out.println("------------------------------");
                        System.out.println("**GOALKEEPERS**");
                        System.out.println("------------------------------");
                        for (int i = 0; i < goalkeepers.size(); i++) {
                            Goalkeeper g = goalkeepers.get(i);
                            System.out.println(g);
                            System.out.println("");
                        }
                    } catch (IOException e) {
                        System.out.println("Error.");
                    }
                } else if (userChoice == 5) {
                    break;
                } else {
                    System.out.println("Invalid input! Please select a number from the list.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error.");
        }
    }
}
