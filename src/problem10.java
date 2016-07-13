/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 Find the sum of all the primes below two million.
 */
public class problem10 {
    public static void main(String[] args){
        int sum = 0;
        final int MAX = 2000000;

        for(int ii = 0; ii <= MAX; ii++)
        {
            boolean isPrime = checkPrime(ii);
            if(isPrime)
            {
                System.out.println(ii);
                sum += ii;
            }
        }

    }

    private static boolean checkPrime(long number){
        boolean isPrime = true;
        long temp;
        for(long ii = 2; ii <= number / 2; ii++)
        {
            temp = number%ii;
            if(temp == 0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
