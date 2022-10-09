package SubmittedHomework;

import java.util.Scanner;

public class SpeedInfo_06_12_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed = Double.parseDouble(scanner.nextLine());

        String textResults = "";

        if (speed <=10) {
            textResults = "slow";

        } else if (speed <= 50) {
            textResults = "average";

        } else if (speed <= 150) {
            textResults = "fast";

        } else if (speed <= 1000) {
            textResults = "ultra fast";

        } else {
            textResults = "extremely fast";
        }
        System.out.println(textResults);
    }
}
