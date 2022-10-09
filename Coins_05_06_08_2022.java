package WorkingOn;

import java.util.Scanner;

public class Coins_05_06_08_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());

        double sumCoins = Math.round(sum * 100);

        int countCoins = 0;
        while (sumCoins > 0) {

            if (sumCoins >= 200) {
                countCoins++;
                sumCoins = sumCoins - 200;
            } else if (sumCoins >= 100) {
                countCoins++;
                sumCoins = sumCoins - 100;
            } else if (sumCoins >= 50) {
                countCoins++;
                sumCoins = sumCoins - 50;
            } else if (sumCoins >= 20) {
                countCoins++;
                sumCoins = sumCoins - 20;
            } else if (sumCoins >= 10) {
                countCoins++;
                sumCoins = sumCoins - 10;
            } else if (sumCoins >= 5) {
                countCoins++;
                sumCoins = sumCoins - 5;
            } else if (sumCoins >= 2) {
                countCoins++;
                sumCoins = sumCoins - 2;
            } else if (sumCoins >= 1) {
                countCoins++;
                sumCoins = sumCoins - 1;
            }
        }
        System.out.println(countCoins);
    }
}
