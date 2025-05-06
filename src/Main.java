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
                System.out.println("2. Sort");
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
                } else if (userChoice == 2) {
                    String filterChoice = "";
                    System.out.println("Pick a filter to choose from:");
                    System.out.println("Position");
                    System.out.println("Nationality");
                    System.out.println("Saves");
                    System.out.println("Assists");
                    System.out.println("Goals");
                    System.out.println("Shot Accuracy");
                    System.out.println("Save Accuracy");
                    if (filterChoice.equals("Position")) {
                        String positionChoice = "";
                        String outfieldPlayersCSV = "src/FC_Barcelona_2024-2025_Manual_Data_Entry-Outfield_Players.csv";
                        String goalkeepersCSV = "src/FC_Barcelona_2024-2025_Manual_Data_Entry-Goalkeepers.csv";
                        List<OutfieldPlayer> outfieldPlayers = CSVReader.readOutfieldPlayers(outfieldPlayersCSV);
                        List<Goalkeeper> goalkeepers = CSVReader.readGoalkeepers(goalkeepersCSV);

                        if (positionChoice.equals("Goalkeeper")) {
                            for (int i = 0; i < goalkeepers.size(); i++) {
                            Goalkeeper g = goalkeepers.get(i);
                            System.out.println(g);
                            System.out.println("");
                        }
                        } else if (positionChoice.equals("Defender")) {
                            
                        } else if (positionChoice.equals("Midfielder")) {

                        } else if (positionChoice.equals("Forward")) {

                        } else {
                            System.out.println("Please enter a valid position.");
                        }
                    } else if (filterChoice.equals("Nationality")) {
                        String nationalityChoice = "";
                        if (nationalityChoice.equals("Germany")) {

                        } else if (nationalityChoice.equals("Spain")) {

                        } else if (nationalityChoice.equals("Poland")) {

                        } else if (nationalityChoice.equals("USA")) {

                        } else if (nationalityChoice.equals("Hungary")) {

                        } else if (nationalityChoice.equals("Uruguay")) {

                        } else if (nationalityChoice.equals("Denmark")) {

                        } else if (nationalityChoice.equals("France")) {

                        } else if (nationalityChoice.equals("Netherlands")) {

                        } else if (nationalityChoice.equals("Brazil")) {

                        } else {
                            System.out.println("No player on FC Barcelona is of this nationality.");
                        }
                    } else if (filterChoice.equals("Saves")) {
                        
                    } else if (filterChoice.equals("Assists")) {

                    } else if (filterChoice.equals("Goals")) {

                    } else if (filterChoice.equals("Shot Accuracy")) {

                    } else if (filterChoice.equals("Save Accuracy")) {

                    } else {
                        System.out.println("Please enter a valid filter.");
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
