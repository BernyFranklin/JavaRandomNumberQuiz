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
    // Declare constant for max score an question points
    private static final int MAX_SCORE = 100;
    private static final int CORRECT_ANSWER = 10;
    
    

    public static void main(String[] args) {
        // Call createQuiz
        createQuiz();
        // Call administerQuiz
        administerQuiz();
        // Call gradeQuiz
        gradeQuiz();
    }   // End of PSV Main
    private static void createQuiz() {
        // Loop through 0-9 to fill arrays
        for (int counter = 0; counter < QUIZ_LENGTH; counter++) {
            // Generate numbers between 0 - 99 to fill arrays
            // 100 used to select number 0 - 99
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
    
    // Start gradeQuiz
    private static void gradeQuiz() {
        // Define variables for details on grade
        int pointCount = 0;
        int score = 0;
        // Results title
        System.out.println ("              Final Results              ");
        System.out.println ("=========================================");
        // Loop through questions and answers of quiz
        for (int counter = 0; counter < QUIZ_LENGTH; counter++) {
            // Print original problem with original answer
            System.out.printf ("\n%2d. %2d + %2d = %3d\n",
                    (counter + 1), num1[counter], num2[counter], answer[counter]);
            if (answer[counter] == (num1[counter] + num2[counter])) {
                System.out.printf ("                  CORRECT");
                pointCount++;
            } else {
                System.out.printf ("                  INCORRECT, Answer is %3d", 
                        (num1[counter] + num2[counter]));
            }  // End of if/else
        }   // End of for loop
        // Compute score by multiplying pointCount by CORRECT_ANSWER
        score = pointCount * CORRECT_ANSWER;
        // Print score
        System.out.printf ("\n==========================================");
        System.out.printf ("\n        Your final score is %2d/%3d\n", score, MAX_SCORE);
        System.out.printf ("==========================================\n");
    }   // End of gradeQuiz
}   // End of Class JavaNumberQuiz
