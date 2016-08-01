/**
 * Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

 1634 = 1^4 + 6^4 + 3^4 + 4^4
 8208 = 8^4 + 2^4 + 0^4 + 8^4
 9474 = 9^4 + 4^4 + 7^4 + 4^4
 As 1 = 1^4 is not a sum it is not included.

 The sum of these numbers is 1634 + 8208 + 9474 = 19316.

 Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */
public class problem30 {
    public static void main(String[] args) {
        double sum = 0;
        for(int ii = 2; ii <= 355000; ii++) {
            String numString = Integer.toString(ii);
            double checkNum = 0;
            for(int jj = 0; jj < numString.length(); jj++) {
                double tempNum = Math.pow(Character.getNumericValue(numString.charAt(jj)), 5);
                checkNum = checkNum + tempNum;
            }
            if(checkNum == ii) {
                sum = sum + checkNum;
                System.out.println(checkNum);
            }
        }
        System.out.println("The answer is: " + sum);
    }
}
