package SubmittedHomework;

import java.util.Scanner;

public class NumberSequence_08_29_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
            if (currentNum < minNum) {
                minNum = currentNum;
            }
        }
        System.out.printf("Max number: %s%n", maxNum);
        System.out.printf("Min number: %s%n", minNum);
    }
}
