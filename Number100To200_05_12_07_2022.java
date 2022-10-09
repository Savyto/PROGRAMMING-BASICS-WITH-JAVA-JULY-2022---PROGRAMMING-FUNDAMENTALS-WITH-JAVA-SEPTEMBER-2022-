package SubmittedHomework;

import java.util.Scanner;

public class Number100To200_05_12_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Num = Integer.parseInt(scanner.nextLine());

        if (Num < 100) {
            System.out.println("Less than 100");

        } else if (Num <= 200) {
            System.out.println("Between 100 and 200");

        } else {
            System.out.println("Greater than 200");
        }
    }
}
