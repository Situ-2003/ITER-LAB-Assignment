package Q2;

public class A2 {
    public static void main(String[] args) {
        String first="Ankit";
        String second="Rout";
        System.out.println(first.concat(second));

        CharSequence cs="Java is fun";
        System.out.println(cs.length());
        System.out.println(cs.charAt(3));
        System.out.println(cs.subSequence(0,3));


    }
}
/*
Output:-
AnkitRout
11
a
Jav
 */
