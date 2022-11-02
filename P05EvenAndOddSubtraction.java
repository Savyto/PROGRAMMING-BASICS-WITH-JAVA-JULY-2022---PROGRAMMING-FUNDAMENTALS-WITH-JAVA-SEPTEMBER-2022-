package Arrays;

import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        int[] numbersArr = new int[inputArr.length];

        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(inputArr[i]);
        }

        int evenSum = 0;
        int oddSum = 0;
        for (int item : numbersArr) {
            if (item % 2 == 0) {
                evenSum += item;
            } else {
                oddSum += item;
            }
        }
            System.out.println(evenSum - oddSum);
    }
}
