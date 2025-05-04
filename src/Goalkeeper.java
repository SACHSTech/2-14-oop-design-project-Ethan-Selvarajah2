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
}
