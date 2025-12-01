import java.util.Scanner;
class calculator{
    Scanner scanner = new Scanner(System.in);


    public double add(double zahl1,double zahl2){
        return zahl1 + zahl2;

    }

    public double negative(double zahl1, double zahl2){
        return  zahl1 - zahl2;
    }

    public double division(double zahl1, double zahl2){
        return  zahl1 / zahl2;
    }

        public double multiplication(double zahl1, double zahl2){
        return  zahl1 * zahl2;
    }

    public void addWithUserInput(){
        System.out.println("Geben sie ihre Erste Zahl ein");
        double zahl1 = scanner.nextDouble();
        System.out.println("Geben sie ihre zweite Zahl ein");
        double zahl2 = scanner.nextDouble();

        System.out.println("Wählen sie ihren Operator für die Berechnung || + , - , / , * ||");
        String Operator = scanner.next();

    if (Operator.equals("+")){
            double EregbnisInputadd = add(zahl1, zahl2);
            System.out.println("\nDas Eregbnis ihrer Addition ist = " + EregbnisInputadd);
        }
        else if (Operator.equals("-") ) {
            double EregbnisInputnegative = negative(zahl1, zahl2);
            System.out.println("\nDas Eregbnis ihrer Subtraktion ist = " + EregbnisInputnegative);
        }
        else if (Operator.equals("*")) {
            double EregbnisInputmultiplication = multiplication(zahl1, zahl2);
            System.out.println("\nDas Eregbnis ihrer Multiplikation ist = " + EregbnisInputmultiplication);
        }
        else if (Operator.equals("/")) {
            if (zahl2 != 0) {
            double ergebnis = division(zahl1, zahl2);
            System.out.println("\nDas Ergebnis ihrer Division ist = " + ergebnis);
            }else {
                System.out.println("\nFehler: Division durch 0 ist nicht möglich!");
        }
    }
    else {
        System.out.println("Ungültiger Operator! Bitte verwenden Sie +, -, * oder /");
    }
}
}        

    
    

    

