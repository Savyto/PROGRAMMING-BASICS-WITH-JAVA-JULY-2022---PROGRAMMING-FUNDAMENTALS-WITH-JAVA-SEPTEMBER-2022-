package SubmittedHomework;

import java.util.Scanner;

public class MaxNumber_06_05_08_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int MaxNum = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int currentNum = Integer.parseInt(input);
            if (currentNum > MaxNum) {
                MaxNum = currentNum;
            }
            input = scanner.nextLine();
        }
        System.out.println(MaxNum);
    }
}
