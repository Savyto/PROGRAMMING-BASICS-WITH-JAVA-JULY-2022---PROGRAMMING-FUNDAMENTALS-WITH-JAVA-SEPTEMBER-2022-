package Exam;

import java.util.Scanner;

public class ExcursionCalculator_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double priceForAperson = 0;
        double totalSum = 0;

        switch (season) {
            case "spring":
                if (countPeople <= 5) {
                    priceForAperson = 50;
                } else if (countPeople > 5) {
                    priceForAperson = 48;
                }
                totalSum = countPeople * priceForAperson;
                break;

            case "summer":
                if (countPeople <= 5) {
                    priceForAperson = 48.5;
                } else if (countPeople > 5) {
                    priceForAperson = 45;
                }
                totalSum = countPeople * priceForAperson * 0.85;
                break;

            case "autumn":
                if (countPeople <= 5) {
                    priceForAperson = 60;
                } else if (countPeople > 5) {
                    priceForAperson = 49.5;
                }
                totalSum = countPeople * priceForAperson;
                break;

            case "winter":
                if (countPeople <= 5) {
                    priceForAperson = 86;
                } else if (countPeople > 5) {
                    priceForAperson = 85;
                }
                totalSum = countPeople * priceForAperson + countPeople * priceForAperson * 8 / 100;
                break;

        }
        System.out.printf("%.2f leva.", totalSum);
    }
}
