import java.math.BigInteger;

/**
 * The following iterative sequence is defined for the set of positive integers:

 n → n/2 (n is even)
 n → 3n + 1 (n is odd)

 Using the rule above and starting with 13, we generate the following sequence:

 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

 Which starting number, under one million, produces the longest chain?

 NOTE: Once the chain starts the terms are allowed to go above one million.
 */

public class problem14 {
    static long term = 0;
    static long tempTerm = 0;
    static long tempNum = 0;

    public static void main(String[] args) {
        int biggestNum = 0;

        for(int ii = 1000000; ii > 0; ii--) {
            tempNum = ii;
            tempTerm = 0;
            while(tempNum != 1) {
                checkNumber(tempNum);
            }

            if(tempTerm > term) {
                term = tempTerm;
                biggestNum = ii;
            }
        }

        System.out.println("The biggest number is: " + biggestNum);
        System.out.println("with " + term + " many terms");
    }

    public static void checkNumber(long number) {
        tempTerm++;
        if(number % 2 == 0) {
            tempNum = isEven(number);
        } else {
            tempNum = isOdd(number);
        }
    }

    public static long isEven(long number) {
        return number / 2;
    }

    public static long isOdd(long number) {
        return (3 * number) + 1;
    }
}
