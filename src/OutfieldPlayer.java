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
        return (double) shotsOnTarget / totalShots;
    }
}
