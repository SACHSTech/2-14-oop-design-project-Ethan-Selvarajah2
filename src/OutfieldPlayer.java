/**
 * Represents the outfield players (so non-goalkeepers) on the soccer team
 */
public class OutfieldPlayer extends Player {
    private int goals;
    private int totalShots;
    private int shotsOnTarget;

    /**
     * Creates the outfield player object with parameters
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
     * @param foulsComitted fouls comitted by player
     * @param foulsSuffered fouls suffered by player
     * @param yellowCard yellow cards received by player
     * @param redCard red cards received by player
     * @param goals goals received by player
     * @param totalShots total shots from player
     * @param shotsOnTarget total shots on target from player
     */
    public OutfieldPlayer(String name, int age, String height, int weight, String nationality, int playerNumber, String position, int appearances, int substitutions, int assists, int foulsComitted, int foulsSuffered, int yellowCard, int redCard, int goals, int totalShots, int shotsOnTarget) {
        super(name, age, height, weight, nationality, playerNumber, position, appearances, substitutions, assists, foulsComitted, foulsSuffered, yellowCard, redCard);
        this.goals = goals;
        this.totalShots = totalShots;
        this.shotsOnTarget = shotsOnTarget;
    }

    /**
     * Retrieve the goals
     * @return the goals
     */
    public int getGoals() {
        return goals;
    }

    /**
     * Retrieve the total number of shots
     * @return total shots
     */
    public int getTotalShots() {
        return totalShots;
    }

    /**
     * Retrieve the number of shots on target
     * @return total shots on goal
     */
    public int getShotsOnTarget() {
        return shotsOnTarget;
    }

    /**
     * Calculates and retrieves the accuracy of shots
     * @return the shot accuracy
     */
    public double getShotAccuracy() {
        if (totalShots == 0) {
            return 0.0;
        } else {
            return (double) shotsOnTarget / totalShots * 100.0;
        }
        
    }

    /**
     * Format and return the information of an outfield player
     */
    public String toString() {
        return "Player: " + getName() + " (#" + getPlayerNumber() + ")\nPosition: " + getPosition() + " | Age: " + getAge() + " | Height: " + getHeight() + " | Weight: " + getWeight() + " lbs | Nationality: " + getNationality() + " | Appearances: " + getAppearances() + " | Substitutions: " + getSubstitutions() + " | Assists: " + getAssists() + " | Fouls Committed: " + getFoulsComitted() + " | Fouls Suffered: " + getFoulsSuffered() + " | Yellow Card Count: " + getYellowCard() + " | Red Card Count: " + getRedCard() + " | Goals: " + getGoals() + " | Shots: " + getTotalShots() + " | Shots on Target: " + getShotsOnTarget() + " | Shot Accuracy: " + getShotAccuracy() + "%";
    }
}
