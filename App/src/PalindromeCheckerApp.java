/*
================================================================================================================
MAIN CLASS - UseCase4PalindromeApp
================================================================================================================

Use Case 4: Character Array Conversion and Validation

Description:
This class represents basic palindrome validation using
a Hardcoded String Value

At this stage, the application:
- Starts execution from the main method
- Displays a welcome message
- Shows application Version
- Stores a Hardcoded String
- Converts the String to Char Array
- Iterates the String from the other end and checks if the characters are same.
-If they are same, prints that it is Palindrome, otherwise its not.
- Prints the Original String as Well as the Reversed String for the User to see.


The goal is to find if a Hardcoded string is Palindrome or not.

@author SAKET-2005
@version 4.0
 */

public class PalindromeCheckerApp
{
    public static void main(String args[])
    {
        System.out.println("Welcome to The Palindrome Checker");
        System.out.println("Author: SAKET-2005");
        System.out.println("Version: 1.0");
        String txt = "123321";
        char str[] = txt.toCharArray();
        int n = str.length;
        int m = n-1;
        int c = 0;
        for(int i = 0; i<n; i++)
        {
            if(str[i]==str[m])
                c++;
            m--;
        }
        if(c==n)
            System.out.println("The String "+txt+" is a Palindrome");
        else
            System.out.println("The String "+txt+" is Not a Palindrome");
    }
}