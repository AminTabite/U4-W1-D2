package Es3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire una stringa");

        while (true) {
            String str10 = (scanner.nextLine());


            String[] newstr10 = str10.split("");
            System.out.println(newstr10);
            // System.out.println(Arrays.toString(newstr10));
            System.out.println(String.join(",", newstr10));

            if (str10.equals(":q")) {
                break;
            }

            System.out.println("Inserire una stringa");

        }

    }


}
