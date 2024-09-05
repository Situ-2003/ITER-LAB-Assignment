/*
   Ques:-Q5. Develop a Java class containing private data members of integer and double types, along
with methods for initializing, setting, and updating these data members. Create two objects of
this class, each calling the necessary methods to set or update the data members. Utilize the
Runtime class to calculate the total memory allocated and the memory occupied by the objects.
Employ any technique to make objects unreachable, hence eligible for garbage collection.
Finally, recheck the utilized and total memory using the Runtime class.
 */
class dataclass{
    private int ivalue;
    private double dvalue;
    dataclass(int i,double d){
        this.ivalue=i;
        this.dvalue=d;
    }

    public void setIvalue(int ivalue) {
        this.ivalue = ivalue;
    }

    public void setDvalue(double dvalue) {
        this.dvalue = dvalue;
    }
    public void updatevalue(int i,double d){
        this.ivalue+=i;
        this.dvalue+=d;
    }
}
public class A5 {
    public static void main(String[] args) {
        dataclass obj1=new dataclass(10,5.5);
        dataclass obj2=new dataclass(20,7.5);

        Runtime runtime=Runtime.getRuntime();
        long totalMemoryBefore= runtime.totalMemory();
        long freeMemoryBefory=runtime.freeMemory();
        long usedMemoryBefore=totalMemoryBefore-freeMemoryBefory;

        obj1=null;
        obj2=null;

        System.gc();
        long totalMemoryAfter=runtime.totalMemory();
        long freeMemoryAfter=runtime.freeMemory();
        long usedMemoryAfter=totalMemoryAfter-freeMemoryAfter;

        System.out.println("Memorhy used before GC= "+usedMemoryBefore);
        System.out.println("Memory used after GC= "+usedMemoryAfter);
        System.out.println("Total memory= "+totalMemoryAfter);


    }
}
/*
 Output=
 Memorhy used before GC= 2057016
Memory used after GC= 390464
Total memory= 64487424
 */

