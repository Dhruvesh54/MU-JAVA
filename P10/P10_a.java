// 10(a) Write a java program that accepts user input from the console until the user types "exit", writes
// each line to a text file, reads the content of the file back and displays it on the console.

import java.io.*;

public class P10_a {
    public static void main(String[] args) {
        try {
            // Create InputStreamReader to read from console
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(isr);
            // Ask user for input
            System.out.println("Enter some text to write to file (type 'exit' to finish):");
            // File to write to
            File file = new File("example.txt");
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter writer = new BufferedWriter(osw);
            String line;
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();
            System.out.println("Text written to file successfully.\n");
            // Now read from the file and display contents
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader fileReader = new InputStreamReader(fis);
            BufferedReader fileBufferedReader = new BufferedReader(fileReader);
            System.out.println("Contents of the file:");
            String fileLine;
            while ((fileLine = fileBufferedReader.readLine()) != null) {
                System.out.println(fileLine);
            }
            fileBufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
