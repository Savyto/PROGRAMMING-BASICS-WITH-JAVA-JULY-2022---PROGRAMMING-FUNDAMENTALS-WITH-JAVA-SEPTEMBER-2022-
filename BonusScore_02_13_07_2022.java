package SubmittedHomework;

import java.util.Scanner;

public class BonusScore_02_13_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double bonus = 0;
        if (number <= 100) {
            bonus = 5;
        }
        else if (number > 1000) {
                bonus = number * 0.10;

        } else {
                //Между 101 и 1000
                bonus = number * 0.20;
        }

        if (number % 2 == 0) {
                bonus = bonus + 1;
        }

        if (number % 10 == 5) {
                bonus = bonus + 2;
        }

        System.out.println(bonus);
        System.out.println(bonus + number);
    }
}