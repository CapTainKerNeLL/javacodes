package Assignment3;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCharStream {
    public static void main(String[] args) {
        String text = "This is an example using FileWriter in Java.";

        try (FileWriter fw = new FileWriter("example.txt")) {
            fw.write(text);
            System.out.println("Data written successfully to example.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

