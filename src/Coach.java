public class Coach extends Person {
    private double term;
    private String preferredFormation;
    private int wins;
    private int losses;

    public Coach(String name, int age, String height, int weight, String nationality, double term, String preferredFormation, int wins, int losses) {
        super(name, age, height, weight, nationality);
        this.term = term;
        this.preferredFormation = preferredFormation;
        this.wins = wins;
        this.losses = losses;
    }

    public double getTerm() {
        return term;
    }

    public String getPreferredFormation() {
        return preferredFormation;
    }

    public double getSuccessRate() {
        if (wins + losses == 0) {
            return 0.0;
        } else {
            return (double) wins / (wins + losses) * 100.0;
        }
    }

    public String toString() {
        return "Name: " + getName() + "\nPosition: Coach | Age: " + getAge() + " | Height: " + getHeight() + " | Weight: " + getWeight() + " lbs | Nationality: " + getNationality() + " | Term: " + getTerm() + " | Success Rate: " + getSuccessRate() + "%";
    }
}
