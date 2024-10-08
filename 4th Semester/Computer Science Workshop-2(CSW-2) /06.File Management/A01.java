import java.util.*;
import java.time.*;
import java.io.*;
import java.time.format.*;
public class A01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your diary entry:");
        String entry = scanner.nextLine();

        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(formatter);

        File file = new File("diary.txt");
        if (file.exists()) {
            System.out.println("File already exists. Appending to existing file.");
        }

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(formattedDate + ": " + entry + "\n");
            System.out.println("Entry added to diary.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

/*
  OUTPUT

  Enter your diary entry:
  Hello my self Ankit
  Entry added to diary.

  IF FILE IS ALREADY CREATED WITH ANY DATA, THEN THE OUTPUT WILL COME AS
  Enter your diary entry:
  Ankit Rout
  File already exists. Appending to existing file.
  Entry added to diary.
 */
