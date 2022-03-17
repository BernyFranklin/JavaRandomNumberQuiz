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
    private static int[ ] num1 = {
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0
    };
    // Declare num2[] for second number in problem
    private static int[ ] num2 = { 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0
    };
    // Declare answer[] for answers input by user
    private static int[ ] answer = {
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0
    };
    // Declare constant for quiz length
    private static final int QUIZ_LENGTH = 10;
    

    public static void main(String[] args) {
        // Call createQuiz
        createQuiz();
        // Call administerQuiz
        administerQuiz();
    }   // End of PSV Main
    private static void createQuiz() {
        // Loop through 0-9 to fill arrays
        for (int counter = 0; counter < QUIZ_LENGTH; counter++) {
            // Generate numbers between 0 - 99 to fill arrays
            num1[counter] = (int)(Math.random()*100);
            num2[counter] = (int)(Math.random()*100);
        }   // End of for loop
    }   // End of createQuiz
    
    // Start administerQuiz
    private static void administerQuiz() {
        // Create scanner object
        Scanner stdin = new Scanner (System.in);
        // Welcome and start quiz
        System.out.println ("=========================================");
        System.out.println ("                Math Quiz                ");
        System.out.println ("=========================================");
        System.out.println ("Answer the following 10 addition problems");
        System.out.println ("=========================================");
        // For loop to generate test questions, read and store user input
        for (int counter = 0; counter < QUIZ_LENGTH; counter++) {
            System.out.printf ("\n%2d. %2d + %2d = ", 
                    (counter + 1), num1[counter], num2[counter]);
            answer[counter] = stdin.nextInt();
        }   // End of for loop
        System.out.println ("=========================================");
    }   // End of administerQuiz
}   // End of Class JavaNumberQuiz
