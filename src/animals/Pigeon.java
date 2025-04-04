package animals;

public class Pigeon extends Bird{

    private String species;

    // Default constructor
    public Pigeon() {
        super(); // Calls the default constructor of Bird
        this.species = "Unknown"; // Default species
    }

    // Parameterized constructor
    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor); // Calls the parameterized constructor of Bird
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("Pigeon is eating grains.");
    }

    @Override
    public void getVoice() {
        System.out.println("Pigeon is cooing.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Species: " + species;
    }
}
