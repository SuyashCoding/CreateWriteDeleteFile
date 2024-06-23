import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * creates, writes to, and deletes a file
 * @author Suyash Patel
 */
public class CreateWriteDeleteFile {

    /**
     * main method
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("file.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File: " + file.getName());
            } else {
                System.out.println("File already exists");
            }

            FileWriter writer = new FileWriter(file);
            System.out.println("What would you like to write to the file?");
            String input = scanner.nextLine();
            writer.write(input);
            writer.close();
            System.out.println("Wrote to the file");

            if (file.delete()) {
                System.out.println("File deleted");
            } else {
                System.out.println("Could not delete file.");
            }

        } catch (IOException e) {
            System.out.println("Error");
        }
        scanner.close();
    }
}
