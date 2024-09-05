/*
  Ques:-Q7. Create a Java program for university student enrollment. Use a Student class for course
management and student information. Implement efficient garbage collection for memory
management. Utilize Runtime class to monitor memory usage. Override finalize() method to
print a message on successful garbage collection
 */

import java.util.*;
class student{
    private String name;
    private int id;
    private ArrayList course;
    student(String n,int i){
        this.name=n;
        this.id=i;
        this.course=new ArrayList<>();
    }
    public void enrol(String courses){
        course.add(courses);
        System.out.println(name+" enrolled is "+courses);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name+" s object is garbage collected");
        super.finalize();
    }
}
public class A7 {
    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        long memorybefore,memoryafter;
        memorybefore=runtime.totalMemory()-runtime.freeMemory();
        student s1=new student("Ankit",1);
        student s2=new student("situ",2);

        s1.enrol("math");
        s2.enrol("physics");

        System.gc();
        memoryafter=runtime.totalMemory()-runtime.freeMemory();
        System.out.println("memory used after garbage cillection is "+(memoryafter-memorybefore));

    }
}

/*
  Output=
  Ankit enrolled is math
situ enrolled is physics
memory used after garbage cillection is -1353848
 */

