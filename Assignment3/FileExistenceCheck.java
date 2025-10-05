package Assignment3;

import java.io.File;
import java.io.IOException;

public class FileExistenceCheck {
    public static void main(String[] args) {
        File file = new File("testfile.txt");

        try {
            if (file.exists()) {
                System.out.println("File already exists: " + file.getAbsolutePath());
            } else {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getAbsolutePath());
                } else {
                    System.out.println("Failed to create file.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

