package WorkingOn2;

import java.util.Scanner;

public class NumberPyramid_01_09_08_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean isBigger = false;
        int number = 1;
        for (int rows = 1; rows <= n; rows++) {

            for (int column = 1; column <= rows; column++) {
                if (number > n) {
                    isBigger = true;
                    break;
                }
                System.out.print(number + " ");
                number++;
            }
            if (isBigger) {
                break;
            }
            System.out.println();
        }
    }
}

