/*
   Ques:-Q2. Develop a Java program showcasing reference reassignment and garbage collection using
the ReassigningReference class. This class features a constructor initializing an object with a
given name. In the main() method, two instances of ReassigningReference are created. Then,
the reference is reassigned. Subsequently, the garbage collector is explicitly invoked.
Additionally, the program overrides the finalize() method to print the name of the object upon
successful garbage collection.
 */

class ReassigningReference{
    String name;
    ReassigningReference(String name){
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object name "+name+" is garbage collector");
        super.finalize();
    }
}
public class A2 {
    public static void main(String[] args) {
        ReassigningReference obj1=new ReassigningReference("Object 1");
        ReassigningReference obj2=new ReassigningReference("Object 2");
        obj1=obj2;
        System.gc();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
/*
   output=
   Object name Object 1 is garbage collector
 */

