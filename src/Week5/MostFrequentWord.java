package Week5;

import java.util.*;

public class MostFrequentWord {
    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();

        //Input operations
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text please:");
        //It is for preventing "I" to become i when lowercase.
        String text = scanner.nextLine().toLowerCase(Locale.forLanguageTag("tr"));

        //Split the input text based on, spaces or punctuation characters.
        String words [] = text.split("[\\s\\p{Punct}]+");

        int maxValue = Integer.MIN_VALUE;
        String word = "";
        for(int i=0;i< words.length;i++){
            word = words[i];
            int count =0;
            if(map.containsKey(word)){
                continue;
            }

            for(int j=0;j< words.length;j++){
                if(j< words.length){
                    if(words[i].equals(words[j])){
                        count+=1;
                    }
                }
            }
            map.put(word,count);

        }
        for (int value : map.values()) {
            // Find the max value in a map
            if (value > maxValue) {
                maxValue = value;
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            //If it finds the max occurrence for more than one element, it will print both elements.
            if (entry.getValue() == maxValue) {
                System.out.println(entry.getKey());
            }
        }
    }
}
