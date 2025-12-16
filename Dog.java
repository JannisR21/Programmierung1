public class Dog extends Canine implements Pet {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is fetching the ball.");
    }
}
