public class Person {
    private String name;
    private int age;
    private String height;
    private int weight;
    private String nationality;

    public Person(String name, int age, String height, int weight, String nationality) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getNationality() {
        return nationality;
    }
}
