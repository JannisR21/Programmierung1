public class Cat extends Feline implements Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with a ball of yarn.");
}
}
