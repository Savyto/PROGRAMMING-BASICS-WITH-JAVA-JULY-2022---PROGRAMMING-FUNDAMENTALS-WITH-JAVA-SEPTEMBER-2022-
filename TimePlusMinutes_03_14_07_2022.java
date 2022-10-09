package SubmittedHomework;

import java.util.Scanner;

public class TimePlusMinutes_03_14_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int mins = Integer.parseInt(scanner.nextLine());

        int totalmins = hour * 60 + mins + 15;

        hour = totalmins / 60;
        mins = totalmins % 60;

        if (hour > 23) {
            hour = 0;
        }

        if (mins < 10) {
            System.out.printf("%d:0%d", hour, mins);

        } else {
            System.out.printf("%d:%d", hour, mins);
        }
    }
}
