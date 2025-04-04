package animals;

public class Main {
    public static void main(String[] args) {
        // Create objects using the parameterized constructors
        Dog dog = new Dog("Buddy", 3, 25.0, "Brown", "Golden Retriever");
        Pigeon pigeon = new Pigeon("Sky", 2, 1.5, "Gray", "Rock Pigeon");
        Blowfish blowfish = new Blowfish("Puffy", 1, 0.5, "Saltwater", 10);

        // Call methods on the objects
        System.out.println(dog);
        dog.eat();
        dog.getVoice();

        System.out.println(pigeon);
        pigeon.eat();
        pigeon.getVoice();

        System.out.println(blowfish);
        blowfish.eat();
        blowfish.getVoice();
    }
}