package SubmittedHomework;

import java.util.Scanner;

public class CharacterSequence_05_29_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);

            System.out.println(letter);
        }
    }
}
