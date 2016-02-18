/**
 * Problem 5 prompt:
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class problem5 {
    public static void main(String[] args){
        int number = 2520;
        boolean isDivisible = false;

        do
        {
            number++;
            isDivisible = checkDiv(number);

        }while(!isDivisible);

        System.out.println("The answer is: " + number);
    }

    private static boolean checkDiv(int number){
        boolean isDivisible = false;
        for(int ii = 1; ii <= 20; ii++)
        {
            if(number % ii == 0)
            {
                isDivisible = true;
            }
            else
            {
                isDivisible = false;
                break;
            }
        }

        return isDivisible;
    }

}
