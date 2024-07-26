package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Progression {
    public static void progression() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        do {
            int[] numbers = new int[10];
            numbers[0] = (int) (Math.random() * 10);
            int step = (int) (Math.random() * 11) - 1;
            var replaceIndex = (int) (Math.random() * 10);
            StringBuilder question = new StringBuilder();
            for (var i = 1; i < numbers.length; i++) {
                numbers[i] = numbers[i - 1] + step;
            }
            String correctAnswer = String.valueOf(numbers[replaceIndex]);
            for (var i = 0; i < numbers.length; i++) {
                if (i == replaceIndex) {
                    question.append(".. ");
                } else {
                    question.append(numbers[i]).append(" ");
                }
            }
            System.out.println("Question: " + question);
            System.out.println("Your answer: ");
            String answer = scan.next();
            Engine.engine(answer, correctAnswer);
        } while (Engine.isCorrect && Engine.count < 3);
    }
}
