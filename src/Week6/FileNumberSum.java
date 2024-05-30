package Week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNumberSum {
    public static void main(String[] args) {
        System.out.println("Sum: -> " +sumNumbers());
    }

    private static int sumNumbers() {
        int sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("src/Week6/input.txt"))) {
            String line;
            // read line if it is not empty
            while ((line = br.readLine()) != null) {
                System.out.println("Number-> " + line);
                //add number to the sum
                sum = sum + Integer.parseInt(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return sum;
    }
}
