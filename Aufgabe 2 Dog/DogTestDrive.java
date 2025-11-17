public class DogTestDrive {
    public static void main(String[] args) {
        //2.2.1
        DogReferenz Dog1 = new DogReferenz();
        Dog1.size = 30;
        Dog1.breed = "Mischling";
        Dog1.name = "Hund1";
    
    
        DogReferenz Dog2 = Dog1;
        System.out.println(Dog2);

        //2.2.2

        int Value1 = 1000;
        int Value2 = Value1;
        System.out.println(Value2);
        Value1 = 2000;
        System.out.println(Value1); 
        System.out.println(Value2);
        

        //3.1
        DogReferenz nullDogReferenz = null;
        System.out.println("Dog" + nullDogReferenz);
     
        // 3.2
        DogReferenz bullDog = new DogReferenz();
        bullDog.size = 25;
        bullDog.breed = "Bulldog";
        bullDog.name = "Bulldogge";
        System.out.println("Dog: " + bullDog);

    }
}
       
    
    
    
    