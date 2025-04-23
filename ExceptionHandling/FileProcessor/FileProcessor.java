package com.vardhan.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Custom Exception
class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}

public class FileProcessor {

    public static void readFile(String filePath) throws EmptyFileException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            if (line == null) {
                throw new EmptyFileException("The file is empty: " + filePath);
            }
            System.out.println("File content:");
            do {
                System.out.println(line);
                line = reader.readLine();
            } while (line != null);
        } catch (IOException e) {
            System.err.println("IO Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (EmptyFileException e) {
            System.err.println("Custom Exception: " + e.getMessage());
        }
    }
}
