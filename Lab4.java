package gee_lab4;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab4 {
    private static final String FILE_NAME = "FILENAME";


    public static void main(String[] args) throws FileNotFoundException {
        LinkedList linkedList = new LinkedList();
        File file = new File(FILE_NAME);
        boolean fileExists = file.exists();
        if (!fileExists) {
            System.err.println("File not found: " + FILE_NAME);
            System.exit(1);
        }
        Scanner scanner = null;
        // Perform file reading only if the file exists
        if (fileExists) {
            try {
                scanner = new Scanner(file);
                while (scanner.hasNextInt()) {
                    int data = scanner.nextInt();
                    linkedList.insertInOrder(data);
                }
            } finally {
                if (scanner != null) {
                    scanner.close();
                }
            }
        }

        System.out.println("Linked List in Numerical Order:");
        System.out.println(linkedList);
    }
}
