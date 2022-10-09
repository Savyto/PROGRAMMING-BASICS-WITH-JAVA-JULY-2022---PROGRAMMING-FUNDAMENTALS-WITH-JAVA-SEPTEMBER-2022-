package SubmittedHomework;

import java.util.Scanner;

public class MinNumber_07_05_08_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int MinNum = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int currentNum = Integer.parseInt(input);
            if (currentNum < MinNum) {
                MinNum = currentNum;
            }
            input = scanner.nextLine();
        }
        System.out.println(MinNum);
    }
}
