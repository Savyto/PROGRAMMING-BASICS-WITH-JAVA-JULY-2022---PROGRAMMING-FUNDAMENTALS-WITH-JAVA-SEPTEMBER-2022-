package Exam;

import java.util.Scanner;

public class BraceletStand_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pocketMoney = Double.parseDouble(scanner.nextLine());
        double income = Double.parseDouble(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());
        double priceOfGift = Double.parseDouble(scanner.nextLine());

        double savedMoneyFromPocket = 0;
        double earnedMoney = 0;
        double savedMoney = 0;
        double end = 0;

        savedMoneyFromPocket = 5 * pocketMoney;
        earnedMoney = 5 * income;

        savedMoney = savedMoneyFromPocket + earnedMoney;

        end = savedMoney - expenses;

        if (end > priceOfGift) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", end);
        } else if (end < priceOfGift) {
            System.out.printf("Insufficient money: %.2f BGN.", priceOfGift - end);

        }
    }
}
