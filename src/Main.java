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

                try {
                    userChoice = Integer.parseInt(inputReader.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                    continue;
                }

                if (userChoice == 1) {
                    displayTeamSummary();
                } else if (userChoice == 2) {
                    System.out.println("Pick a filter to choose from:");
                    System.out.println("Position");
                    System.out.println("Nationality");
                    System.out.println("Saves");
                    System.out.println("Assists");
                    System.out.println("Goals");
                    System.out.println("Shot Accuracy");
                    System.out.println("Save Accuracy");
                    String filterChoice = inputReader.readLine();

                    if (filterChoice.equals("Position")) {
                        filterPosition(inputReader);
                    } else if (filterChoice.equals("Nationality")) {
                        filterNationality(inputReader);
                    } else if (filterChoice.equals("Saves")) {
                        System.out.println("Test");
                    } else if (filterChoice.equals("Assists")) {
                        System.out.println("Test");
                    } else if (filterChoice.equals("Goals")) {
                        System.out.println("Test");
                    } else if (filterChoice.equals("Shot Accuracy")) {
                        System.out.println("Test");
                    } else if (filterChoice.equals("Save Accuracy")) {
                        System.out.println("Test");
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

    private static void displayTeamSummary() {
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
            System.out.println("Error parsing the CSVC files.");
        }
    }

    private static void filterPosition(BufferedReader inputReader) throws IOException {
        System.out.println("Select a player position: Goalkeeper, Defender, Forward, Midfield.");
        String positionChoice = inputReader.readLine();

        String outfieldPlayersCSV = "src/FC_Barcelona_2024-2025_Manual_Data_Entry-Outfield_Players.csv";
        String goalkeepersCSV = "src/FC_Barcelona_2024-2025_Manual_Data_Entry-Goalkeepers.csv";

        try {
            List<OutfieldPlayer> outfieldPlayers = CSVReader.readOutfieldPlayers(outfieldPlayersCSV);
            List<Goalkeeper> goalkeepers = CSVReader.readGoalkeepers(goalkeepersCSV);

            if (positionChoice.equals("Goalkeeper")) {
                for (int i = 0; i < goalkeepers.size(); i++) {
                    Goalkeeper g = goalkeepers.get(i);
                    System.out.println(g);
                }
            } else {
                for (int i = 0; i < outfieldPlayers.size(); i++) {
                    OutfieldPlayer p = outfieldPlayers.get(i);
                    if (p.getPosition().equals(positionChoice)) {
                        System.out.println(p);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error parsing the CSV files.");
        }
    }

    private static void filterNationality(BufferedReader inputReader) throws IOException {
            System.out.println("Enter a nationality.");
            String nationalityChoice = inputReader.readLine();

            String outfieldPlayersCSV = "src/FC_Barcelona_2024-2025_Manual_Data_Entry-Outfield_Players.csv";
            String goalkeepersCSV = "src/FC_Barcelona_2024-2025_Manual_Data_Entry-Goalkeepers.csv";

            boolean hasNationality = false;

            try {
                List<OutfieldPlayer> outfieldPlayers = CSVReader.readOutfieldPlayers(outfieldPlayersCSV);
                List<Goalkeeper> goalkeepers = CSVReader.readGoalkeepers(goalkeepersCSV);

                for (int i = 0; i < outfieldPlayers.size(); i++) {
                    OutfieldPlayer p = outfieldPlayers.get(i);
                    if (p.getNationality().equals(nationalityChoice)) {
                        System.out.println(p);
                        hasNationality = true;
                    }
                }
    
                for (int i = 0; i < goalkeepers.size(); i++) {
                    Goalkeeper g = goalkeepers.get(i);
                    if (g.getNationality().equals(nationalityChoice)) {
                        System.out.println(g);
                        hasNationality = true;
                    }
                }
    
                if (!hasNationality) {
                    System.out.println("No players have the nationality of " + nationalityChoice + ".");
                }
        } catch (IOException e) {
            System.out.println("Error parsing CSV files.");
        }
    }
}