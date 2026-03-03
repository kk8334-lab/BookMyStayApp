/*
================================================================================================================
MAIN CLASS - UseCase11EncapsulatedPalindromeApp
================================================================================================================

Use Case 11: Encapsulating Palindrome Logic in a Class

Description:
This class demonstrates palindrome validation using encapsulation
by defining a separate PalindromeChecker class.

At this stage, the application:
- Starts execution from the main method
- Displays a welcome message
- Shows application Version
- Stores a Hardcoded String
- Uses the PalindromeChecker class to validate the string
- Prints whether the String is Palindrome or Not

Key Concepts (OOPS):
Encapsulation – Hides internal implementation and exposes a public method.
Single Responsibility Principle – PalindromeChecker class only handles palindrome logic.
Logical Comparison – Matching characters from start and end positions using internal structures.

Data Structure Used: Internal (Stack / Character Array)

@author SAKET-2005
@version 11.0
================================================================================================================
*/

public class PalindromeCheckerApp
{
    public static void main(String args[])
    {
        System.out.println("Welcome to The Palindrome Checker");
        System.out.println("Author: SAKET-2005");
        System.out.println("Version: 11.0");

        String txt = "racecar";

        PalindromeChecker checker = new PalindromeChecker(txt);

        if(checker.checkPalindrome())
            System.out.println("The String \"" + txt + "\" is a Palindrome");
        else
            System.out.println("The String \"" + txt + "\" is Not a Palindrome");
    }
}

class PalindromeChecker
{
    private String text;

    public PalindromeChecker(String text)
    {
        this.text = text;
    }

    public boolean checkPalindrome()
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