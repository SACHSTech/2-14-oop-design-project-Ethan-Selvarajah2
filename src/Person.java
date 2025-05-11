/**
 * Represents general persons on the soccer team
 */
public abstract class Person {
    private String name;
    private int age;
    private String height;
    private int weight;
    private String nationality;

    /**
     * Creates the person object with parameters
     * @param name person name
     * @param age person age
     * @param height person height
     * @param weight person weight
     * @param nationality person nationality
     */
    public Person(String name, int age, String height, int weight, String nationality) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    /**
     * Retrieves the name of the person
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the age of the person
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Retrieves the height of the person
     * @return height
     */
    public String getHeight() {
        return height;
    }

    /**
     * Retrieves the weight of the person
     * @return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Retrieves the nationality of the person
     * @return nationality
     */
    public String getNationality() {
        return nationality;
    }
}
