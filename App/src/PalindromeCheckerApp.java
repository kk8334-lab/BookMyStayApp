/*
================================================================================================================
MAIN CLASS - UseCase10NormalizedPalindromeApp
================================================================================================================

Use Case 10: Palindrome Validation Ignoring Spaces and Case

Description:
This class demonstrates palindrome validation by ignoring
spaces and character case differences using a Hardcoded String.

At this stage, the application:
- Starts execution from the main method
- Displays a welcome message
- Shows application Version
- Stores a Hardcoded String
- Normalizes the String by removing spaces using Regular Expressions
- Converts the String to lowercase for case-insensitive comparison
- Applies palindrome checking logic on the processed String
- Prints whether the original String is Palindrome or Not

Key Concepts:
String Pre-processing – Preparing the string before validation.
Regular Expressions – Used to remove unwanted characters such as spaces.
Case Normalization – Converting characters to uniform case.
Logical Comparison – Matching characters from start and end positions.

Data Structure Used: String / Character Array

@author SAKET-2005
@version 10.0
================================================================================================================
*/

public class PalindromeCheckerApp
{
    public static void main(String args[])
    {
        System.out.println("Welcome to The Palindrome Checker");
        System.out.println("Author: SAKET-2005");
        System.out.println("Version: 10.0");

        String txt = "Never Odd Or Even";

        String normalized = txt.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        while(start < end)
        {
            if(normalized.charAt(start) != normalized.charAt(end))
            {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome)
            System.out.println("The String \"" + txt + "\" is a Palindrome (Ignoring spaces and case)");
        else
            System.out.println("The String \"" + txt + "\" is Not a Palindrome");
    }
}