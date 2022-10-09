package Exam;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yesOrNo = scanner.nextLine();
        int climbedMetres = Integer.parseInt(scanner.nextLine());

        int metres = 5364;
        int days = 1;
        boolean over5days = false;
        boolean climbed = false;
        int sumClimbedMeters = 0;

        while (!yesOrNo.equals("END") || over5days || climbed) {

            sumClimbedMeters = sumClimbedMeters + climbedMetres + metres;

            if (yesOrNo.equals("Yes")) {
                days++;
            }

            if (days > 5) {
                over5days = true;
            }

            if (sumClimbedMeters >= 8848) {
                climbed = true;
            }
        }
        if (over5days || climbed) {
            System.out.printf ("Goal reached for %d days", days);
        } else {
            System.out.println ("Failed!");
            System.out.println(sumClimbedMeters);
        }
    }
}
