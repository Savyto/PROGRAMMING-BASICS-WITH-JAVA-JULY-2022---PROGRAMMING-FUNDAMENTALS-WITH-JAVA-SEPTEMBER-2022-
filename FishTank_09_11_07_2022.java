package SubmittedHomework;

import java.util.Scanner;

public class FishTank_09_11_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int litersInCm = length * width * height;
        double litersInLiters = litersInCm * 0.001;
        double neededLiters = litersInLiters - (litersInLiters * percent / 100);

        System.out.println(neededLiters);
    }
}
