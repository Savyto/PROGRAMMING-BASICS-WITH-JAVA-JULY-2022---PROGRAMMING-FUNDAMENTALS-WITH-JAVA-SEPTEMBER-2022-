package SubmittedHomework;

import java.util.Scanner;

public class FishingBoat_04_25_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());

        double totalprice = 0;

        switch (season) {
            case "Spring":
                totalprice = 3000;
                break;
            case "Summer":
                totalprice = 4200;
                break;
            case "Autumn":
                totalprice = 4200;
                break;
            case "Winter":
                totalprice = 2600;
                break;
        }
        if (num <= 6) {
            totalprice = totalprice - (totalprice * 0.10);
        } else if (num >= 7 && num <= 11) {
            totalprice = totalprice - (totalprice * 0.15);
        } else if (num > 12) {
            totalprice = totalprice - (totalprice * 0.25);
        }
        if (num %2 == 0 && !(season.equals("Autumn"))) {
            totalprice = totalprice - (totalprice * 0.05);
        }

        if (totalprice <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - totalprice);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.", totalprice - budget);
        }
    }
}
