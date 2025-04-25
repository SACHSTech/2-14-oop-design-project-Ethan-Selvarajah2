import java.util.*;
import java.io.*;

public class Main {
    try {
        BufferedReader fileReader = new BufferedReader(new FileReader("src/2024_Ontario_Provincial_Championship_Match_Stats.csv"));
        String line = fileReader.readLine();
        while (line != null) {
            String[] infoPortions = line.split(",");
            int totalNP = Integer.parseInt(infoPortions[0]);
            int totalAutoPoints = Integer.parseInt(infoPortions[1]);
            int totalDriverPoints = Integer.parseInt(infoPortions[2]);
            int sampleAutoPoints = Integer.parseInt(infoPortions[3]);
            int specimenAutoPoints = Integer.parseInt(infoPortions[4]);;
            int sampleDriverPoints = Integer.parseInt(infoPortions[5]);;
            int specimentDriverPoints = Integer.parseInt(infoPortions[6]);;
            int team1 = Integer.parseInt(infoPortions[7]);;
            int team2 = Integer.parseInt(infoPortions[8]);;
            String match;
            String alliance;
        }
    }
}