package Assignment3;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteStream {
    public static void main(String[] args) {
        String text = "Java I/O Streams Example";

        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(text.getBytes()); 
            System.out.println("Data written successfully to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
