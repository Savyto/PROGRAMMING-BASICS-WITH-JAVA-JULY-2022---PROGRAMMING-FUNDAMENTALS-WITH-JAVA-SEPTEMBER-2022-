package SubmittedHomework;

import java.util.Scanner;

public class NewHouse_03_20_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        switch (flowerType) {
            case "Roses":
                totalPrice = flowerCount * 5;
                if (flowerCount > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.10);
                }
                break;
            case "Dahlias":
                totalPrice = 3.8 * flowerCount;
                if (flowerCount > 90) {
                    totalPrice = totalPrice - (0.15 * totalPrice);
                }
                break;
            case "Tulips":
                totalPrice = 2.8 * flowerCount;
                if (flowerCount > 80) {
                    totalPrice = totalPrice - (0.15 * totalPrice);
                }
                break;
            case "Narcissus":
                totalPrice = 3.0 * flowerCount;
                if (flowerCount < 120) {
                    totalPrice = totalPrice + (0.15 * totalPrice);
                }
                break;
            case "Gladiolus":
                totalPrice = 2.5 * flowerCount;
                if (flowerCount < 80) {
                    totalPrice = totalPrice + (0.20 * totalPrice);
                }
                break;
        }

            double diff = Math.abs(budget - totalPrice);

            if (totalPrice <= budget) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, diff);
            }else {
                System.out.printf("Not enough money, you need %.2f leva more.", diff);
            }
    }
}
