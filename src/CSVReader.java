import java.io.*;
import java.util.*;

public class CSVReader {
    public static List<OutfieldPlayer> readOutfieldPlayers(String filename) throws IOException {
        List<OutfieldPlayer> players = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] infoSplit = line.split(",");
                OutfieldPlayer p = new OutfieldPlayer(infoSplit[0], skipBlank(infoSplit[3]), infoSplit[4], skipBlank(infoSplit[5]), infoSplit[6], skipBlank(infoSplit[1]), infoSplit[2], skipBlank(infoSplit[7]), skipBlank(infoSplit[8]), skipBlank(infoSplit[10]), skipBlank(infoSplit[13]), skipBlank(infoSplit[14]), skipBlank(infoSplit[15]), skipBlank(infoSplit[16]), skipBlank(infoSplit[9]), skipBlank(infoSplit[11]), skipBlank(infoSplit[12]));
                players.add(p);
            }
        }
        return players;
    }

    public static List<Goalkeeper> readGoalkeepers(String filename) throws IOException {
        List<Goalkeeper> keepers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader((new FileReader(filename)))) {
            String line = br.readLine();
            while((line = br.readLine()) != null) {
                String[] infoSplit = line.split(",");
                Goalkeeper g = new Goalkeeper(infoSplit[0], skipBlank(infoSplit[3]), infoSplit[4], skipBlank(infoSplit[5]), infoSplit[6], skipBlank(infoSplit[1]), infoSplit[2], skipBlank(infoSplit[7]), skipBlank(infoSplit[8]), skipBlank(infoSplit[11]), skipBlank(infoSplit[12]), skipBlank(infoSplit[13]), skipBlank(infoSplit[14]), skipBlank(infoSplit[15]), skipBlank(infoSplit[9]), skipBlank(infoSplit[10]));
                keepers.add(g);
            }
        }
        return keepers;
    }

    private static int skipBlank(String value) {
        if (value.equals("---")) {
            return 0;
        }
        
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
