public class Goalkeeper extends Player {
    private int saves;
    private int goalsAllowed;

    public Goalkeeper(String name, int age, String height, int weight, String nationality, int playerNumber, String position, int appearances, int substitutions, int assists, int foulsComitted, int foulsSuffered, int yellowCard, int redCard, int saves, int goalsAllowed) {
        super(name, age, height, weight, nationality, playerNumber, position, appearances, substitutions, assists, foulsComitted, foulsSuffered, yellowCard, redCard);
        this.saves = saves;
        this.goalsAllowed = goalsAllowed;
    }

    public int getSaves() {
        return saves;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public double getSaveAccuracy() {
        if (saves + goalsAllowed == 0) {
            return 0.0;
        } else {
            return (double) saves / (saves + goalsAllowed) * 100.0;
        }
    }

    public String toString() {
        return "Player: " + getName() + " (#" + getPlayerNumber() + ")\nPosition: " + getPosition() + " | Age: " + getAge() + " | Height: " + getHeight() + " | Weight: " + getWeight() + " lbs | Nationality: " + getNationality() + " | Appearances: " + getAppearances() + " | Substitutions: " + getSubstitutions() + " | Assists: " + getAssists() + " | Fouls Committed: " + getFoulsComitted() + " | Fouls Suffered: " + getFoulsSuffered() + " | Yellow Card Count: " + getYellowCard() + " | Red Card Count: " + getRedCard() + " | Saves: " + getSaves() + " | Goals Allowed: " + getGoalsAllowed() + " | Save Accuracy: " + getSaveAccuracy() + "%";
    }
}
