import java.math.BigInteger;

/**
 * The Fibonacci sequence is defined by the recurrence relation:

 Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
 Hence the first 12 terms will be:

 F1 = 1
 F2 = 1
 F3 = 2
 F4 = 3
 F5 = 5
 F6 = 8
 F7 = 13
 F8 = 21
 F9 = 34
 F10 = 55
 F11 = 89
 F12 = 144
 The 12th term, F12, is the first term to contain three digits.

 What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */
public class problem25 {
    static BigInteger x = new BigInteger("1");
    static BigInteger y = new BigInteger("1");
    static int count = 2;
    static BigInteger temp;

    public static void main(String[] args) {
        boolean found = false;
        while(!found) {
            fib();
            if (y.toString().length() == 1000) {
                found = true;
            }
        }

        System.out.println(y.toString());
        System.out.println("Index is: " + count);
    }

    public static void fib() {
        count++;
        temp = x;
        temp = temp.add(y);
        x = y;
        y = temp;
    }
}
