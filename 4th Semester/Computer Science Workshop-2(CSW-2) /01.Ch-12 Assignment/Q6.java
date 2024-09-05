abstract class LibraryResource{
    private String title,author;
    public LibraryResource(String t,String a){
        this.title=t;
        this.author=a;
    }
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
    public void settitle(String t){
        this.title=t;
    }
    public void setauthor(String a){
        this.author=a;
    }
    abstract void displayDetails();
}
class Book extends LibraryResource{
    int pageCount;
    public Book(String t,String a,int c){
        super(t,a);
        this.pageCount=c;
    }

    public int getPageCount(){
        return pageCount;
    }
    public void setPageCount(int p){
        this.pageCount=p;
    }
    public void displayDetails(){
        System.out.println("Booktitle= "+gettitle());
        System.out.println("Bookauthor= "+getauthor());
        System.out.println("page count= "+getPageCount());

    }
}
class Magazine extends LibraryResource {
    int issueDate;

    public Magazine(String t, String a, int d) {
        super(t, a);
        this.issueDate = d;
    }

    public int getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(int issueDate) {
        this.issueDate = issueDate;
    }

    public void displayDetails() {
        System.out.println("Booktitle= " + gettitle());
        System.out.println("Bookauthor= " + getauthor());
        System.out.println("issue date= " + getIssueDate());
    }
}
    class DVD extends LibraryResource{
        int duration;
        public DVD(String v,String x,int du){
            super(v,x);
            this.duration=du;
        }
        public int getDuration(){
            return duration;
        }
        public void setDuration(int du){
            this.duration=du;
        }

        public void displayDetails(){
            System.out.println("Booktitle= "+gettitle());
            System.out.println("Bookauthor= "+getauthor());
            System.out.println("duration= "+getDuration());
        }
    }

public class Q6 {
    public static void main(String[] args) {
        LibraryResource book=new Book("java","ankit",545) ;
        LibraryResource magazine=new Magazine("csw","situ",32);
        LibraryResource dvd=new DVD("math","ravi",432);
        book.displayDetails();
        magazine.displayDetails();
        dvd.displayDetails();
    }
}
/*
Output:-
Booktitle= java
Bookauthor= ankit
page count= 545
Booktitle= csw
Bookauthor= situ
issue date= 32
Booktitle= math
Bookauthor= ravi
duration= 432
 */

