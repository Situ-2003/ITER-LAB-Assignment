/*
  Q6. Write a memory-intensive program which creates a lot of objects. Try G1 collector on this
program. Print timestamp and heap size. Use the following commands to print the heap size
and free space.
Command to print total memory of heap:
Runtime.getRuntime().totalMemory();
Command to print free memory of heap:
Runtime.getRuntime().freeMemory();
*/

import java.util.*;
public class A6 {
    public static void main(String[] args) {
        List objectlist=new ArrayList<>();
        for (int i=0;i<1000000;i++){
            objectlist.add(new Object());
        }
        System.out.println("Time stamp "+System.currentTimeMillis());
        System.out.println("total time="+Runtime.getRuntime().totalMemory());
        System.out.println("free memory="+Runtime.getRuntime().freeMemory());
    }
}
/*
  Output=
  Time stamp 1725459307188
total time=64487424
free memory=37751232
 */

