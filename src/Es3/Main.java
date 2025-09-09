package Es3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire una stringa");

        while (true) {
            String str10 = (scanner.nextLine());

            str10.split(",");
            System.out.println(Arrays.toString(str10.split(",")));

            if (str10.equals(":q")) {
                break;
            }

            System.out.println("Inserire una stringa");

        }

    }


}
