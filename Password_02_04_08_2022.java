package SubmittedHomework;

import java.util.Scanner;

public class Password_02_04_08_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String pass = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals(pass)) {
            input = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}
