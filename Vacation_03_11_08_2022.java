package WorkingOn3;

import java.util.Scanner;

public class Vacation_03_11_08_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        double money1 = currentMoney;
        int countDays = 0;
        int spendStreak = 0;
        boolean cantSaveMoney = false;

        while (money1 < vacationMoney) {
            countDays++;
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            switch (action) {
                case "save":
                    spendStreak = 0;
                    money1 = money1 + money;
                    break;
                case "spend":
                    spendStreak++;
                    money1 = money1 - money;

                    if (0 >= money1) {
                        money1 = 0;
                    }
                    break;
            }

            if (spendStreak == 5) {
                cantSaveMoney = true;
                break;
            }
        }
        if (cantSaveMoney) {
            System.out.println("You can't save the money.");
            System.out.println(countDays);
        } else {
            System.out.printf("You saved the money for %d days.", countDays);
        }
    }
}
