package animals;

public abstract class Animal {
    protected  String name;
    protected  int age;
    protected  double weight;


    public Animal(){}

    public Animal(String name,int age,double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    public abstract void eat();
    public abstract void getVoice();

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight;
    }

}


