public class BreakDemo {
    
    public static void main(String[] args) {
    int [] Array1 = {10, 20, 30, 40, 50, 60, 70};
    int[] Array2 = {5, 15, 25, 35, 45};
    int [] Array3 = {60, 70, 80, 90};
    int[] Array4 = {};


        int Kriterium1 = 50;

        for (int zahl : Array1) {
        System.out.println(zahl);
        if (zahl > Kriterium1) {
        System.out.println("Gefundener Wert Array1 " + zahl);
        break;  }
    }
        System.out.println("---------");
        for (int zahl : Array2) {
        System.out.println(zahl);
        if (zahl > Kriterium1) {
        System.out.println("Gefundener Wert Array2 " + zahl);
        break; }
    }
        System.out.println("---------");
        for (int zahl : Array3) {
        System.out.println(zahl);
        if (zahl > Kriterium1) {
        System.out.println("Gefundener Wert Array3 " + zahl);
        break; }
    }

        System.out.println("---------");
        for (int zahl : Array4) {
        System.out.println(zahl);
        if (zahl > Kriterium1) {
        System.out.println("Gefundener Wert Array4 " + zahl);
        break; }
    }
    }
}
