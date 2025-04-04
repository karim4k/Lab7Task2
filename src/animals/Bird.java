package animals;

public class Bird extends Animal {
    private String featherColor; // Color of the bird's feathers

    // Default constructor
    public Bird() {
        super(); // Calls the default constructor of Animal
        this.featherColor = "Unknown"; // Default value
    }

    // Parameterized constructor
    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight); // Calls the parameterized constructor of Animal
        this.featherColor = featherColor;
    }

    // Overriding abstract methods from Animal
    @Override
    public void eat() {
        System.out.println("Bird is eating seeds.");
    }

    @Override
    public void getVoice() {
        System.out.println("Bird is chirping.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Feather color: " + featherColor;
    }
}
