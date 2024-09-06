package Q7;
import java.util.*;
public class A7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();

        char c[]=s.toCharArray();
        System.out.println(c);

        System.out.println("Enter the word to search");
        char search=sc.nextLine().charAt(0);

        int firstposition=-1;
        for (int i=0;i<c.length;i++){
            if (c[i]==search) {
                firstposition = i;
                break;
            }
        }
        int lastposition=-1;
        for (int i=c.length-1;i>=0;i--){
            if (c[i]==search){
                lastposition=i;
                break;
            }
        }
        for (char v:c){
            System.out.println(v+" ");
        }
        System.out.println();
        if(firstposition!=-1){
            System.out.println(search+" is in "+firstposition);
        }
        else
            System.out.println(search+"not found");

        if (lastposition!=-1)
            System.out.println(search+" is in "+lastposition);
        else
            System.out.println(search+" not found");

    }
}
/*
Output:-
Enter the String
Ankit
Ankit
Enter the word to search
n
A
n
k
i
t

n is in 1
n is in 1
 */
