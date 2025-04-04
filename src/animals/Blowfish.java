package animals;

public class Blowfish extends Fish{

    private int size;

    // Default constructor
    public Blowfish() {
        super(); // Calls the default constructor of Fish
        this.size = 0; // Default size
    }

    // Parameterized constructor
    public Blowfish(String name, int age, double weight, String waterType, int size) {
        super(name, age, weight, waterType); // Calls the parameterized constructor of Fish
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("Blowfish is eating.");
    }

    @Override
    public void getVoice() {
        System.out.println("Blowfish makes a puffing sound.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Size: " + size;
    }
}

