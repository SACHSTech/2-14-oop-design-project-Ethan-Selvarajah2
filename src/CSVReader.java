import java.io.*;
import java.util.*;

public class CSVReader {
    public static List<Match> loadMatches(String filename) {
        List<Match> matches = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();

            while ((line = br.readLine()) != null) {
                String[] infoSplit = line.split(",");
                int totalNP = Integer.parseInt(infoSplit[0]);
                int autoPoints = Integer.parseInt(infoSplit[1]);
                int driverPoints = Integer.parseInt(infoSplit[2]);
                int autoSample = Integer.parseInt(infoSplit[3]);
                int autoSpeci = Integer.parseInt(infoSplit[4]);
                int driverSample = Integer.parseInt(infoSplit[5]);
                int driverSpeci = Integer.parseInt(infoSplit[6]);
                int team1 = Integer.parseInt(infoSplit[7]);
                int team2 = Integer.parseInt(infoSplit[8]);
                String matchNum = infoSplit[9];
                String alliance = infoSplit[10];
                int[] redAlliance = new int[2];
                int[] blueAlliance = new int[2];
                int redScore = 0;
                int blueScore = 0;
                int redPenalty = 0;
                int bluePenalty = 0;

                if (alliance.equals("Red")) {
                    redAlliance[0] = team1;
                    redAlliance[1] = team2;
                    redScore = totalNP;
                } else {
                    blueAlliance[1] = team1;
                    blueAlliance[2] = team2;
                    blueScore = totalNP;
                }
            }
        }
    }
}
