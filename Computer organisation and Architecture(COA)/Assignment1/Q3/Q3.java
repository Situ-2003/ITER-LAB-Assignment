class point{
    private int X,Y;
    point(int x,int y){
        this.X=x;
        this.Y=y;
    }
    point(point other){
        this.X=other.getX();
        this.Y=other.getY();
    }
    public int getX(){
        return X;
    }

    public int getY() {
        return Y;
    }

    public void setX(int x) {
        this.X = x;
    }

    public void setY(int y) {
        this.Y = y;
    }
}
class Q3 {
    public static void main(String[] args) {
        point point1=new point(3,5);
        point point2=new point(point1);
        point1.setX(10);
        point1.setX(20);
        System.out.println("for point1 x="+point1.getX()+" y="+point1.getY());
        System.out.println("for point2 x="+point2.getX()+" y="+point2.getY());

    }
}
