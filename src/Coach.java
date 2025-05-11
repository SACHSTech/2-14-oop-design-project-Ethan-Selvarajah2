/**
 * Represents the coach of the soccer team
 */
public class Coach extends Person {
    private double term;
    private String preferredFormation;
    private int wins;
    private int losses;
    private int draws;

    /**
     * Creates the coach object with paramaters
     * @param name coach name
     * @param age coach age
     * @param height coach height
     * @param weight coach weight
     * @param nationality coach nationality
     * @param term coach term on team
     * @param preferredFormation preferred team formation of coach
     * @param wins wins with coach
     * @param losses losses with coach
     * @param draws draws with coach
     */
    public Coach(String name, int age, String height, int weight, String nationality, double term, String preferredFormation, int wins, int losses, int draws) {
        super(name, age, height, weight, nationality);
        this.term = term;
        this.preferredFormation = preferredFormation;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }

    /**
     * Retrieves the term of the coach
     * @return term
     */
    public double getTerm() {
        return term;
    }

    /**
     * Retrusn the coaches preferred team formation
     * @return team formation
     */
    public String getPreferredFormation() {
        return preferredFormation;
    }

    /**
     * Returns the coaches success rate
     * @return success rate
     */
    public double getSuccessRate() {
        if (wins + losses == 0) {
            return 0.0;
        } else {
            return (double) wins / (wins + losses + draws) * 100.0;
        }
    }

    /**
     * Formats and returns the information of a coach
     */
    public String toString() {
        return "Name: " + getName() + "\nPosition: Coach | Age: " + getAge() + " | Height: " + getHeight() + " | Weight: " + getWeight() + " lbs | Nationality: " + getNationality() + " | Preferred Team Formation: " + getPreferredFormation() + " | Term: " + getTerm() + " | Success Rate: " + getSuccessRate() + "%";
    }
}
