import java.io.*;
import java.util.*;

/**
 * Reads the data from the three CSV files: outfield player, goalkeeper, and coach
 */
public class CSVReader {
    /**
     * Reads a list of outfield players from a CSV file
     * @param filename name and path to the CSV file for outfield players
     * @return list of outfield player objects
     * @throws IOException
     */
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

    /**
     * Readsa a list of goalkeepers from a CSV file
     * @param filename name and path to the CSV file for goalkeepers
     * @return list of goalkeeper objects
     * @throws IOException
     */
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

    /**
     * Reads a singular coach from a CSV file
     * @param filename name and path to the CSV file for the coach
     * @return coach object
     * @throws IOException
     */
    public static Coach readCoach(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader((new FileReader(filename)))) {
            String line = br.readLine();
            line = br.readLine();

            if (line != null) {
                String[] infoSplit = line.split(",");
                Coach c = new Coach(infoSplit[0], skipBlank(infoSplit[1]), infoSplit[2], skipBlank(infoSplit[3]), infoSplit[4], Double.parseDouble(infoSplit[5]), infoSplit[6], skipBlank(infoSplit[7]), skipBlank(infoSplit[8]), skipBlank(infoSplit[9]));
                return c;
            }
        }
        return null;
    }

    /**
     * Converts a string to an integer and specially reads values of "---"
     * @param value the string to be converted
     * @return integer value, or 0 if the value of "---" is read
     */
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
