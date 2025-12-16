public abstract class Feline extends Animal {
    public Feline(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(getName() + " licks its paws after eating.");
    }
}
