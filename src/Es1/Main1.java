package Es1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //1

        Scanner scanner = new Scanner(System.in);
/* //es1
        System.out.println("inserisci una stringa per il calcolo");

        String str1 = (scanner.nextLine());
        OddorEven(str1);

      */

        System.out.println("inserisci un anno per verificare se e' bisestile");

        int anno = (scanner.nextInt());
        annoBisestile(anno);


    }

    public static Boolean OddorEven(String str) {

        if (str.length() % 2 == 0) {
            System.out.println("la tua stringa e'" + " " + true);
            return true;
        } else {
            System.out.println("la tua stringa e'" + " " + false);

            return false;
        }
    }

    public static Boolean annoBisestile(int anno) {

        if (anno % 4 == 0 &&
                anno % 100 == 0 &&
                anno % 400 == 0
        ) {
            System.out.println("l'anno e' bisestile");
            return true;
        } else {
            System.out.println("l'anno non e' bisestile");
            return false;
        }


    }


}
