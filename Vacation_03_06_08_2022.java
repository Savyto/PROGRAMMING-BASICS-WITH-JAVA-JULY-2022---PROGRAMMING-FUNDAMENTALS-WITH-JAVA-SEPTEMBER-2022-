package WorkingOn;

import java.util.Scanner;

public class Vacation_03_06_08_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        double totalMoney = availableMoney;
        int totalDays = 0;
        int spendStreak = 0;
        boolean cantsaveMoney = false;

        while (totalMoney < vacationMoney) {
            totalDays++;
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            switch (command) {
                case "save":
                    spendStreak = 0;
                    totalMoney = totalMoney + money;
                    break;
                case "spend":
                    spendStreak++;
                    totalMoney = totalMoney - money;

                    if (0 >= totalMoney) {
                        totalMoney = 0;
                    }
                    break;
            }

            if (spendStreak == 5) {
                cantsaveMoney = true;
                break;
            }
        }
        if (cantsaveMoney) {
            System.out.println("You can't save the money.");
            System.out.println(totalDays);
        } else {
            System.out.printf("You saved the money for %d days.", totalDays);
        }
    }
}