import java.io.File;
import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the directory path:");
        String directoryPath = scanner.nextLine();

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory does not exist.");
            return;
        }

        System.out.println("Contents of directory " + directory.getAbsolutePath() + ":");
        listFilesAndSubdirectories(directory, 0);
    }

    private static void listFilesAndSubdirectories(File directory, int depth) {
        File[] filesAndDirectories = directory.listFiles();
        if (filesAndDirectories != null) {
            for (File file : filesAndDirectories) {
                for (int i = 0; i < depth; i++) {
                    System.out.print("  ");
                }
                System.out.println(file.getName());
                if (file.isDirectory()) {
                    listFilesAndSubdirectories(file, depth + 1);
                }
            }
        }
    }
}

/*
  OUTPUT
 Enter the directory path:
 E:\semester 4\CSW\java\file management github
 Contents of directory E:\semester 4\CSW\java\file management github:
 .idea
 .gitignore
 file management github.iml
 misc.xml
 modules.xml
 workspace.xml
 A01.java
 A02.java
 A03.java
 A04.java
 A05.java
 A06.java
 A07.java
 A08.java
 A09.java
 A10.java
 diary.txt
 out
 production
 file management github
 .idea
 .gitignore
 file management github.iml
 misc.xml
 modules.xml
 workspace.xml
 A01.class
 A02.class
 A03.class
 A04.class
 A05.class
 A06.class
 A07.class
 A08.class
 A09.class
 A10.class
 diary.txt
 situ.txt
 situ.txt

 */
