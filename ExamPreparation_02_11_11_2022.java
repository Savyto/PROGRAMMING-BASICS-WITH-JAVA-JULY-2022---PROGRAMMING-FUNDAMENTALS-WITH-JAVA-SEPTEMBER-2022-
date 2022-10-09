package WorkingOn3;

import java.util.Scanner;

public class ExamPreparation_02_11_11_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxBadGrades = Integer.parseInt(scanner.nextLine());

        int badGrades = 0;
        int sumGrades = 0;
        int sumProblems = 0;

        boolean needAbreak = false;
        String lastProblem = "";
        String input = scanner.nextLine();

        while (!input.equals("Enough")) {

            String exerciseName = input;

            lastProblem = exerciseName;

            double grade = Double.parseDouble(scanner.nextLine());
            sumProblems++;

            if (grade <= 4) {
                badGrades++;
            }
            sumGrades += grade;
            if (badGrades >= maxBadGrades) {
                needAbreak = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (needAbreak) {
            System.out.printf("You need a break, %d poor grades.%n", badGrades);
        } else {
            System.out.printf("Average score: %.2f%n", sumGrades * 1.0 / sumProblems);
            System.out.printf("Number of problems: %d%n", sumProblems);
            System.out.printf("Last problem: %s%n", lastProblem);

        }
    }
}
