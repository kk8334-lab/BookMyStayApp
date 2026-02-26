/*
================================================================================================================
MAIN CLASS - UseCase2PalindromeApp
================================================================================================================

Use Case 1: Hardcoded Palindrome Validation

Description:
This class represents basic palindrome validation using
a Hardcoded String Value

At this stage, the application:
- Starts execution from the main method
- Displays a welcome message
- Shows application Version
- Stores a Hardcoded String
- Reverses the String and stores it
- Compares to the Original and Checks if the String is Palindrome.


The goal is to find if a Hardcoded string is Palindrome or not.

@author SAKET-2005
@version 2.0
 */

public class PalindromeCheckerApp
{
    public static void main(String args[])
    {
        System.out.println("Welcome to The Palindrome Checker");
        System.out.println("Author: SAKET-2005");
        System.out.println("Version: 1.0");
        String txt = "123321";
        String rev = new StringBuilder(txt).reverse().toString();
        if(txt.equals(rev))
            System.out.println("The String "+txt+" is a Palindrome");
        else
            System.out.println("The String "+txt+" is Not a Palindrome");
    }
}