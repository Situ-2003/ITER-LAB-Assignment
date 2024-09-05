/*
   Ques:-Q4. Create a Java program demonstrating anonymous objects and garbage collection with the
AnonymousObject class. It includes a constructor initializing an object with a name. In
main(), an anonymous object is created, and the garbage collector is invoked. The finalize()
method prints the object's name upon successful garbage collection.
 */

class AnonymousObject{
    String name;
    AnonymousObject(String name){
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object "+name+" is Garbage collection");
        super.finalize();
    }
}
public class A4 {
    public static void main(String[] args) {
        new AnonymousObject("Example Object");
        System.gc();
    }
}
/*
  Output=
  Object Example Object is Garbage collection
 */
