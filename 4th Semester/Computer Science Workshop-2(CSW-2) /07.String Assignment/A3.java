package Q3_1;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        while (true) {
            System.out.println("a=apend a given string");
            System.out.println("b=insert in a given string");
            System.out.println("c=delete from two specified index");
            System.out.println("d=reverse the entire text");
            System.out.println("e=replace a portion betwee two specified portionh");



            System.out.println("Enter your choice");
            char choice = sc.nextLine().charAt(0);
            switch (choice) {
                case 'a':
                    System.out.println("Enter text to append");
                    sb.append(sc.nextLine());
                    System.out.println(sb);
                    break;
                case 'b':
                    System.out.println("Enter to insert");
                    sb.insert(2,"dog");
                    System.out.println(sb);
                    break;
                case 'c':
                    System.out.println("enter index to delete from a specified");
                    sb.delete(5, 10);
                    System.out.println(sb);
                    break;
                case 'd':
                    System.out.println("reverse a string");
                    sb.reverse();
                    System.out.println(sb);
                    break;
                case 'e':
                    System.out.println("insert a number between the String");
                    sb.replace(sc.nextInt(), sc.nextInt(), sc.nextLine());
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
/*
Output:-
a=apend a given string
b=insert in a given string
c=delete from two specified index
d=reverse the entire text
e=replace a portion betwee two specified portionh
Enter your choice
a
Enter text to append
ankit
ankit
 */
