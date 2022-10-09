package SubmittedHomework;

import java.util.Scanner;

public class WorldSwimmingRecord_06_15_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      double record = Double.parseDouble(scanner.nextLine());
      double distance = Double.parseDouble(scanner.nextLine());
      double timeInSec = Double.parseDouble(scanner.nextLine());

      double results = distance * timeInSec;
      double slowDown = Math.floor(distance / 15);
      double resistance = slowDown * 12.5;

      double finalResults = results + resistance;

      if (finalResults < record) {
         System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalResults );

        } else {
         System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(record - finalResults));
        }
    }
}
