interface Vehicle{
    void accelerate();
    void brake();
}
class Car implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("now the car is accelerate");
    }

    @Override
    public void brake() {
        System.out.println("now the car is in brake");
    }
}
class Bicycle implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("bicycle is accelerate");
    }

    @Override
    public void brake() {
        System.out.println("bicycle is in brake");
    }
    public void accelerate(int acc){
        System.out.println("aceelerate "+acc);
    }
}
public class Q8 {
    public static void main(String[] args) {
        Car obj1=new Car();
        Bicycle obj2=new Bicycle();
        obj1.accelerate();
        obj1.brake();
        obj2.accelerate();
        obj2.brake();
        obj2.accelerate(34);
    }
}
/*
Output:-
 */


