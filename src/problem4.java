/**
 * Problem 4 prompt:
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

import java.util.Stack;

public class problem4 {
    public static void main(String[] args){

        //firstNumber and secondNumber set largest 3 digit numbers
        int firstNumber = 999;
        int secondNumber = 999;
        int product;
        boolean palindrome;

        do
        {
            product = firstNumber * secondNumber;
            palindrome = checkPalindrome(product);


            if(palindrome == false)
            {
                secondNumber--;
                if(secondNumber == 900) //restricting condition
                {
                    firstNumber--;
                    secondNumber = 999;
                }
            }
        }while(!(palindrome));

        System.out.println("The firstNumber is: " + firstNumber);
        System.out.println("The secondNumber is: " + secondNumber);
        System.out.println("The Answer is: " + product);
    }

    private static boolean checkPalindrome(int number){
        Stack<Character> numStack = new Stack();
        String numString = Integer.toString(number);

        boolean isPalindrome = false;

        for(int ii = 0; ii < numString.length();ii++)
        {
            numStack.push(numString.charAt(ii));
        }

        String checkPalindrome = "";

        while(!(numStack.isEmpty()))
        {
            checkPalindrome = checkPalindrome + numStack.pop();
        }

        if(numString.equals(checkPalindrome))
        {
            isPalindrome = true;
        }

        return isPalindrome;

    }
}
