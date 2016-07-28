/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

 a^2 + b^2 = c^2
 For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

 There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 Find the product abc.
 */
import java.lang.Math;

public class problem9 {
    public static void main(String[] args) {
        System.out.println("Answer is: " + pythagorTrip(1000));
    }

    public static int pythagorTrip(int num) {
        double a;
        for (int b = 1; b < num/2; b++) {
            a = (500000 - (1000 * b))/(1000 - b);
            if (a < b && (Math.pow(a,2) + Math.pow(b,2) == Math.pow(num-a-b,2))) {
                return (int) (a*b*(num-a-b));
            }
        }
        return -1;
    }
}