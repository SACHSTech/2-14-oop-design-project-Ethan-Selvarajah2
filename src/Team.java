import java.util.*;

/**
 * Represents a soccer team with a coach and players
 */
public class Team {
    private String teamName;
    private Coach coach;
    private List<Player> players;
    
    /**
     * Creates the team object with parammeters
     * 
     * @param teamName name of the team
     * @param coach coach of the team
     * @param players list of players on the team
     */
    public Team(String teamName, Coach coach, List<Player> players) {
        this.teamName = teamName;
        this.coach = coach;
        this.players = players;
    }

    /**
     * Retrieves the team name
     * @return the team name
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Retrieves the name of the coach
     * @return the coach name
     */
    public Coach getCoach() {
        return coach;
    }

    /**
     * Retrieves the list of players
     * @return the player list
     */
    public List<Player> getPlayers() {
        return players;
    }

    /*
     * Displays a summary of the entire team roster
     */
    public void displayTeamSummary() {
        System.out.println("Team: " + teamName);
        System.out.println("");
        System.out.println("**COACH**");
        System.out.println("Coach: " + coach);
        System.out.println("");
        System.out.println("\n **PLAYERS**");

        for (int i = 0; i < players.size(); i++) {
            Player p = players.get(i);
            System.out.println(p);
            System.out.println("");
        }
    }
}
