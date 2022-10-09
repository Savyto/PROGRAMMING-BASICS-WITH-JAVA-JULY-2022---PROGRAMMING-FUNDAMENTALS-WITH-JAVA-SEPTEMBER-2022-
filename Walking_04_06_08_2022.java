package WorkingOn;

import java.util.Scanner;

public class Walking_04_06_08_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSteps = 0;
        boolean goingHome = false;

        while (totalSteps < 10000) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                goingHome = true;
                int steps1 = Integer.parseInt(scanner.nextLine());
                totalSteps += steps1;
                break;
            } else {
                int steps2 = Integer.parseInt(input);
                totalSteps += steps2;
            }
        }
        if (goingHome && totalSteps < 10000) {
            System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", totalSteps - 10000);
        }
    }
}
