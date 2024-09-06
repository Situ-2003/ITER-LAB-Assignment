package Q6;
import java.util.*;
public class A6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter both the String");
        String first=sc.nextLine();
        String second=sc.nextLine();
        String f1=first.toLowerCase();
        String f2=first.toUpperCase();
        String s1=second.toLowerCase();
        String s2=second.toUpperCase();
        System.out.println("first Are the equal= "+f1.equals(f2));
        System.out.println("second Are the equals= "+s1.equals(s2));
    }
}
/*
Output:-
Enter both the String
Ankit
ankit
first Are the equal= false
second Are the equals= false
 */
