import java.util.*;

public class Team {
    private String teamName;
    private Coach coach;
    private List<Player> players;
    
    public Team(String teamName, Coach coach, List<Player> players) {
        this.teamName = teamName;
        this.coach = coach;
        this.players = players;
    }

    public String getTeamName() {
        return teamName;
    }

    public Coach getCoach() {
        return coach;
    }

    public List<Player> getPlayers() {
        return players;
    }

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
