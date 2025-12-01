public class CalculatorTestDrive {
    public static void main(String[] args) {
        calculator calc = new calculator();

        double Ergebnisadd = calc.add(2,3);
        System.out.println("Test 2 + 3 " + Ergebnisadd);
        if (Ergebnisadd == 5) {
            System.out.println("Test Bestanden");
        }else{
            System.out.println("Test nicht bestanden");
        }

        double Eregbnisnegative = calc.negative(5,2);
        System.out.println("Test 5-2 " + Eregbnisnegative);
        if (Eregbnisnegative == 3) {
            System.out.println("Test Bestanden");
        }else{
            System.out.println("Test nicht bestanden");
        }

        double Ergebnisdivision = calc.division(14,2);
        System.out.println("Test 14/2 " + Ergebnisdivision);
        if (Ergebnisdivision == 7) {
            System.out.println("Test Bestanden");
        }else{
            System.out.println("Test nicht bestanden");
        }

        double Ergebnismultiplication = calc.multiplication(5,2);
        System.out.println("Test 5*2 " + Ergebnismultiplication);
        if (Ergebnismultiplication == 10) {
            System.out.println("Test Bestanden");
        }else{
            System.out.println("Test nicht bestanden");
        }

        calc.addWithUserInput();
    }
}
