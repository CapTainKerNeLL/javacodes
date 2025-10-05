package Assignment3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteExample {
    public static void main(String[] args) {
        String text = "This is an example using BufferedWriter in Java.";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("buffered_example.txt"))) {
            bw.write(text);
            bw.newLine(); // adds a newline
            bw.write("Buffered I/O improves performance!");
            System.out.println("Data written successfully to buffered_example.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

