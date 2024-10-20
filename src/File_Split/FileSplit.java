package File_Split;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FileSplit {
    
    public static void splitFile(String filePath, int linesPerPart) {
        Queue<String> queue = new LinkedList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            int lineCount = 0;
            int partCount = 1;

            System.out.println("Memisahkan file menjadi beberapa bagian...");

            while ((line = reader.readLine()) != null) {
                queue.add(line);
                lineCount++;


                if (lineCount == linesPerPart) {
                    System.out.println("\nPart " + partCount + ":");
                    printQueue(queue);
                    partCount++;
                    lineCount = 0;
                }
            }

            if (!queue.isEmpty()) {
                System.out.println("\nBagian " + partCount + ":");
                printQueue(queue);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    private static void printQueue(Queue<String> queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan file path (D:/test/sample.txt): ");
        String filePath = sc.nextLine();

        System.out.print("Berapa baris untuk setiap bagiannya: ");
        int linesPerPart = sc.nextInt();

        splitFile(filePath, linesPerPart);

        sc.close();
    }
}
