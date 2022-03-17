/*
 * JavaNumberQuiz Version1.0
 * Frank Bernal
 * CIS 084 Java Programming
 * Input: Answers
 * Output: Graded Quiz
 * 17 Mar 2022
 */
package javanumberquiz;
// Import scanner for user input
import java.util.Scanner;
// Import Math for random number gen
import java.lang.Math;

public class JavaNumberQuiz {
    // Declare num1[] for first number in problem
    private static int[ ] num1 = {10};
    // Declare num2[] for second number in problem
    private static int[ ] num2 = {10};
    // Declare answer[] for answers input by user
    private static int[ ] answer = {10};
    // Declare constant for quiz length
    private static final int QUIZ_LENGTH = 10;
    

    public static void main(String[] args) {
        // Call createQuiz
        createQuiz();
    }   // End of PSV Main
    private static void createQuiz() {
        for (int counter = 0; counter < QUIZ_LENGTH; counter++) {
            // Generate numbers between 0 - 99 to fill arrays
            num1[counter] = (int)(Math.random() * 100);
            num2[counter] = (int)(Math.random() * 100);
        }
    }
}   // End of Class JavaNumberQuiz
