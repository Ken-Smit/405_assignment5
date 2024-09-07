//Kenneth Smith
//9-7-2024
//Assignment 5

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Random;

public class Program2 {
    public static void main(String[] args) {
        String fileName = "data.file";
        createFileIfNotExists(fileName);
        writeToFile(fileName, 10);

        System.out.println("File contents:");
        readFromFile(fileName);
    }

    private static void createFileIfNotExists(String fileName) {
        try (PrintWriter out = new PrintWriter(fileName)) {
            // do nothing
        } catch (IOException e) {
            System.err.println("Error creating file: " + e.getMessage());
        }
    }

    private static void writeToFile(String fileName, int count) {
        String[] numbers = generateRandomNumbers(count);
        try (PrintWriter out = new PrintWriter(fileName)) {
            for (String num : numbers) {
                out.print(num + " ");
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void readFromFile(String fileName) {
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    private static String[] generateRandomNumbers(int count) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            int num = rand.nextInt(100);
            sb.append(num).append(" ");
        }
        return sb.toString().split("\\s+");
    }
}