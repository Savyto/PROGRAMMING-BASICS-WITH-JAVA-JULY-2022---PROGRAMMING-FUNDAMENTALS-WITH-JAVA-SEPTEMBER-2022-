package SubmittedHomework;

import java.util.Scanner;

public class Kong_05_14_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double allPriceClothes = clothesPrice * statists;

        if(statists > 150) {
            allPriceClothes = allPriceClothes - (allPriceClothes * 0.10);
        }

        double totalSum = allPriceClothes + decor;

        if (totalSum > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalSum - budget);

        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalSum);
        }
    }
}
