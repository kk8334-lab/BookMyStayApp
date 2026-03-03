/*
================================================================================================================
MAIN CLASS - UseCase12StrategyPalindromeApp
================================================================================================================

Use Case 12: Dynamic Palindrome Algorithm Selection using Strategy Pattern

Description:
This class demonstrates dynamic selection of palindrome checking algorithms
using the Strategy Pattern with a Hardcoded String.

At this stage, the application:
- Starts execution from the main method
- Displays a welcome message
- Shows application Version
- Stores a Hardcoded String
- Defines a PalindromeStrategy interface
- Implements multiple strategies (StackStrategy, DequeStrategy)
- Allows the client to inject the desired strategy at runtime
- Prints whether the String is Palindrome or Not

Key Concepts (OOPS):
Interface – Defines a contract for palindrome checking strategies.
Polymorphism – Enables the client to use different strategies interchangeably.
Strategy Pattern – Encapsulates algorithms and makes them interchangeable.
Data Structure Used: Varies per strategy (Stack / Deque)

@author SAKET-2005
@version 12.0
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
        System.out.println("Version: 12.0");

        String txt = "12321";

        PalindromeStrategy strategy;

        // Choose strategy dynamically
        boolean useStack = true; // Change to false to use DequeStrategy

        if(useStack)
            strategy = new StackStrategy();
        else
            strategy = new DequeStrategy();

        boolean isPalindrome = strategy.checkPalindrome(txt);

        if(isPalindrome)
            System.out.println("The String \"" + txt + "\" is a Palindrome");
        else
            System.out.println("The String \"" + txt + "\" is Not a Palindrome");
    }
}

interface PalindromeStrategy
{
    boolean checkPalindrome(String text);
}

class StackStrategy implements PalindromeStrategy
{
    public boolean checkPalindrome(String text)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < text.length(); i++)
            stack.push(text.charAt(i));

        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i) != stack.pop())
                return false;
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy
{
    public boolean checkPalindrome(String text)
    {
        Deque<Character> deque = new LinkedList<>();
        for(int i = 0; i < text.length(); i++)
            deque.addLast(text.charAt(i));

        while(deque.size() > 1)
        {
            if(deque.removeFirst() != deque.removeLast())
                return false;
        }
        return true;
    }
}