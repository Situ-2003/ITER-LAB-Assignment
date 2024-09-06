package Q5_1;

import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for base string and number of concatenations
        System.out.println("Enter the base string:");
        String baseString = scanner.nextLine();
        System.out.println("Enter the number of concatenations:");
        int numConcatenations = scanner.nextInt();

        // Using StringBuilder
        System.out.println("\nUsing StringBuilder...");
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder(baseString);
        for (int i = 1; i < numConcatenations; i++) {
            stringBuilder.append(baseString);
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        long elapsedTimeStringBuilder = endTimeStringBuilder - startTimeStringBuilder;
        String resultStringBuilder = stringBuilder.toString();

        // Using StringBuffer
        System.out.println("Using StringBuffer...");
        long startTimeStringBuffer = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer(baseString);
        for (int i = 1; i < numConcatenations; i++) {
            stringBuffer.append(baseString);
        }
        long endTimeStringBuffer = System.currentTimeMillis();
        long elapsedTimeStringBuffer = endTimeStringBuffer - startTimeStringBuffer;
        String resultStringBuffer = stringBuffer.toString();

        // Output results
        System.out.println("Time taken using StringBuilder: " + elapsedTimeStringBuilder + " milliseconds");
        System.out.println("Final string length using StringBuilder: " + resultStringBuilder.length());
        System.out.println();
        System.out.println("Time taken using StringBuffer: " + elapsedTimeStringBuffer + " milliseconds");
        System.out.println("Final string length using StringBuffer: " + resultStringBuffer.length());

        // Compare performance
        long timeDifference = elapsedTimeStringBuffer - elapsedTimeStringBuilder;
        System.out.println("\nComparison: ");
        if (timeDifference > 0) {
            System.out.println("StringBuilder was faster than StringBuffer by " + timeDifference + " milliseconds.");
        } else if (timeDifference < 0) {
            System.out.println("StringBuffer was faster than StringBuilder by " + (-timeDifference) + " milliseconds.");
        } else {
            System.out.println("StringBuilder and StringBuffer performed equally.");
        }
    }
}
/*
Output:-
Enter the base string:
ankit
Enter the number of concatenations:
4

Using StringBuilder...
Using StringBuffer...
Time taken using StringBuilder: 0 milliseconds
Final string length using StringBuilder: 20

Time taken using StringBuffer: 0 milliseconds
Final string length using StringBuffer: 20

Comparison:
StringBuilder and StringBuffer performed equally.
 */
