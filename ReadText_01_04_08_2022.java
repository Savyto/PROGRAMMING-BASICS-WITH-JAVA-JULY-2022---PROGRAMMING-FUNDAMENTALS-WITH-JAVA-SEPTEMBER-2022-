package SubmittedHomework;

import java.util.Scanner;

public class ReadText_01_04_08_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        while (!word.equals("Stop")) {
            System.out.println(word);
            word = scanner.nextLine();
        }
    }
}
