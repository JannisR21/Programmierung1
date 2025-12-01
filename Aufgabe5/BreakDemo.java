public class BreakDemo {

    public static void main(String[] args) {
    int [] Array1 = {10, 20, 30, 40, 50, 60, 70};
    int[] Array2 = {5, 15, 25, 35, 45};
    int [] Array3 = {60, 70, 80, 90};
    int[] Array4 = {};

    int Kriterium1 = 50;

    System.out.println("Array: [10, 20, 30, 40, 50, 60, 70]");
    System.out.println("Kriterium: " + Kriterium1);
    System.out.println("Überprüfte Werte:");
    boolean gefunden1 = false;
    for (int zahl : Array1) {
        System.out.println(zahl);
        if (zahl > Kriterium1) {
            System.out.println("Gefundener Wert: " + zahl);
            gefunden1 = true;
            break;
        }
    }
    if (!gefunden1) {
        System.out.println("Kein Wert erfüllt die Bedingung.");
    }
    System.out.println("---------");

    System.out.println("Array: [5, 15, 25, 35, 45]");
    System.out.println("Kriterium: " + Kriterium1);
    System.out.println("Überprüfte Werte:");
    boolean gefunden2 = false;
    for (int zahl : Array2) {
        System.out.println(zahl);
        if (zahl > Kriterium1) {
            System.out.println("Gefundener Wert: " + zahl);
            gefunden2 = true;
            break;
        }
    }
    if (!gefunden2) {
        System.out.println("Kein Wert erfüllt die Bedingung.");
    }
    System.out.println("---------");

    System.out.println("Array: [60, 70, 80, 90]");
    System.out.println("Kriterium: " + Kriterium1);
    System.out.println("Überprüfte Werte:");
    boolean gefunden3 = false;
    for (int zahl : Array3) {
        System.out.println(zahl);
        if (zahl > Kriterium1) {
            System.out.println("Gefundener Wert: " + zahl);
            gefunden3 = true;
            break;
        }
    }
    if (!gefunden3) {
        System.out.println("Kein Wert erfüllt die Bedingung.");
    }
    System.out.println("---------");
    
    System.out.println("Array: []");
    System.out.println("Kriterium: " + Kriterium1);
    if (Array4.length == 0) {
        System.out.println("Array ist leer. Kein Wert überprüfbar.");
    } else {
        System.out.println("Überprüfte Werte:");
        boolean gefunden4 = false;
        for (int zahl : Array4) {
            System.out.println(zahl);
            if (zahl > Kriterium1) {
                System.out.println("Gefundener Wert: " + zahl);
                gefunden4 = true;
                break;
            }
        }
        if (!gefunden4) {
            System.out.println("Kein Wert erfüllt die Bedingung.");
        }
    }
    }
}
