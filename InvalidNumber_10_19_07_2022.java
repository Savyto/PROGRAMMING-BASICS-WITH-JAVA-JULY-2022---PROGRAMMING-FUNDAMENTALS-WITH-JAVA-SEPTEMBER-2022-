package SubmittedHomework;

import java.util.Scanner;

public class InvalidNumber_10_19_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        boolean right = num <= 200 && num >= 100 || num == 0;

        if (!right) {
            System.out.println("invalid");
        }
    }
}
