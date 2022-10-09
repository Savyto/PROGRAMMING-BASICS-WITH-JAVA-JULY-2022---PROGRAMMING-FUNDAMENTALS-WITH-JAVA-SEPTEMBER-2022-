package SubmittedHomework;

import java.util.Scanner;

public class Cinema_01_20_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine(); // четем вида прожекция
        int rows = Integer.parseInt(scanner.nextLine()); // четем редовете
        int columns = Integer.parseInt(scanner.nextLine()); // четем колоните

        double income = 0;

        switch (type) {
            case "Premiere":
                income = rows * columns * 12;
                break;
            case "Normal":
                income = rows * columns * 7.5;
                break;
            case "Discount":
                income = rows * columns * 5;
                break;
        }
        System.out.printf("%.2f leva", income);
    }
}
