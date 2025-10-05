package Assignment3;

import java.io.File;
import java.util.Scanner;

public class ListFilesInDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String dirPath = sc.nextLine();
        
        File directory = new File(dirPath);

        if (directory.exists() && directory.isDirectory()) {
            String[] files = directory.list();
            System.out.println("Files in directory:");
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("Invalid directory path!");
        }
        
        sc.close();
    }
}

