package SubmittedHomework;

import java.util.Scanner;

public class EvenOrOdd_03_12_07_2022 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
