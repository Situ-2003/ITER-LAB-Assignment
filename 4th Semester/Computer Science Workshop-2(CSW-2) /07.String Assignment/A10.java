package Q10;
import java.util.*;
public class A10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String text=sc.next();

        while (true){
            System.out.println("Menu bar");
            System.out.println("1. Convert to lowercase");
            System.out.println("2. Convert to uppercase");
            System.out.println("3. Search for a character");
            System.out.println("4. Get character at index");
            System.out.println("5. Concatenate with another string");
            System.out.println("6. Exit");

            System.out.println("Enter choice");
            int choice= sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.println(text.toLowerCase());
                    break;
                case 2:
                    System.out.println(text.toUpperCase());
                    break;
                case 3:
                    System.out.println("Enter a character");
                    char v=sc.nextLine().charAt(0);
                    System.out.println(text.indexOf(v));
                    break;
                case 4:
                    System.out.println("enter the index");
                    System.out.println(text.charAt(sc.nextInt()));
                    break;
                case 5:
                    String d="Systumm";
                    System.out.println(text.concat(d));
                    break;
                case 6:
                    System.out.println("existing");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nothing is found");
                    break;

            }
        }


    }
    }
    /*
Output:-
Enter the String
Ankit
Menu bar
1. Convert to lowercase
2. Convert to uppercase
3. Search for a character
4. Get character at index
5. Concatenate with another string
6. Exit
Enter choice
1
ankit
Menu bar
1. Convert to lowercase
2. Convert to uppercase
3. Search for a character
4. Get character at index
5. Concatenate with another string
6. Exit
Enter choice
2
ANKIT
Menu bar
1. Convert to lowercase
2. Convert to uppercase
3. Search for a character
4. Get character at index
5. Concatenate with another string
6. Exit
Enter choice
3
Enter a character
k
2
Menu bar
1. Convert to lowercase
2. Convert to uppercase
3. Search for a character
4. Get character at index
5. Concatenate with another string
6. Exit
Enter choice
4
enter the index
2
k
Menu bar
1. Convert to lowercase
2. Convert to uppercase
3. Search for a character
4. Get character at index
5. Concatenate with another string
6. Exit
Enter choice
5
AnkitSystumm
Menu bar
1. Convert to lowercase
2. Convert to uppercase
3. Search for a character
4. Get character at index
5. Concatenate with another string
6. Exit
Enter choice
6
existing
 */

