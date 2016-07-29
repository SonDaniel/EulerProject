import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

 For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

 What is the total of all the name scores in the file?
 */
public class problem22 {
    static HashMap<Character, Integer> worthMap;
    public static void main(String[] args) {
        int sum = 0;
        initializeMap();
        ArrayList<String> dataString = new ArrayList<>();
        try {
            Scanner file = new Scanner(new File("p22_names.txt")).useDelimiter("\",\"");

            while(file.hasNext()) {
                dataString.add(file.next());
            }
            Collections.sort(dataString);

            for(String name : dataString) {
                char[] temp = name.toCharArray();
                int tempAdd = 0;
                for(char character : temp) {
                    tempAdd = tempAdd + worthMap.get(character);
                }

                sum = sum + (tempAdd * (dataString.indexOf(name) + 1));
            }
        }catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }

        System.out.println("The answer is: " + sum);
    }

    private static void initializeMap(){
        worthMap = new HashMap<>();
        worthMap.put('A', 1);
        worthMap.put('B', 2);
        worthMap.put('C', 3);
        worthMap.put('D', 4);
        worthMap.put('E', 5);
        worthMap.put('F', 6);
        worthMap.put('G', 7);
        worthMap.put('H', 8);
        worthMap.put('I', 9);
        worthMap.put('J', 10);
        worthMap.put('K', 11);
        worthMap.put('L', 12);
        worthMap.put('M', 13);
        worthMap.put('N', 14);
        worthMap.put('O', 15);
        worthMap.put('P', 16);
        worthMap.put('Q', 17);
        worthMap.put('R', 18);
        worthMap.put('S', 19);
        worthMap.put('T', 20);
        worthMap.put('U', 21);
        worthMap.put('V', 22);
        worthMap.put('W', 23);
        worthMap.put('X', 24);
        worthMap.put('Y', 25);
        worthMap.put('Z', 26);


    }
}
