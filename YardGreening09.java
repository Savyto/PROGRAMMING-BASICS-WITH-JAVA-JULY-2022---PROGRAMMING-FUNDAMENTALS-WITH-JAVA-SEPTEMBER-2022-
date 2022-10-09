package SubmittedHomework;

import java.util.Scanner;

public class YardGreening09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double allSqM = Double.parseDouble(scanner.nextLine());

        double amount = allSqM * 7.61;
        double discount = amount * 0.18;
        double sumWithoutDiscount = amount - discount;

        System.out.printf("The final price is: %2f11 lv.%n", sumWithoutDiscount);
        System.out.printf("The discount is %2f lv.", discount);
    }
}
