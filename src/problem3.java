/**
 * Question 3 prompt:
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class problem3 {
    public static void main(String[] args){
        final long testNumber = 600851475143L;
        long largestPrimeFactor = 0L;
        long count = 0L;
        boolean PrimeFactor = false;
        do
        {
            count++;
            if(checkPrime(count))
            {
                if(testNumber % count == 0)
                {
                    largestPrimeFactor = count;
                    System.out.println(largestPrimeFactor);
                }
            }
        }while(!(PrimeFactor));

        System.out.println("The answer is:" + largestPrimeFactor);
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
