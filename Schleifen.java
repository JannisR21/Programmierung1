public class Schleifen {
    public static void main(String[] args) {
        String[] zahlwoerter = {"eins", "zwei", "drei", "vier", "fünf"};

        for (int i = 0; i < zahlwoerter.length; i++) {
	         System.out.println("for Vorwärts \n"+zahlwoerter[i]);
         }

         System.out.println();

        for (int i = zahlwoerter.length - 1; i >= 0; i--) {
	        System.out.println("for Rückwärts\n"+zahlwoerter[i]);
        }
        System.out.println("");

        int i = 0;
        while (i < zahlwoerter.length) { 
           System.out.println("while vorwärts\n"+zahlwoerter[i]);
           i++;
        }
        
        int P = 4;
        while (P >= 0) { 
           System.out.println("while rückwarts\n" + zahlwoerter[P]);
           P--;
        }
        System.out.println("");
        for (String wort : zahlwoerter) {
        System.out.println(wort);
        }
    }
}
