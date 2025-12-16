public class AnimalTestDrive {
    public static void main(String[] args) {
        Dragon dragon = new Dragon("Drache", 100);
        dragon.makeSound();
        dragon.eat();

        System.out.println("--------------------");

        Cat cat = new Cat("Katze", 3);
        cat.makeSound();
        cat.eat();
        cat.play();

        System.out.println("--------------------");

        Dog dog = new Dog("Hund", 5);
        dog.makeSound();
        dog.eat();
        dog.play();

        System.out.println("--------------------");

        Lion lion = new Lion("Löwe", 4);
        lion.makeSound();
        lion.eat();
        
        System.out.println("--------------------");

        Wolf wolf = new Wolf("Wolf", 6);
        wolf.makeSound();
        wolf.eat();

        System.out.println("--------------------");

        RoboDog roboDog = new RoboDog("RoboHund");
        roboDog.performTask();
        roboDog.play();

        roboDog.setCharged(false);
        roboDog.performTask();
        roboDog.play();

    }
}
