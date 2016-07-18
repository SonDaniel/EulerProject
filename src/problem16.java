import java.math.BigInteger;

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000?
 */

public class problem16 {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("2");
        num = num.pow(1000);
        int sum = 0;
        String string = num.toString();
        for(int ii = 0; ii < string.length(); ii++) {
            if(!(string.charAt(ii) == '0')) {
                sum = sum + Character.getNumericValue(string.charAt(ii));
            }
        }

        System.out.println("Answer is: " + sum);
    }
}
