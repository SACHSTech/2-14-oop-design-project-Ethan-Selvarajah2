public abstract class Player extends Person {
    private int playerNumber;
    private String position;
    private int appearances;
    private int substitutions;
    private int assists;
    private int foulsCommitted;
    private int foulsSuffered;
    private int yellowCard;
    private int redCard;

    public Player(String name, int age, String height, int weight, String nationality, int playerNumber, String position, int appearances, int substitutions, int assists, int foulsComitted, int foulsSuffered, int yellowCard, int redCard) {
        super(name, age, height, weight, nationality);
        this.playerNumber = playerNumber;
        this.position = position;
        this.appearances = appearances;
        this.substitutions = substitutions;
        this.assists = assists;
        this.foulsCommitted = foulsComitted;
        this.foulsSuffered = foulsSuffered;
        this.yellowCard = yellowCard;
        this.redCard = redCard;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public String getPosition() {
        return position;
    }

    public int getAppearances() {
        return appearances;
    }

    public int getSubstitutions() {
        return substitutions;
    }

    public int getAssists() {
        return assists;
    }

    public int getFoulsComitted() {
        return foulsCommitted;
    }

    public int getFoulsSuffered() {
        return foulsSuffered;
    }

    public int getYellowCard() {
        return yellowCard;
    }

    public int getRedCard() {
        return redCard;
    }
}
