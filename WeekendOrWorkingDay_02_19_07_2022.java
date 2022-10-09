package SubmittedHomework;

import java.util.Scanner;

public class WeekendOrWorkingDay_02_19_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfTheWeek = scanner.nextLine();

        //1	Monday
        //2	Tuesday
        //3	Wednesday
        //4	Thursday
        //5	Friday
        //6	Saturday
        //7	Sunday

        switch (dayOfTheWeek) {
            case "Monday":
              System.out.println("Working day");
              break;
            case "Tuesday":
                System.out.println("Working day");
                break;
            case "Wednesday":
                System.out.println("Working day");
                break;
            case "Thursday":
                System.out.println("Working day");
                break;
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
                System.out.println("Weekend");
                break;
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
