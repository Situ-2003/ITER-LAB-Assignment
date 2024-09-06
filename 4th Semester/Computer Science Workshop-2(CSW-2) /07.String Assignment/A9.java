package Q9;
import java.util.*;
public class A9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s1="my self situ";
        System.out.println("Search word");
        String search= sc.next();
        System.out.println(s1.indexOf(search));

        System.out.println("Enter replace word");
        int v=s1.indexOf(search);
        String replace=sc.next();
        String modified;
        if(v!=-1){
            String bs=s1.substring(0,v);
            String as=s1.substring(v+replace.length());
            modified=bs+replace+as;
        }
        else
            modified=s1;
        System.out.println(modified);
    }
}
/*
Output:-
Enter a sentence
Search word
self
3
Enter replace word
danger
my dangeritu

 */
