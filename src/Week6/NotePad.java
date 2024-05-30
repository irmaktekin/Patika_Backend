package Week6;

import java.io.*;
import java.util.Scanner;

public class NotePad {
    private static String path = System.getProperty("user.dir")+"/input2.txt";

    public static void main(String[] args) throws IOException {
        System.out.println(path);
        writeToFile(getInput());
        readFile();
    }

    //Get input
    static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your text: ");
        String text = scanner.nextLine();
        return text;

    }

    //Write to a file
    static void writeToFile(String text) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(text);
            printWriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Read from file
    static void readFile(){
        try {
            FileReader fileReader = null;
            fileReader = new FileReader(path);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String readedText = null;
            while ((readedText = bufferedReader.readLine()) != null) {
                System.out.println("text-> " + readedText);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
