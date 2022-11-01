package Arrays;

import java.util.Scanner;

public class P02PrintNumbersInReverseOrder {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());

            int[] numbersArr = new int[n];

            for (int i = 0; i < n; i++) {
                int currentNum = Integer.parseInt(scanner.nextLine());

                numbersArr[i] = currentNum;
                //ex. position 0 <- currentNum 1
            }

            //двете i-та са различни едно от друго

            for (int i = numbersArr.length - 1; i >= 0; i--) {
                //numbersArr.length = n
                System.out.printf("%d ", numbersArr[i]);
            }

        }
    }

