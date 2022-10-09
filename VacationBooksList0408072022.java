package SubmittedHomework;

import java.util.Scanner;

public class VacationBooksList0408072022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int compleatedBook = pages / pagesHour;
        int hoursPerDay = compleatedBook / days;

        System.out.println(hoursPerDay);
    }
}
