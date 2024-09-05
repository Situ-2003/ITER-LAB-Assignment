class rectangle{
    private int length,width;
    public int getLength(){
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
class Q2 {
    public static void main(String[] args) {
        rectangle area=new rectangle();
        area.setLength(4);
        area.setWidth(6);
        System.out.println("length is "+area.getLength()+" width is "+area.getWidth());
        System.out.println("area is "+area.getLength()* area.getWidth());
        System.out.println(" perimeter is "+2*( area.getLength()+ area.getWidth()));
    }
}
/*
Output:-
length is 4 width is 6
area is 24
 perimeter is 20
 */
