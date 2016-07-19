import java.math.BigInteger;

/**
 * n! means n × (n − 1) × ... × 3 × 2 × 1

 For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

 Find the sum of the digits in the number 100!
 */
public class problem20 {
    public static void main(String[] args) {
        BigInteger storage = new BigInteger("100");
        BigInteger factorial = new BigInteger("100");
        BigInteger one = new BigInteger("1");
        BigInteger next = factorial.subtract(one);

        for(int ii = 1; ii < 100; ii++) {
            storage = storage.multiply(next);
            next = next.subtract(one);
        }

        int sum = 0;

        for(int ii = 0; ii < storage.toString().length(); ii++) {
            sum = sum + Character.getNumericValue(storage.toString().charAt(ii));
        }

        System.out.println("Sum of the digits in the number 100! is: " + sum);
    }
}
