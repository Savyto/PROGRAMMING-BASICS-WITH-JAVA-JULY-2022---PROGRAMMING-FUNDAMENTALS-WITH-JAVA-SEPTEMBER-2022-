package AssociativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        // 8.0 2.0 2.0 8.0 2.0
        // 8.0 - #бройка, броя (2)
        // 2.0 - #бройка, броя (3)

        TreeMap<Double, Integer> countMap = new TreeMap<>();
        for (double num : numberArr) {

            // създавам един foreach double num в колекцията numbersArr

            if (!countMap.containsKey(num)) {
                countMap.put(num, 1);
            } else {
                int value = countMap.get(num);
                countMap.put(num, value + 1);
            }
        }

        for (Map.Entry<Double, Integer> doubleIntegerEntry : countMap.entrySet()) {
            System.out.printf("%.0f -> %d%n, entry.getKey(), entry.getValue");
        }

    }
}
