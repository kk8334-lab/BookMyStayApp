/*
================================================================================================================
MAIN CLASS - UseCase8LinkedListPalindromeApp
================================================================================================================

Use Case 8: Palindrome Validation using Singly Linked List

Description:
This class demonstrates palindrome validation using
a Singly Linked List with a Hardcoded String.

At this stage, the application:
- Starts execution from the main method
- Displays a welcome message
- Shows application Version
- Stores a Hardcoded String
- Converts the String into a Singly Linked List
- Uses Fast and Slow Pointer technique to find the middle
- Reverses the second half of the linked list in-place
- Compares the first half and reversed second half
- Prints whether the String is Palindrome or Not

Key Concepts:
Singly Linked List – A dynamic data structure where elements are connected using node references.
Node Traversal – Sequential access to elements using next references.
Fast and Slow Pointer Technique – Used to find the middle of the linked list efficiently.
In-Place Reversal – Reverses the second half of the list without extra memory.
Logical Comparison – Matching first half with reversed second half.

Data Structure Used: Singly Linked List

@author SAKET-2005
@version 8.0
================================================================================================================
*/

public class PalindromeCheckerApp
{
    static class Node
    {
        char data;
        Node next;

        Node(char data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[])
    {
        System.out.println("Welcome to The Palindrome Checker");
        System.out.println("Author: SAKET-2005");
        System.out.println("Version: 8.0");

        String txt = "123321";

        Node head = null;
        Node tail = null;

        for(int i = 0; i < txt.length(); i++)
        {
            Node newNode = new Node(txt.charAt(i));
            if(head == null)
            {
                head = newNode;
                tail = newNode;
            }
            else
            {
                tail.next = newNode;
                tail = newNode;
            }
        }

        if(head == null || head.next == null)
        {
            System.out.println("The String " + txt + " is a Palindrome");
            return;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        Node current = slow;
        Node next = null;

        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        Node firstHalf = head;
        Node secondHalf = prev;

        boolean isPalindrome = true;

        while(secondHalf != null)
        {
            if(firstHalf.data != secondHalf.data)
            {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        if(isPalindrome)
            System.out.println("The String " + txt + " is a Palindrome");
        else
            System.out.println("The String " + txt + " is Not a Palindrome");
    }
}