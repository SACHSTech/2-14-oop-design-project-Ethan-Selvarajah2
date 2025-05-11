/**
 * Represents the players of the soccer team
 */
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

    /**
     * Creates the player object with parameters
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
     * @param foulsSuffered fouls against player
     * @param yellowCard yellow cards received by player
     * @param redCard red cards received by player
     */
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

    /**
     * Retrieves the player number
     * @return player number
     */
    public int getPlayerNumber() {
        return playerNumber;
    }

    /**
     * Retrieves the player's position
     * @return player position
     */
    public String getPosition() {
        if (position.equals("G")) {
            return "Goalkeeper";
        } else if (position.equals("D")) {
            return "Defender";
        } else if (position.equals("M")) {
            return "Midfielder";
        } else if (position.equals("F")) {
            return "Forward";
        } else {
            return "Other";
        }
    }

    /**
     * Retrieves the number of appearances by a player
     * @return number of appearances
     */
    public int getAppearances() {
        return appearances;
    }

    /**
     * Retrieves the substitutions of a player
     * @return number of substitutions
     */
    public int getSubstitutions() {
        return substitutions;
    }

    /**
     * Retrieves the number of assists of a player
     * @return assists
     */
    public int getAssists() {
        return assists;
    }

    /**
     * Retrieves the fouls committed by a player
     * @return fouls committed
     */
    public int getFoulsComitted() {
        return foulsCommitted;
    }

    /**
     * Retrieves the fouls suffered by a player
     * @return fouls suffered
     */
    public int getFoulsSuffered() {
        return foulsSuffered;
    }

    /**
     * Retrieves the number of yellow cards received by a player
     * @return number of yellow cards
     */
    public int getYellowCard() {
        return yellowCard;
    }

    /**
     * Retrieves the number of red cards received by a player
     * @return number of red cards
     */
    public int getRedCard() {
        return redCard;
    }
}
