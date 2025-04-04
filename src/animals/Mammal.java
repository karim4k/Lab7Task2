package animals;
public class Mammal extends Animal {
    private String furColor;
    public Mammal() {
        super(); // Calls the default constructor of Animal
        this.furColor = "Unknown"; // Default value
    }

    // Parameterized constructor
    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight); // Calls the parameterized constructor of Animal
        this.furColor = furColor;
    }

    // Overriding abstract methods from Animal
    @Override
    public void eat() {
        System.out.println("Mammal is eating.");
    }

    @Override
    public void getVoice() {
        System.out.println("Mammal makes a sound.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Fur color: " + furColor;
    }
}
