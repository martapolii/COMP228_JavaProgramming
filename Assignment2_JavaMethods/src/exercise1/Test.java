// Marta Polishchuk
// 301432299
// COMP228 (Sec 403) 
// Lab 2
// Oct 4, 2024 


package exercise1;

import javax.swing.JOptionPane;
import java.util.Random;

// Q: Write a Java application that simulates a test. The test contains at least five questions about first three lectures of this course. Each question should be a multiple-choice question with 4 options...

public class Test {
 //Need 5 multiple choice questions with 4 options each:
	
//	Questions:
//		1. What programming language was Java designed most similarly to in terms of syntax?
	//		a. Hex
	//		*b. C/C++
	//		c. Assembler
	//		d. SQL 
//		2. Which of the below options is not one of the 5 phases of a typical Java Environment?
	//		a. Load
	//		*b. Save
	//		c. Verify
	//		d. Edit 
//		3. A collection of related objects is called a _____?
	//		*a. class
	//		b. method
	//		c. record
	//		d. library
//		4. What is argument promotion?
	//		a. When a method is given additional arguments
	//		b. When a parent class's methods and arguments are passed onto the derived class
	//		c. Hiding information or implementation decisions that are internal to the encapsulation class
	//		*d. Converting an argument's value to the type the method expects in its corresponding parameter
//		5. Which statement best describes the technique 'divide and conquer'?
	//		a. Combining new methods and classes available in the Java API
	//		b. Promoting values to the 'highest' type in the expression
	//		*c. Constructing large programs from small, simple pieces
	//		d. Assembling String objects into larger strings by using operators + or +=
//		
	//will make arrays to store the questions, then answers, then the correct answers
			// need to make indexes align (i.e. questions[0] corresponds to answers[0][0,1,2,3])
	// basic array (one-dimensional):
	String[] questions = {"What programming language was Java designed most similarly to in terms of syntax?",
			 "Which of the below options is not one of the 5 phases of a typical Java Environment?",
			 "A collection of related objects is called a _____?",
			 "What is argument promotion?",
			 "Which statement best describes the technique 'divide and conquer'?"
			};
	// arrays within an array (two-dimensional):
	String[][] answers = {
			{"Hex", "C/C++", "Assembler", "SQL"},
			{"Load", "Save", "Verify", "Edit"},
			{"class", "method","record", "library"},
			{"When a method is given additional arguments", "When a parent class's methods and arguments are passed onto the derived class", 
				"Hiding information or implementation decisions that are internal to the encapsulation class", 
				"Converting an argument's value to the type the method expects in its corresponding parameter"},
			{"Combining new methods and classes available in the Java API", "Promoting values to the 'highest' type in the expression", 
					"Constructing large programs from small, simple pieces", "Assembling String objects into larger strings by using operators + or +="}
	};
	//correct answer for each array within the answers array
	int[] correctAnswers = {1, 1, 0, 3, 2}; 
	
	
	
	// METHODS //

	//first, initialized random method and some variables needed globally: 
	static Random randomNumber = new Random(); //need to initialize random object to use method from random class
	String s1;
	static Boolean checkAnswer = false; 
	int correctQuestions = 0;
	int incorrectQuestions = 0;
	
	
	//method to simulate the questions
			int i = 0; //question index
	public void simulateQuestion(int i) {
		//use JOptionPane class methods to display questions
		// use a loop to show all questions
		String question = questions[i];
		String[] answerOptions = answers[i];
		
		String questionAndAnswers = question + "\n";
			for (int j = 0; j < answerOptions.length; j++) 
				{
			     questionAndAnswers += (j + 1) + ". " + answerOptions[j] + "\n";
			    }
		s1 = JOptionPane.showInputDialog(null, questionAndAnswers, "Test Question", JOptionPane.QUESTION_MESSAGE); //****THIS LINE WAS MISSING FROM SUBMISSION 1
	  }
	

	// method to interact with user
		public void inputAnswer(int i) {
			simulateQuestion(i);
		}
	
		
		//method to check answer
	public void checkAnswer(int i) {
		//need to convert user input into index value
		int userAnswerIndex = Integer.parseInt(s1) - 1;
		//then compare to correct answers array
		if (userAnswerIndex == correctAnswers[i]) {
            checkAnswer = true;
            correctQuestions++; //keeping track to display at end of test
        } else {
            checkAnswer = false;
            incorrectQuestions++;
        }
	}
	
	//method to display random message for the user 
		// if answer is right: “Excellent!”,”Good!”,”Keep up the good work!”, “Nice work!”
		// if answer is wrong: “No. Please try again”, “Wrong. Try once more”, “Don't give up!”, “No. Keep trying..”

	
	public String generateMessage() {
		 String message = ""; // store value in string so it can be returned and used by display results method
	     int n = randomNumber.nextInt(4);

	        if (checkAnswer) {
	            switch (n) {
	                case 0:
	                    message = "Excellent!";
	                    break;
	                case 1:
	                    message = "Good!";
	                    break;
	                case 2:
	                    message = "Keep up the good work!";
	                    break;
	                case 3:
	                    message = "Nice work!";
	                    break;
	            }
	        } else {
	            switch (n) {
	                case 0:
	                    message = "No. Please try again.";
	                    break;
	                case 1:
	                    message = "Wrong. Try once more.";
	                    break;
	                case 2:
	                    message = "No. Keep trying...";
	                    break;
	                case 3:
	                    message = "Don't give up!";
	                    break;
	            }
	        }
	        return message;
	    }
	
	
	//method to display the # of correct and incorrect answers at the end of the test
	 public void displayResults() {
	        int totalQuestions = questions.length;
	        double percentage = ((double) correctQuestions / totalQuestions) * 100;
	        
	        String resultMessage = "Test Complete!\nCorrect answers: " + correctQuestions  +
	                "\nIncorrect answers: " + correctQuestions +
	                "\nPercentage: " + String.format("%.2f", percentage) + "%";
	        
	        JOptionPane.showMessageDialog(null, resultMessage);
	    }
	
	
	public static void main(String[] args) {
		//create a test object and call inputAnswer method 
		Test test = new Test();
		   //loop through questions
        for (int i = 0; i < test.questions.length; i++) {
            test.inputAnswer(i);  // display question and get input
            test.checkAnswer(i);  //check answer 
        }
        
        // show the results at the end
        test.displayResults();
    }

}
