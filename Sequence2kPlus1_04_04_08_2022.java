package SubmittedHomework;

import java.util.Scanner;

public class Sequence2kPlus1_04_04_08_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;

        while (number <= n) {
            System.out.println(number);
            number = number * 2 + 1;
        }
    }
}