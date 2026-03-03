/*
================================================================================================================
MAIN CLASS - UseCase13PerformancePalindromeApp
================================================================================================================

Use Case 13: Performance Comparison of Different Palindrome Approaches

Description:
This class demonstrates performance measurement of multiple
palindrome checking algorithms using a Hardcoded String.

At this stage, the application:
- Starts execution from the main method
- Displays a welcome message
- Shows application Version
- Stores a Hardcoded String
- Executes multiple palindrome algorithms (Stack, Deque, Recursion, Iterative)
- Captures execution time for each algorithm using System.nanoTime()
- Prints results including execution time and palindrome validation

Key Concepts:
System.nanoTime() – Measures elapsed time in nanoseconds for performance comparison.
Algorithm Comparison – Evaluates speed and efficiency of different palindrome strategies.
Logical Comparison – Each algorithm independently validates the string.

Data Structure Used: Varies per algorithm (Stack / Deque / Recursion / Array)

@author SAKET-2005
@version 13.0
================================================================================================================
*/

import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp
{
    public static void main(String args[])
    {
        System.out.println("Welcome to The Palindrome Checker");
        System.out.println("Author: SAKET-2005");
        System.out.println("Version: 13.0");

        String txt = "1234567890987654321"; // Longer string for performance demo

        // Stack-based palindrome
        long start = System.nanoTime();
        boolean stackResult = stackPalindrome(txt);
        long end = System.nanoTime();
        System.out.println("Stack Method: " + stackResult + ", Time = " + (end - start) + " ns");

        // Deque-based palindrome
        start = System.nanoTime();
        boolean dequeResult = dequePalindrome(txt);
        end = System.nanoTime();
        System.out.println("Deque Method: " + dequeResult + ", Time = " + (end - start) + " ns");

        // Recursive palindrome
        start = System.nanoTime();
        boolean recursiveResult = recursivePalindrome(txt, 0, txt.length() - 1);
        end = System.nanoTime();
        System.out.println("Recursive Method: " + recursiveResult + ", Time = " + (end - start) + " ns");

        // Iterative (array) palindrome
        start = System.nanoTime();
        boolean iterativeResult = iterativePalindrome(txt);
        end = System.nanoTime();
        System.out.println("Iterative Method: " + iterativeResult + ", Time = " + (end - start) + " ns");
    }

    public static boolean stackPalindrome(String text)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < text.length(); i++)
            stack.push(text.charAt(i));
        for(int i = 0; i < text.length(); i++)
            if(text.charAt(i) != stack.pop())
                return false;
        return true;
    }

    public static boolean dequePalindrome(String text)
    {
        Deque<Character> deque = new LinkedList<>();
        for(int i = 0; i < text.length(); i++)
            deque.addLast(text.charAt(i));
        while(deque.size() > 1)
            if(deque.removeFirst() != deque.removeLast())
                return false;
        return true;
    }

    public static boolean recursivePalindrome(String text, int start, int end)
    {
        if(start >= end)
            return true;
        if(text.charAt(start) != text.charAt(end))
            return false;
        return recursivePalindrome(text, start + 1, end - 1);
    }

    public static boolean iterativePalindrome(String text)
    {
        char[] chars = text.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while(start < end)
        {
            if(chars[start] != chars[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
}