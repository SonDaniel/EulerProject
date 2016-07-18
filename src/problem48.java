import java.math.BigInteger;

/**
 * The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.

 Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 */
public class problem48 {
    static BigInteger sum = new BigInteger("1");


    public static void main(String[] args) {
        for(int ii = 2; ii <= 1000; ii++) {
            BigInteger temp = new BigInteger(Integer.toString(ii));
            temp = temp.pow(ii);
            sum = sum.add(temp);
        }

        System.out.println(sum.toString().substring(sum.toString().length() - 10));
    }
}
