/**
 * Represents the goalkeepers on the soccer team
 */
public class Goalkeeper extends Player {
    private int saves;
    private int goalsAllowed;

    /**
     * Creates the goalkeeper object with parameters
     * @param name player name
     * @param age player age
     * @param height player height
     * @param weight player weight
     * @param nationality player nationality
     * @param playerNumber player number
     * @param position player position
     * @param appearances player appearances
     * @param substitutions player substitutions
     * @param assists player assists
     * @param foulsComitted fouls committed by player
     * @param foulsSuffered fouls received by player
     * @param yellowCard yellow cards received by player
     * @param redCard red cards received by player
     * @param saves saves from player
     * @param goalsAllowed goals conceded by player
     */
    public Goalkeeper(String name, int age, String height, int weight, String nationality, int playerNumber, String position, int appearances, int substitutions, int assists, int foulsComitted, int foulsSuffered, int yellowCard, int redCard, int saves, int goalsAllowed) {
        super(name, age, height, weight, nationality, playerNumber, position, appearances, substitutions, assists, foulsComitted, foulsSuffered, yellowCard, redCard);
        this.saves = saves;
        this.goalsAllowed = goalsAllowed;
    }

    /**
     * Retrieves the saves
     * @return the saves
     */
    public int getSaves() {
        return saves;
    }

    /**
     * Retrieves the number of goals conceded
     * @return goals conceded
     */
    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    /**
     * Calculates and retrieves the save accuracy
     * @return save accuracy
     */
    public double getSaveAccuracy() {
        if (saves + goalsAllowed == 0) {
            return 0.0;
        } else {
            return (double) saves / (saves + goalsAllowed) * 100.0;
        }
    }

    /**
     * Format and return the information of a goalkeeper
     */
    public String toString() {
        return "Player: " + getName() + " (#" + getPlayerNumber() + ")\nPosition: " + getPosition() + " | Age: " + getAge() + " | Height: " + getHeight() + " | Weight: " + getWeight() + " lbs | Nationality: " + getNationality() + " | Appearances: " + getAppearances() + " | Substitutions: " + getSubstitutions() + " | Assists: " + getAssists() + " | Fouls Committed: " + getFoulsComitted() + " | Fouls Suffered: " + getFoulsSuffered() + " | Yellow Card Count: " + getYellowCard() + " | Red Card Count: " + getRedCard() + " | Saves: " + getSaves() + " | Goals Allowed: " + getGoalsAllowed() + " | Save Accuracy: " + getSaveAccuracy() + "%";
    }
}
