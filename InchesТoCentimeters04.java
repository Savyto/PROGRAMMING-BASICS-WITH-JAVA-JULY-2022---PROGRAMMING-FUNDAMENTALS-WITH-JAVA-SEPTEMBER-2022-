package SubmittedHomework;

import java.util.Scanner;

public class InchesТoCentimeters04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inch = Double.parseDouble(scanner.nextLine());

        double result = inch * 2.54;

        System.out.println(result);
    }
}
