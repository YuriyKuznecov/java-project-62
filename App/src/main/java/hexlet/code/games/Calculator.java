package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Calculator {
    public static void calc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        String question = "";
        String correctAnswer = "";
        do {
            var number1 = (int) (Math.random() * 100);
            var number2 = (int) (Math.random() * 100);
            var operator = (int) (Math.random() * 3);
            if (operator == 0) {
                question = "%d + %d".formatted(number1, number2);
                correctAnswer = String.valueOf(number1 + number2);
            } else if (operator == 1) {
                question = "%d - %d".formatted(number1, number2);
                correctAnswer = String.valueOf(number1 - number2);
            } else if (operator == 2) {
                question = "%d * %d".formatted(number1, number2);
                correctAnswer = String.valueOf(number1 * number2);
            }
            System.out.println("Question: " + question);
            System.out.println("Your answer: ");
            String answer = scan.next();
            Engine.engine(answer, correctAnswer);
        } while (Engine.isCorrect && Engine.count < 3);
        scan.close();
    }
}
