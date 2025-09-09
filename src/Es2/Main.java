package Es2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire un valore compreso da 0 a 3 ");

        int num1 = (scanner.nextInt());
        String numString = Integer.toString(num1);
        switch (num1) {

            case 0: {
                if (num1 == 0)
                    System.out.println("hai inserito zero");
                break;
            }

            case 1: {
                if (num1 == 1)
                    System.out.println("hai inserito 1");
                break;
            }

            case 2: {
                if (num1 == 2)
                    System.out.println("hai inserito due");
                break;
            }

            case 3: {
                if (num1 == 3)
                    System.out.println("hai inserito tre");
                break;
            }

            default: {
                System.out.println("ERRORE, RIPROVARE");
            }


        }
    }

}






