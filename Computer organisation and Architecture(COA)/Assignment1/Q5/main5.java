class college{
    private String collegeName,collegeLoc;
    college(String n,String l){
        this.collegeName=n;
        this.collegeLoc=n;
    }
    void displayCollegeInfo(){
        System.out.println("College Name "+collegeName);
        System.out.println("Location "+collegeLoc);
    }
}
class student {
    int studentId;
    String studentName;
    student(int id,String name){
        this.studentId=id;
        this.studentName=name;
    }
    void displayStudentInfo(){
        System.out.println("Student id "+studentId);
        System.out.println("student name "+studentName);

    }
}
public class main5 {
    public static void main(String[] args) {
        student s1=new student(112,"Ankit");
        student s2=new student(321,"situ");
        college c1=new college("iter","bbsr");
        college c2=new college("kv","sbp");
        c1.displayCollegeInfo();
        s1.displayStudentInfo();
        c2.displayCollegeInfo();
        s2.displayStudentInfo();
    }
}
