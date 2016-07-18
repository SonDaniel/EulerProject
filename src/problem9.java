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
        double a = 1.0,b = 2.0,c;
        final double max = 1000;
        boolean found = false;

        while(!found) {
            c = Math.pow(a, 2) + Math.pow(b, 2);
            if(isPerfectSquare(c)) {

            }
        }

//
//        while(!found) {
//            if(!isPerfectSquare(a)) {
//                a++;
//            } else if(!isPerfectSquare(b)) {
//                b++;
//            } else if(!isPerfectSquare(c)) {
//                c++;
//            } else {
//                if(a < b && b < c) { //check if condition is true a < b < c
//                    if(a + b + c == max) {
//                        found = true;
//                    }
//                }
//            }
//        }
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        System.out.println("The product: " + (a * b * c));
    }

    public static boolean isPerfectSquare(double num) {
        return num != 0.0 && (num == Math.sqrt(num) * 2);
    }


}
