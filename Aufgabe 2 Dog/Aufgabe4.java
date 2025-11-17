public class Aufgabe4 {
    public static void main(String[] args) {
        
    int[] numbers1 = {1,2,3,4,5};

    //4.1.2
    DogReferenz[] DogArray = new DogReferenz[3];
    
    //4.2
    int[] numbers2 = numbers1; 

    numbers2[0] = 10;
    System.out.println(numbers1[0]);

    //4.3 
    DogReferenz[] dogs = new DogReferenz[3];
    dogs[0] = new DogReferenz();
    dogs[0].name = "Hund1";
    dogs[0].size = 50;
    dogs[0].breed = "Labrador";

    dogs[1] = new DogReferenz();
    dogs[1].name = "Hund2";
    dogs[1].size = 60;
    dogs[1].breed = "Schäferhund";

    dogs[2] = new DogReferenz();
    dogs[2].name = "Hund3";
    dogs[2].size = 30;
    dogs[2].breed = "Dackel";

    
    for (int i = 0; i < dogs.length; i++) {
        dogs[i].bark();
    }

    }
    


}
