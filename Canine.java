public abstract class Canine extends Animal {
    public Canine(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(getName() + " howls after eating.");
    }
}
