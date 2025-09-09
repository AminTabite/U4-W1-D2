package Es4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un valore");

        int N50 = (scanner.nextInt());

        for (int i = N50; i >= 0; i--) {
            System.out.println(i);
        }


    }


}

