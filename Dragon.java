public class Dragon extends Animal {

    public Dragon(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " roars and breathes fire!");
    }

}

