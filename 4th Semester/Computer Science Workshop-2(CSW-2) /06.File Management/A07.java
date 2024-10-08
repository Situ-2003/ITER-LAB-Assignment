import java.io.*;
import java.util.Scanner;

public class A07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the source file path:");
        String sourceFilePath = scanner.nextLine();

        System.out.println("Enter the destination file path:");
        String destinationFilePath = scanner.nextLine();

        File sourceFile = new File(sourceFilePath);
        File destinationFile = new File(destinationFilePath);

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        if (destinationFile.exists()) {
            System.out.println("Destination file already exists. Do you want to overwrite it? (Y/N)");
            String overwriteChoice = scanner.nextLine().trim().toLowerCase();
            if (!overwriteChoice.equals("y")) {
                System.out.println("File copy operation canceled.");
                return;
            }
        }

        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destinationFile)) {
            int data;
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}

/*
  OUTPUT

  Enter the source file path:
diary.txt
Enter the destination file path:
ankit.txt
Destination file already exists. Do you want to overwrite it? (Y/N)
Y
File copied successfully.
 */
