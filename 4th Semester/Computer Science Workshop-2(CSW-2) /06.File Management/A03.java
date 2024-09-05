import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class A03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your new diary entry:");
        String newEntry = scanner.nextLine();

        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        try (FileWriter writer = new FileWriter("diary.txt", true)) {
            writer.write("\n" + formattedDateTime + ": " + newEntry);
            System.out.println("New entry added to the diary.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}

/*
  OUTPUT

  Enter your new diary entry:
  it take more time to tell anythig to love one
  New entry added to the diary.
 */