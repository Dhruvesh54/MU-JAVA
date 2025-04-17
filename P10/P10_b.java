// 10(b). Write a java program that opens an input file stream and an output file stream, reads each byte
// from the input file and writes it to the output file, handles any exceptions and ensures resources are
// closed properly.
import java.io.*;

public class P10_b {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            // Open input and output file streams
            inputStream = new FileInputStream("D:\\MU\\Sem 4\\MU-JAVA\\P10\\input.txt");
            outputStream = new FileOutputStream("D:\\MU\\Sem 4\\MU-JAVA\\P10\\output.txt");
            int byteData;
            // Read and write one byte at a time
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        } finally {
            try {
                // Close the streams if they were opened
                if (inputStream != null)
                    inputStream.close();
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException ex) {
                System.out.println("Error closing files: " + ex);
            }
        }
    }
}
