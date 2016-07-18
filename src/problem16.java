/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000?
 */

import java.lang.Math;
import java.util.ArrayList;

public class problem16 {
    static final double num = Math.pow(2,1000);

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        String numString = Double.toString(num);
        double sum = 0;
        long num = (long)Math.pow(2,1000);
        System.out.println(num);

        for(int ii = 0; ii < numString.length(); ii++) {
            if(numString.charAt(ii) == '.') {
                break;
            } else {
                sum = sum + Double.parseDouble(Character.toString(numString.charAt(ii)));
            }
        }

        System.out.println("The answer is: " + sum);
    }
}
