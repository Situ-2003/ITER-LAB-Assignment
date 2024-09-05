import java.io.File;
import java.util.Scanner;

public class A04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the directory path:");
        String directoryPath = scanner.nextLine();

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory does not exist.");
            return;
        }

        File[] filesAndDirectories = directory.listFiles();
        if (filesAndDirectories != null) {
            System.out.println("Files and subdirectories in " + directory.getAbsolutePath() + ":");
            for (File file : filesAndDirectories) {
                if (file.isDirectory()) {
                    System.out.println("[Directory] " + file.getName());
                } else {
                    System.out.println("[File] " + file.getName());
                }
            }
        } else {
            System.out.println("Failed to list files and subdirectories in the directory.");
        }
    }
}

/*
  OUTPUT

 Enter the directory path:
 diary.txt
 The specified directory does not exist.
 */
