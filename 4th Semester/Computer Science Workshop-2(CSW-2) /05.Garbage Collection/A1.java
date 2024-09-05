/*
    Ques:-Q1. Write a Java program illustrating garbage collection through an UnreachableObject class.
This class will include a constructor initializing an object with a given name, a show() method
creating an instance of UnreachableObject class and then invoking display(), a display()
method creating an UnreachableObject instance, and a main() method calling show()
followed by an explicit invocation of the garbage collector. Additionally, the program will
override the finalize() method to print the object's name upon successful garbage collection.

 */


public class A1 {
    static class UnreachableObject{
        String name;
        UnreachableObject(String name){
            this.name=name;
        }
        void display(){
            UnreachableObject obj=new UnreachableObject("Object");
            obj.show();
        }
        void show(){
            UnreachableObject obj=new UnreachableObject("Object");
            System.out.println("Name= "+obj.name);
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object "+name+" is Garbage collected");
            super.finalize();
        }

    }

    public static void main(String[] args) {
        UnreachableObject obj=new UnreachableObject("Main Object");
        obj.display();
        System.gc();
    }
}
/*
  Output=

  Name= Object
Object Object is Garbage collected
Object Object is Garbage collected
 */

