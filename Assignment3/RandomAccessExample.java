package Assignment3;

import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessExample {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("random.txt", "rw")) {
            
            // Write data at the beginning
            raf.writeBytes("Hello, RandomAccessFile!");

            // Move file pointer to position 7 and overwrite
            raf.seek(7);
            raf.writeBytes("Java");

            // Read from the beginning
            raf.seek(0);
            String line;
            while ((line = raf.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


