/**
 * Problem 7 prompt:
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class problem7 {
    public static void main(String[] args){
        int count = 0, counting = 0;
        int prime = 0;

        while(counting <= 10001)
        {
            count++;
            System.out.println(count);
            if(checkPrime(count))
            {
                prime = count;
                counting++;
            }
        }

        System.out.println("The count is: " + counting);
        System.out.println("The prime number is: " + prime);
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
