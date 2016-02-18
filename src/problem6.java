/**
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class problem6 {
    public static void main(String[] args){
        int first = SqOfSum();
        int second = SumOfSq();

        int difference = first - second;

        System.out.println("The answer is: " + difference);
    }

    public static int SumOfSq(){
        int sum = 0;

        for(int ii = 1; ii <= 100; ii++)
        {
            sum = sum + (ii * ii);
        }

        return sum;
    }

    public static int SqOfSum(){
        int sum = 0;

        for(int ii = 1; ii <= 100; ii++)
        {
            sum += ii;
        }

        int squared = sum * sum;
        return squared;
    }
}
