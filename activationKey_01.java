package ExamPrep1;

import java.util.Scanner;

public class activationKey_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String activationKey = scanner.nextLine();

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Generate")) {
            String[] tokens = inputLine.split(">>>");
            String command = tokens[0];

            String substring = ";";
            int startIndex = 0;
            int endIndex = 0;
            switch (command) {
                case "Contains":
                     substring = tokens[1];

                    if (activationKey.contains(substring)) {
                        System.out.printf("%s contains %s", activationKey, substring);

                    } else {
                        System.out.println("Substring not found");
                    }
                    break;


                case "Flip":
                    String upperOtLower = tokens [1];
                    startIndex = Integer.parseInt(tokens[2]);
                    endIndex = Integer.parseInt(tokens[3]);
                    substring = activationKey.substring(startIndex, endIndex);


                    if (upperOtLower.equals("Upper")) {
                        activationKey = activationKey.replace(substring, substring.toUpperCase());
                    } else {
                        activationKey = activationKey.replace(substring, substring.toLowerCase());
                    }

                    System.out.println(activationKey);

                    break;


                case "Slice":
                    startIndex = Integer.parseInt(tokens[1]);
                    endIndex = Integer.parseInt(tokens[2]);

                    substring = activationKey.substring(startIndex, endIndex);
                    activationKey = activationKey.replace(substring, "");

                    System.out.println(activationKey);

                    break;
            }

            inputLine = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s$n", activationKey);
    }
}
