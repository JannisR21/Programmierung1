public class Wolf extends Canine {
    public Wolf(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " howls.");
    }
}
