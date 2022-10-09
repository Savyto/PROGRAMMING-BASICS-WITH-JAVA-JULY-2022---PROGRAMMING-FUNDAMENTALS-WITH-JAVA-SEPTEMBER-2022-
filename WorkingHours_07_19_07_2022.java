package SubmittedHomework;

import java.util.Scanner;

public class WorkingHours_07_19_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourOfDay = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

       boolean workingDay = dayOfWeek.equals("Monday") ||
               dayOfWeek.equals("Tuesday") ||
               dayOfWeek.equals("Wednesday") ||
               dayOfWeek.equals("Thursday") ||
               dayOfWeek.equals("Friday") ||
               dayOfWeek.equals("Saturday");

       boolean workingHour = hourOfDay >= 10 && hourOfDay <= 18;

       if (workingHour && workingDay) {
           System.out.println("open");
       }else{
           System.out.println("closed");
       }
    }
}
