import java.io.*;
import java.util.*;

public class CSVReader {
    public static List<OutfieldPlayer> readOutfieldPlayers(String filename) throws IOException {
        List<OutfieldPlayer> players = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] infoSplit = line.split(",");
                OutfieldPlayer p = new OutfieldPlayer(infoSplit[0], Integer.parseInt(infoSplit[3]), infoSplit[4], Integer.parseInt(infoSplit[5]), infoSplit[6], Integer.parseInt(infoSplit[1]), infoSplit[2], Integer.parseInt(infoSplit[7]), Integer.parseInt(infoSplit[8]), Integer.parseInt(infoSplit[10]), Integer.parseInt(infoSplit[13]), Integer.parseInt(infoSplit[14]), Integer.parseInt(infoSplit[15]), Integer.parseInt(infoSplit[16]), Integer.parseInt(infoSplit[9]), Integer.parseInt(infoSplit[11]), Integer.parseInt(infoSplit[12]));
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
                Goalkeeper g = new Goalkeeper(infoSplit[0], Integer.parseInt(infoSplit[3]), infoSplit[4], Integer.parseInt(infoSplit[5]), infoSplit[6], Integer.parseInt(infoSplit[1]), infoSplit[2], Integer.parseInt(infoSplit[7]), Integer.parseInt(infoSplit[8]), Integer.parseInt(infoSplit[11]), Integer.parseInt(infoSplit[12]), Integer.parseInt(infoSplit[13]), Integer.parseInt(infoSplit[14]), Integer.parseInt(infoSplit[15]), Integer.parseInt(infoSplit[9]), Integer.parseInt(infoSplit[10]));
                keepers.add(g);
            }
        }
        return keepers;
    }
}
