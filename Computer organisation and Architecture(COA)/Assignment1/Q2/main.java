class laptop{
    private String model;
    private int price;
    public void setdata(String m,int p)
    {
        this.model=m;
        this.price=p;
    }
    public String toString(){
        return "model is "+model+" price is "+price;
    }
}
public class main {
    public static void main(String[] args) {
        laptop obj=new laptop();
        obj.setdata("hp",30000);
        System.out.println(obj);
    }
}
