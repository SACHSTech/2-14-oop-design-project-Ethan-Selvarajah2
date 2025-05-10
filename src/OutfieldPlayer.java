public class OutfieldPlayer extends Player {
    private int goals;
    private int totalShots;
    private int shotsOnTarget;

    public OutfieldPlayer(String name, int age, String height, int weight, String nationality, int playerNumber, String position, int appearances, int substitutions, int assists, int foulsComitted, int foulsSuffered, int yellowCard, int redCard, int goals, int totalShots, int shotsOnTarget) {
        super(name, age, height, weight, nationality, playerNumber, position, appearances, substitutions, assists, foulsComitted, foulsSuffered, yellowCard, redCard);
        this.goals = goals;
        this.totalShots = totalShots;
        this.shotsOnTarget = shotsOnTarget;
    }

    public int getGoals() {
        return goals;
    }

    public int getTotalShots() {
        return totalShots;
    }

    public int getShotsOnTarget() {
        return shotsOnTarget;
    }

    public double getShotAccuracy() {
        if (totalShots == 0) {
            return 0.0;
        } else {
            return (double) shotsOnTarget / totalShots * 100.0;
        }
        
    }

    public String toString() {
        return "Player: " + getName() + " (#" + getPlayerNumber() + ")\nPosition: " + getPosition() + " | Age: " + getAge() + " | Height: " + getHeight() + " | Weight: " + getWeight() + " lbs | Nationality: " + getNationality() + " | Appearances: " + getAppearances() + " | Substitutions: " + getSubstitutions() + " | Assists: " + getAssists() + " | Fouls Committed: " + getFoulsComitted() + " | Fouls Suffered: " + getFoulsSuffered() + " | Yellow Card Count: " + getYellowCard() + " | Red Card Count: " + getRedCard() + " | Goals: " + getGoals() + " | Shots: " + getTotalShots() + " | Shots on Target: " + getShotsOnTarget() + " | Shot Accuracy: " + getShotAccuracy() + "%";
    }
}
