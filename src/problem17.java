import java.util.HashMap;

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

 If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


 NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115
 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 */
public class problem17 {
    static HashMap<Integer, String> numberMap;

    public static void main(String[] args) {
        initializeData();
        int sum = 0;

        for(int ii = 1; ii <= 1000; ii++) {
            int tempThousand = 0, tempHundred = 0, tempTen = 0;
            String numString = "";
            int num = ii;

            if( num / 1000 != 0) {
                tempThousand =  num / 1000;
                 num =  num % 1000;
                numString = numString.concat(numberMap.get(tempThousand)).concat(numberMap.get(1000));
            }
            if( num / 100 != 0) {
                tempHundred =  num / 100;
                 num =  num % 100;
                numString = numString.concat(numberMap.get(tempHundred)).concat(numberMap.get(100));
            }
            if(tempHundred != 0 && num > 0) {
                numString = numString.concat("and");
            }

            if( num / 10 == 1) {
                numString = numString.concat(numberMap.get(num));
            } else {
                if ( num / 10 != 0) {
                    tempTen = ( num / 10) * 10;
                    num =  num % 10;
                    numString = numString.concat(numberMap.get(tempTen));
                }
                if ( num != 0) {
                    numString = numString.concat(numberMap.get(num));
                }
            }
            sum = sum + numString.length();
        }
        System.out.println("Answer is: " + sum);
    }

    public static void initializeData() {
        numberMap = new HashMap<>();
        numberMap.put(1, "one");
        numberMap.put(2, "two");
        numberMap.put(3, "three");
        numberMap.put(4, "four");
        numberMap.put(5, "five");
        numberMap.put(6, "six");
        numberMap.put(7, "seven");
        numberMap.put(8, "eight");
        numberMap.put(9, "nine");
        numberMap.put(10, "ten");
        numberMap.put(11, "eleven");
        numberMap.put(12, "twelve");
        numberMap.put(13, "thirteen");
        numberMap.put(14, "fourteen");
        numberMap.put(15, "fifteen");
        numberMap.put(16, "sixteen");
        numberMap.put(17, "seventeen");
        numberMap.put(18, "eighteen");
        numberMap.put(19, "nineteen");
        numberMap.put(20, "twenty");
        numberMap.put(30, "thirty");
        numberMap.put(40, "forty");
        numberMap.put(50, "fifty");
        numberMap.put(60, "sixty");
        numberMap.put(70, "seventy");
        numberMap.put(80, "eighty");
        numberMap.put(90, "ninety");
        numberMap.put(100, "hundred");
        numberMap.put(1000, "thousand");
    }
}
