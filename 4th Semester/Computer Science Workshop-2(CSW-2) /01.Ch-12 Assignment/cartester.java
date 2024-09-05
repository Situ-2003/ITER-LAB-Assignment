class car{
    private String make;
    private int model;
    car(String make,int model){
        this.make=make;
        this.model=model;
    }

    public int getModel() {
        return model;
    }
    public String getMake(){
        return make;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
class Q1{
    public static void main(String[] args) {
        car mycar1=new car("honda",2022);
        car mycar2=new car(null,0);
       // mycar1.show("india",2003);
        //mycar2.show(null,0);
        mycar1.setMake("india");
        mycar1.setModel(2003);
        mycar2.setMake("u.s.a");
        mycar2.setModel(2010);
        System.out.println("car1 make is "+mycar1.getMake()+" model is "+mycar1.getModel());
        System.out.println("car2 make is "+mycar2.getMake()+" model is "+mycar2.getModel());
    }
}
