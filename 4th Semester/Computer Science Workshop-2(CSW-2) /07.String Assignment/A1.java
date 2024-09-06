public class A1 {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";

        String str3=new String("Hello");
        System.out.println("Memory comparision");
        System.out.println("str1==str2 "+(str1==str2));
        System.out.println("str2==str3 "+(str1==str3));
        System.out.println("string comparision");
        System.out.println("str1.equals(str2) "+str1.equals(str2));
        System.out.println("str2.equals(str3) "+str1.equals(str3));
    }
}
/*
Output:-
Memory comparision
str1==str2 true
str2==str3 false
string comparision
str1.equals(str2) true
str2.equals(str3) true
 */
