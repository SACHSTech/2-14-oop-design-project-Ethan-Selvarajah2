import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int userChoice = 0;

            String outfieldPlayersCSV = "src/FC_Barcelona_2024-2025_Manual_Data_Entry-Outfield_Players.csv";
            String goalkeepersCSV = "src/FC_Barcelona_2024-2025_Manual_Data_Entry-Goalkeepers.csv";
            String coachCSV = "src/FC_Barcelona_2024-2025_Manual_Data_Entry-Coach.csv";

            Coach coach = CSVReader.readCoach(coachCSV);
            List<OutfieldPlayer> outfieldPlayers = CSVReader.readOutfieldPlayers(outfieldPlayersCSV);
            List<Goalkeeper> goalkeepers = CSVReader.readGoalkeepers(goalkeepersCSV);
            List<Player> players = new ArrayList<>();
            players.addAll(outfieldPlayers);
            players.addAll(goalkeepers);

            Team team = new Team("FC Barcelona", coach, players);

            while (userChoice != 3) {
                System.out.println("FC BARCELONA STATISTICS");
                System.out.println("1. Team Summary");
                System.out.println("2. Sort");
                System.out.println("3. Exit");
                System.out.println("Enter your choice!:");

                try {
                    userChoice = Integer.parseInt(inputReader.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                    continue;
                }

                if (userChoice == 1) {
                    team.displayTeamSummary();
                } else if (userChoice == 2) {
                    System.out.println("Pick a filter to choose from (A, B, C, D, E, F, or G):");
                    System.out.println("A. Position");
                    System.out.println("B. Nationality");
                    System.out.println("C. Saves");
                    System.out.println("D. Assists");
                    System.out.println("E. Goals");
                    System.out.println("F. Shot Accuracy");
                    System.out.println("G. Save Accuracy");
                    String filterChoice = inputReader.readLine();

                    if (filterChoice.equalsIgnoreCase("A")) {
                        filterPosition(inputReader);
                    } else if (filterChoice.equalsIgnoreCase("B")) {
                        filterNationality(inputReader);
                    } else if (filterChoice.equalsIgnoreCase("C")) {
                        filterSaves();
                    } else if (filterChoice.equalsIgnoreCase("D")) {
                        filterAssists();
                    } else if (filterChoice.equalsIgnoreCase("E")) {
                        filterGoals();
                    } else if (filterChoice.equalsIgnoreCase("F")) {
                        filterShotAccuracy();
                    } else if (filterChoice.equalsIgnoreCase("G")) {
                        filterSaveAccuracy();
                    } else {
                        System.out.println("Please enter a valid filter.");
                    }
                } else if (userChoice == 3) {
                    break;
                } else {
                    System.out.println("Invalid input! Please select a number from the list.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error.");
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
        System.out.println(
                "Enter a nationality (Spain, Poland, USA, Hungary, Uruguay, Denmark, France, Netherlands, or Brazil).");
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

    private static void filterSaves() {
        String goalkeepersCSV = "src/FC_Barcelona_2024-2025_Manual_Data_Entry-Goalkeepers.csv";
        try {
            List<Goalkeeper> goalkeepers = CSVReader.readGoalkeepers(goalkeepersCSV);
            goalkeepers.sort(Comparator.comparingInt(Goalkeeper::getSaves).reversed());

            System.out.println("GOALKEEPER SAVES");
            for (int i = 0; i < goalkeepers.size(); i++) {
                Goalkeeper g = goalkeepers.get(i);
                System.out.println(g);
            }
        } catch (IOException e) {
            System.out.println("Error parsing CSV files.");
        }
    }

    private static void filterAssists() {
        String outfieldPlayersCSV = "src/FC_Barcelona_2024-2025_Manual_Data_Entry-Outfield_Players.csv";
        String goalkeepersCSV = "src/FC_Barcelona_2024-2025_Manual_Data_Entry-Goalkeepers.csv";

        try {
            List<OutfieldPlayer> outfieldPlayers = CSVReader.readOutfieldPlayers(outfieldPlayersCSV);
            List<Goalkeeper> goalkeepers = CSVReader.readGoalkeepers(goalkeepersCSV);
            List<Player> allPlayers = new ArrayList<>();
            allPlayers.addAll(goalkeepers);
            allPlayers.addAll(outfieldPlayers);

            System.out.println("PLAYER ASSISTS");
            allPlayers.sort(Comparator.comparingInt(Player::getAssists).reversed());

            for (int i = 0; i < allPlayers.size(); i++) {
                Player p = allPlayers.get(i);
                System.out.println(p);
            }
        } catch (IOException e) {
            System.out.println("Error parsing CSV files.");
        }
    }

    private static void filterGoals() {
        String outfieldPlayersCSV = "src/FC_Barcelona_2024-2025_Manual_Data_Entry-Outfield_Players.csv";

        try {
            List<OutfieldPlayer> outfieldPlayers = CSVReader.readOutfieldPlayers(outfieldPlayersCSV);

            System.out.println("PLAYER GOALS");
            outfieldPlayers.sort(Comparator.comparingInt(OutfieldPlayer::getGoals).reversed());

            for (int i = 0; i < outfieldPlayers.size(); i++) {
                OutfieldPlayer p = outfieldPlayers.get(i);
                System.out.println(p);
            }
        } catch (IOException e) {
            System.out.println("Error parsing CSV files.");
        }
    }

    private static void filterShotAccuracy() {
        String outfieldPlayersCSV = "src/FC_Barcelona_2024-2025_Manual_Data_Entry-Outfield_Players.csv";

        try {
            List<OutfieldPlayer> outfieldPlayers = CSVReader.readOutfieldPlayers(outfieldPlayersCSV);

            System.out.println("PLAYER GOALS");
            outfieldPlayers.sort(Comparator.comparingDouble(OutfieldPlayer::getShotAccuracy).reversed());

            for (int i = 0; i < outfieldPlayers.size(); i++) {
                OutfieldPlayer p = outfieldPlayers.get(i);
                System.out.println(p);
            }
        } catch (IOException e) {
            System.out.println("Error parsing CSV files.");
        }
    }

    private static void filterSaveAccuracy() {
        String goalkeepersCSV = "src/FC_Barcelona_2024-2025_Manual_Data_Entry-Goalkeepers.csv";

        try {
            List<Goalkeeper> goalkeepers = CSVReader.readGoalkeepers(goalkeepersCSV);

            System.out.println("PLAYER GOALS");
            goalkeepers.sort(Comparator.comparingDouble(Goalkeeper::getSaveAccuracy).reversed());

            for (int i = 0; i < goalkeepers.size(); i++) {
                Goalkeeper g = goalkeepers.get(i);
                System.out.println(g);
            }
        } catch (IOException e) {
            System.out.println("Error parsing CSV files.");
        }
    }
}