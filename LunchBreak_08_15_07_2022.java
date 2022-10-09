package SubmittedHomework;

import java.util.Scanner;

public class LunchBreak_08_15_07_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tvShowName = scanner.nextLine();
        int showContTime = Integer.parseInt(scanner.nextLine());
        int breakInMinutes = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakInMinutes / 8.0;
        double timeForRelax = breakInMinutes /4.0;
        double remainingTime = breakInMinutes - (lunchTime + timeForRelax);

        double TTW = Math.abs(remainingTime - showContTime);

        if (remainingTime >= showContTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", tvShowName, Math.ceil(TTW));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", tvShowName, Math.ceil(TTW));
        }
    }
}
