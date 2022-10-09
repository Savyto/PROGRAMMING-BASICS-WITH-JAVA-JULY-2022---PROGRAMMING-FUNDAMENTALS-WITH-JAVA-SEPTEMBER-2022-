package SubmittedHomework;

import java.util.Scanner;

public class PasswordGuess_04_12_07_2022 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passInput = scanner.nextLine();
        //s3cr3t!P@ssw0rd

        if (passInput.equals ("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");

        } else {
            System.out.println("Wrong password!");
        }
    }
}
