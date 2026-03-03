/*
================================================================================================================
MAIN CLASS - UseCase7DequePalindromeApp
================================================================================================================

Use Case 7: Palindrome Validation using Deque (Double Ended Queue)

Description:
This class demonstrates palindrome validation using
Deque (Double Ended Queue) with a Hardcoded String.

At this stage, the application:
- Starts execution from the main method
- Displays a welcome message
- Shows application Version
- Stores a Hardcoded String
- Inserts characters into a Deque
- Removes characters from both Front and Rear
- Compares first and last characters directly
- Continues comparison until Deque becomes empty or mismatch occurs
- Prints whether the String is Palindrome or Not

Key Concepts:
Deque (Double Ended Queue) – A data structure that allows insertion and deletion from both front and rear ends.
Front and Rear Access – Enables direct comparison of first and last characters.
Optimized Data Handling – Eliminates the need for separate reversal data structures.
Logical Comparison – Matching front and rear elements to validate palindrome logic.

Data Structure Used: Deque

@author SAKET-2005
@version 7.0
================================================================================================================
*/

import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp
{
    public static void main(String args[])
    {
        System.out.println("Welcome to The Palindrome Checker");
        System.out.println("Author: SAKET-2005");
        System.out.println("Version: 7.0");

        String txt = "123321";

        Deque<Character> deque = new LinkedList<>();

        for(int i = 0; i < txt.length(); i++)
        {
            deque.addLast(txt.charAt(i));
        }

        boolean isPalindrome = true;

        while(deque.size() > 1)
        {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if(front != rear)
            {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("The String " + txt + " is a Palindrome");
        else
            System.out.println("The String " + txt + " is Not a Palindrome");
    }
}