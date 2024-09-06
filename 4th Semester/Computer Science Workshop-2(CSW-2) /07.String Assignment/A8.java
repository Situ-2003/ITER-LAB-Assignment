package Q8;
import java.util.*;
public class A8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.next();
        String s2= sc.next();
        String s3=s1.concat(s2);
        String s4=(s1+s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("Enter the index");
        int v= sc.nextInt();

        System.out.println(s3.charAt(v));
        System.out.println(s4.charAt(v));
    }
}
/*
Output:-
Ankit
Rout
AnkitRout
AnkitRout
Enter the index
4
t
t

 */
