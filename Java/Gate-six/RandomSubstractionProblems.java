//write a method that calculates substraction problems

//The total substraction questions should be ten and the user can have only two attempts per question

//calculate and display the total user's score based on the amount of right answers

//the questions should be random for different users

// there should be no negative answers

//calculate the user's total time in seconds

import java.util.Random;
import java.util.Scanner;
public class RandomSubstractionProblems         {

    public static int subtractionProblems (int firstNumber, int secondNumber)     {

   int subtract = firstNumber - secondNumber; 
         return subtract;  
          
            }


    public static void main (String[] args)     {

     Scanner input = new Scanner (System.in);

    int correctAnswerCount = 0;

    for (int count = 1; count <= 10; count++)       {

    Random randomNumber = new Random();

     int firstNumber = randomNumber.nextInt(21, 80);
     int secondNumber = randomNumber.nextInt(10, 20);

        System.out.println (firstNumber + "-" + secondNumber);
        int answer = input.nextInt();

        int rightAnswer = RandomSubstractionProblems.subtractionProblems(firstNumber, secondNumber);

        if (answer == rightAnswer)      {
    
            System.out.println ("You are correct!");
            correctAnswerCount +=1;
            
                }

            else    {
            System.out.println ("incorrect! Try again");
            
              }
            }

            System.out.println ("Your total score is " + correctAnswerCount + " out of 10");

        }























        }
